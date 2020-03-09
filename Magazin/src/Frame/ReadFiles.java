package Frame;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class ReadFiles extends JFrame {
	ArrayList<String> Menue1 = new ArrayList<>();
	ArrayList<String> Menue2 = new ArrayList<>();
	ArrayList<String> products = new ArrayList<>();
	String productString;
	DefaultMutableTreeNode node;
	JTree tree = new JTree();
	BufferedReader reader;

	public ReadFiles(String welcome) {

	}

	public void Categories()  {
		try {
			reader = new BufferedReader(new FileReader("src/Product.file"));
			String line = reader.readLine();
			while (line!=null) {
				if (line.contains("</")) {
					line = line.replace("</", "");
					line = line.replace(">", "");
					Menue1.add(line);
				}
				line = reader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void createTree() throws IOException {
		Categories();
		reader = new BufferedReader(new FileReader("src/Product.file"));
		
		tree.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("List") {
			{
				String line = reader.readLine();
				String LastLine = null;
				for (int i = 0; i < Menue1.size(); i++) {
					node = new DefaultMutableTreeNode(Menue1.get(i));
					add(node);
					while (line!=null) {
						
						if (line.contains("<" + Menue1.get(i) + ">")) {
							line = reader.readLine();
							while (!line.contains("</" + Menue1.get(i) + ">")) {
								if (line.contains("_")) {
									line = line.replace("_", "");
									Menue2.add(line);
									node.add(new DefaultMutableTreeNode(line));
								}
								line = reader.readLine();
								LastLine = null;
							}
						} else {
							LastLine = line;
							break;
						}
						
						if (LastLine != null) {
							line = LastLine;
						} else {
							line = reader.readLine();
						}
					}
				}

			}
		}));
		reader.close();
	}

	public void getProducts(Object selected) {
		try {
			products.clear();
			reader = new BufferedReader(new FileReader("src/Product.file"));
			String line = reader.readLine();
			String cat = selected.toString().trim();
			while (line!=null) {
				
				if (line.contains("_" + cat)) {
					line = reader.readLine();
					while (line.isEmpty()) {
						line = reader.readLine();
					}
					while (line.contains("*")) {
						line.trim();
						line = line.replace("*", "");
						products.add(line);
						line = reader.readLine();
					}
				}
				line = reader.readLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}