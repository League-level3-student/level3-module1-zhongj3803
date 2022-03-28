package _00_Intro_To_ArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
	/*
	 * Create a GUI with two buttons. One button reads "Add Name" and the other
	 * button reads "View Names". When the add name button is clicked, display an
	 * input dialog that asks the user to enter a name. Add that name to an
	 * ArrayList. When the "View Names" button is clicked, display a message dialog
	 * that displays all the names added to the list. Format the list as follows:
	 * Guest #1: Bob Banders Guest #2: Sandy Summers Guest #3: Greg Ganders Guest
	 * #4: Donny Doners
	 */
	public static void main(String[] args) {
		_02_GuestBook g = new _02_GuestBook();
	}
	ArrayList<String> names = new ArrayList<String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton("Add Name");
	JButton button2 = new JButton("View Names");

	_02_GuestBook() {
		button1.addActionListener(this);
		button2.addActionListener(this);
		panel.add(button1);
		panel.add(button2);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.pack();
	}
	// when add name is clicked

	// when view names is clicked

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button1) {
			String s = JOptionPane.showInputDialog("Please enter a name");
			names.add(s);
		}
		if (e.getSource() == button2) {
			String n = "";
			for (int i = 0; i < names.size(); i++) {
				n += "Guest #" + (i + 1) + ": " + names.get(i) + "\n";
			}
			JOptionPane.showMessageDialog(null, n);
		}
	}

}
