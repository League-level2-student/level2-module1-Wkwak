package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	JButton b1 = new JButton("Add Name");
	JButton b2 = new JButton("View Names");
	
	ArrayList<String> names= new ArrayList<>();
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	public static void main(String[] args) {
		GuestBook book = new GuestBook();
		book.gui();
	}
	
	public void gui() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(b1);
		panel.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getActionCommand().equals("Add Name")) {
			String nameInput = JOptionPane.showInputDialog("Enter a name");
			names.add(nameInput);
		}
		else if(arg0.getActionCommand().equals("View Names")) {
			for(int i = 1; i <= names.size(); i++) {
				System.out.println("Guest #" + i + ": " + names.get(i-1));
			}
		}
	}
}
