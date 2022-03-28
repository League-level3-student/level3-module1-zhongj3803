package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
	/*
	 * Crate a HashMap of Integers for the keys and Strings for the values. Create a
	 * GUI with three buttons. Button 1: Add Entry When this button is clicked, use
	 * an input dialog to ask the user to enter an ID number. After an ID is
	 * entered, use another input dialog to ask the user to enter a name. Add this
	 * information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID When this button is clicked, use an input dialog to
	 * ask the user to enter an ID number. If that ID exists, display that name to
	 * the user. Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List When this button is clicked, display the entire list in a
	 * message dialog in the following format: ID: 123 Name: Harry Howard ID: 245
	 * Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
	 * 
	 * When this is complete, add a fourth button to your window. Button 4: Remove
	 * Entry When this button is clicked, prompt the user to enter an ID using an
	 * input dialog. If this ID exists in the HashMap, remove it. Otherwise, notify
	 * the user that the ID is not in the list.
	 */
	public static void main(String[] args) {
		_02_LogSearch ls = new _02_LogSearch();
	}
	HashMap<Integer, String> hash = new HashMap<Integer, String>();
	JButton button1 = new JButton("Add Entry");
	JButton button2 = new JButton("Search by ID");
	JButton button3 = new JButton("View List");
	JButton button4 = new JButton("Remove Entry");
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	_02_LogSearch(){
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button1) {
			int id = Integer.parseInt(JOptionPane.showInputDialog("Please enter an ID number"));
			String name = JOptionPane.showInputDialog("Please enter a name");
			hash.put(id, name);
		}
		
		if (e.getSource() == button2) {
			int id = Integer.parseInt(JOptionPane.showInputDialog("Please enter an ID number"));
			boolean isIn = false;
			int z = 0;
			for (Integer i : hash.keySet()) {
				if (id == i) {
					isIn = true;
					z=i;
				}
			}
			if (isIn) {
				JOptionPane.showMessageDialog(null,hash.get(z));
			}
			else {
				JOptionPane.showMessageDialog(null,"That entry does not exist");
			}
		}
		if (e.getSource() == button3) {
			String s = "";
			for (Integer i : hash.keySet()) {
				s+="ID: " + i + " Name: " + hash.get(i)+"\n";
			}
			JOptionPane.showMessageDialog(null, s);
		}
		if (e.getSource() == button4) {
			int id = Integer.parseInt(JOptionPane.showInputDialog("Please enter an ID number"));
			boolean isIn = false;
			int z = 0;
			for (Integer i : hash.keySet()) {
				if (id == i) {
					isIn = true;
					z=i;
				}
			}
			if (isIn) {
				hash.remove(z);
			}
			else {
				JOptionPane.showMessageDialog(null,"That entry does not exist");
			}
		}
	}

}
