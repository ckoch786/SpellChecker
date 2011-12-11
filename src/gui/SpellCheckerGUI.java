package gui;

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

public class SpellCheckerGUI {

	private  JFrame     frame;
	private  JTextArea  textArea;

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
	class CheckSpellingListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
	       textArea.append("Hello World!"); 
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Spell Checker App.");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar     menuBar          = new JMenuBar();
		JMenu        mnFile           = new JMenu("File");
		JMenuItem    mntmAbout        = new JMenuItem("About");
		JPanel       panel            = new JPanel();
		JProgressBar progressBar      = new JProgressBar();
		JScrollPane  scrollPane       = new JScrollPane();
		JPanel       panel_1          = new JPanel();
		JButton      btnCheckSpelling = new JButton("Check Spelling");
		
		Component    rigidArea        = Box.createRigidArea(new Dimension(20, 20));
	    textArea         = new JTextArea();
		
		frame.setJMenuBar(menuBar);
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		
		menuBar.add(mnFile);
		menuBar.add(mntmAbout);
		
		panel.add(btnCheckSpelling);
		panel.add(rigidArea);
		panel.add(progressBar);
	
		panel_1.add(scrollPane);
		
		textArea.setRows(14);
		textArea.setColumns(38);
		scrollPane.setViewportView(textArea);
		
		
		
		
		//Register Listeners
		CheckSpellingListener l1 = new CheckSpellingListener();
		btnCheckSpelling.addActionListener(l1);
		
	}
	

}
