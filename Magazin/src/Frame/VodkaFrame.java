package Frame;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class VodkaFrame extends ReadFiles {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private ImageIcon img;
	
	public static void main(String[] args) {
		new VodkaFrame();
	}
	
	
	public VodkaFrame(){
		super("Product!!!");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setText("0");
		textField.setBounds(69, 137, 64, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("-");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num = Integer.parseInt(textField.getText());
				if (num>0) {
					num -=1;
					textField.setText(""+num);
					repaint();
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.setBounds(26, 136, 43, 22);
		getContentPane().add(btnNewButton);
		
		JButton button = new JButton("+");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(textField.getText())+1;
				textField.setText(""+num);
				repaint();
			}
		});
		button.setBounds(134, 137, 50, 20);
		getContentPane().add(button);
		
		
		
		JButton button_1 = new JButton("-");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num = Integer.parseInt(textField_1.getText());
				if (num>0) {
					num -=1;
					textField_1.setText(""+num);
					repaint();
				}
				
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button_1.setBounds(252, 136, 43, 22);
		getContentPane().add(button_1);
		
		textField_1 = new JTextField();
		textField_1.setText("0");
		textField_1.setColumns(10);
		textField_1.setBounds(294, 137, 64, 20);
		getContentPane().add(textField_1);
		
		JButton button_2 = new JButton("+");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(textField_1.getText())+1;
				textField_1.setText(""+num);
				repaint();
			}
		});
		button_2.setBounds(358, 137, 50, 20);
		getContentPane().add(button_2);
		
		
		JButton AddSavoy = new JButton("Add");
		AddSavoy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		AddSavoy.setBounds(69, 156, 64, 20);
		
		getContentPane().add(AddSavoy);
		
		JButton AddBelvedere = new JButton("Add");
		AddBelvedere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			}
		});
		AddBelvedere.setBounds(294, 156, 64, 20);
		getContentPane().add(AddBelvedere);
		
		JLabel image = new JLabel();
		image.setIcon(new ImageIcon("img/savoy.jpg"));

		image.setBounds(26, 11, 158, 99);
		getContentPane().add(image);
		
		JLabel lblNewLabel_1 = new JLabel("2 img");
		lblNewLabel_1.setBounds(252, 11, 156, 99);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("1 text");
		lblNewLabel_2.setBounds(26, 113, 158, 22);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblText = new JLabel("2 text");
		lblText.setBounds(252, 121, 158, 22);
		getContentPane().add(lblText);
		setVisible(true);
		
		/*img = new ImageIcon(getClass().getResource("absolute.jpg"));
		JLabel= new JLabel(img);
		ImgLabel.setBounds(10, 22, 123, 71);
		getContentPane().add(ImgLabel);*/
	}
}
