

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;



import javax.swing.*;


public class WebMain {
	
	static String URL;
	static String URL2;
	
	public static void main(String[] args) {

		
		
		
			JEditorPane browserPane = new JEditorPane();
			JEditorPane browserPane2 = new JEditorPane();
			
			browserPane.setEditable(false); 
			browserPane2.setEditable(false);
			
			JPanel SearchEngine = new JPanel();
			JPanel SearchEngine2 = new JPanel();
			
			SearchEngine.setBorder(null);
			SearchEngine2.setBorder(null);
			
			JTabbedPane Tab1 = new JTabbedPane();
			
		
	
			JTextField Search = new JTextField("http://graceland.brightspace.com",90);
			
			JTextField Search2 = new JTextField("http://graceland.brightspace.com",90);
			
			JButton Enter = new JButton("Search");
			JButton Enter2 = new JButton("Search");
			
			JButton Back = new JButton("Back");
			JButton Back2 = new JButton("Back");
			
			SearchEngine.add(Search);
			SearchEngine2.add(Search2);
			
			SearchEngine.add(Back);
			SearchEngine2.add(Back2);
			
			SearchEngine.add(Enter);
			SearchEngine2.add(Enter2);
			
			Tab1.addTab("Tab 1",null, SearchEngine);
			Tab1.addTab("Tab 2",null, SearchEngine2);
			
			SearchEngine.add(browserPane);
			SearchEngine2.add(browserPane2);
			
			Enter.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						browserPane.setPage(Search.getText());
					
						
						}catch (IOException e1) {
							System.out.println("error loading page");
							}
				}
			});
			
			Enter2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						browserPane2.setPage(Search2.getText());
					
						
						}catch (IOException e1) {
							System.out.println("error loading page");
							}
				}
			});
		
			
			try {
				browserPane.setPage(Search.getText());
			
				
				}catch (IOException e) {
					System.out.println("error loading page");
					}
			try {
				browserPane2.setPage(Search2.getText());
			
				
				}catch (IOException e) {
					System.out.println("error loading page");
					}
			
			
			
			JFrame browserWindow = new JFrame("Kerwin's Web Browser");
			
			browserWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	
			browserWindow.add(Tab1);
			
			
			browserWindow.setSize(1200,900);
			
			browserWindow.setVisible(true);
			
		
			
			
			
			}
	
			
		}
	

