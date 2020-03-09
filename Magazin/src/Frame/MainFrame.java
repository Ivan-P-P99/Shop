package Frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;


	public class MainFrame extends ReadFiles {
		

		public static void main(String[] args) throws IOException {
			
			new MainFrame();
			
		}
		

		

		public MainFrame() throws IOException  {
			super("NonStop");
			getContentPane().setLayout(new BorderLayout());
			
			JLabel WLabel = new JLabel("NonStop PAPI ");
			WLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
			WLabel.setHorizontalAlignment(SwingConstants.CENTER);
			createTree();
			getContentPane().add(WLabel,BorderLayout.CENTER);
			
	        
			getContentPane().add(tree, BorderLayout.WEST);
			
			  tree.addMouseListener(new MouseAdapter() {
		            public void mouseClicked(MouseEvent e) {
		                if (e.getClickCount() == 2) {
		                    tree.getLastSelectedPathComponent();
		                    Object nodeInfo = node.getUserObject();
		                    getProducts(nodeInfo);
		                  new VodkaFrame();
		                }
		            }
		        });
			setSize(600, 500);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			
			
		}
		
	}

