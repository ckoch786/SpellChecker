package gui;
import spellChecker.SpellChecker;
import hash.HashTable;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.ScrollPane;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JScrollBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
/**
 * 
 * @author Cory Koch
 * @author Carl Bohman
 *
 */
public class SpellCheckerGUI {

	private  JFrame     frame;
	private  JTextArea  textAreaMissSpelled;
	private   JTextArea textAreaSuggested;
	private   JTextArea textAreaAbout;
	//private   JDialog   popupAbout;
	private   JPanel    panel_3;
    SpellChecker sp;
    HashTable    ht;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SpellCheckerGUI window = new SpellCheckerGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SpellCheckerGUI() {
		initialize();
	}
	/**
	 * <p>
	 * MenuAboutListener defines the action for the mntmAbout
	 * in the menu, it displays a short message about the application
	 * and names the creators.
	 * </p>
	 *
	 */
	/*
	class MenuAboutListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			popupAbout = new JDialog();
			popupAbout.setVisible(true);
			panel_3    = new JPanel();
			popupAbout.setLocationRelativeTo(frame);
			popupAbout.setSize(300,300);
			popupAbout.add(panel_3);
			
			textAreaAbout = new JTextArea();
			textAreaAbout.setRows(3);
			textAreaAbout.setColumns(15);
			panel_3.add(textAreaAbout);
			
			String about = "Just a simple spell checker." +
					"\n Created by: Carl Bohman and Cory Koch";
			
			textAreaAbout.append(about);
		}
	}*/
	/**
	 * <p>
	 * CheckSpellingListener defines the action for the btnCheckSpelling.
	 * Which in this case is an implementation of the HashTable class
	 *</p>
	 */
	class CheckSpellingListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		   String dictvalues, docvalues;
		   String dict[];
		   String doc[];
		   int  docLength, dictLength;
		   sp = new SpellChecker();
			
		   dictvalues = null; 
		   docvalues  = null;
		   docLength  = 0;
		   dictLength = 0;
		   dict = new String[2744];
		   try {
			   dictvalues = SpellChecker.readFile("Dictionary.txt");
			   dict       = SpellChecker.getWords(dictvalues);
			   dictLength = SpellChecker.table_size; 
		   }catch (FileNotFoundException e1) {
			   textAreaMissSpelled.append("File not found");
			 }
		   dict = SpellChecker.getWords(dictvalues);			
		  
		   try {
			    docvalues = SpellChecker.readFile("MyDocument.txt");
				doc       = SpellChecker.getWords(docvalues);
				docLength = SpellChecker.table_size;
		   }catch (FileNotFoundException e1) {
			   textAreaMissSpelled.append("File not found");
		   }
		   doc = SpellChecker.getWords(docvalues);
		  
		   ht = new HashTable();
		   //Insert the Dictionary into the hash table
		   for (int i = 0; i < dictLength; i++){		
			   ht.Insert(dict[i]);											
		   }
           //Check the spelling of the doc against the dictionary		 
		   for(int z = 0; z < docLength; z++){
			    if(!ht.Contains(doc[z])) textAreaMissSpelled.append(doc[z] + "\n");
		   }
		}
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Spell Checker App.");
		frame.setBounds(100, 100, 501, 368);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar     menuBar          = new JMenuBar();
		JMenu        mnFile           = new JMenu("File");
		JMenuItem    mntmAbout        = new JMenuItem("About");
		JPanel       panel            = new JPanel();
		JProgressBar progressBar      = new JProgressBar();
		JButton      btnCheckSpelling = new JButton("Check Spelling");
		JPanel       panel_1          = new JPanel();
		JPanel       panel_2          = new JPanel();
		JScrollPane  scrollPane       = new JScrollPane();
		JScrollPane  scrollPane_1     = new JScrollPane();
		JLabel       lblMissSpelled;
		JLabel       lblSuggested;
		Component    rigidArea        = Box.createRigidArea(new Dimension(20, 20));
		
		frame.setJMenuBar(menuBar);
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
		frame.getContentPane().add(panel_1, BorderLayout.WEST);
		frame.getContentPane().add(panel_2, BorderLayout.CENTER);
		
		//Menu bar
		menuBar.add(mnFile);
		menuBar.add(mntmAbout);
		//Buttons panel
		panel.add(btnCheckSpelling);
		panel.add(rigidArea);
		panel.add(progressBar);
		
	    //Miss Spelled Panel	
		panel_1.add(scrollPane);
		textAreaMissSpelled           = new JTextArea();
		textAreaMissSpelled.setForeground(Color.red);
		textAreaMissSpelled.setRows(15);
		textAreaMissSpelled.setTabSize(4);
		textAreaMissSpelled.setColumns(15);
		panel_1.add(textAreaMissSpelled);
		lblMissSpelled = new JLabel("Miss Spelled");
		panel_1.add(lblMissSpelled);
	    
		// Suggestions Panel
		panel_2.add(scrollPane_1);
		textAreaSuggested             = new JTextArea(); 
		textAreaSuggested.setRows(15);
		textAreaSuggested.setColumns(15);
		panel_2.add(textAreaSuggested);
		lblSuggested = new JLabel("Suggestions");
		panel_2.add(lblSuggested);
		
		//Register Listeners
		CheckSpellingListener l1 = new CheckSpellingListener();
		//MenuAboutListener     l2 = new MenuAboutListener(); 
		btnCheckSpelling.addActionListener(l1);
		//mntmAbout.addActionListener(l2);	
	}
}
