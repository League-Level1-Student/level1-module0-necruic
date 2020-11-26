package _09_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class sound_effects_machine implements ActionListener {
public static void main(String[] args) {
	
}
public void showButton() {
    JFrame frame = new JFrame ();
    JPanel panel = new JPanel ();
    JButton button1 = new JButton ();
    JButton button2 = new JButton ();
    JButton button3 = new JButton ();
    frame.add(panel);
    panel.add(button1);
    panel.add(button2);
    panel.add(button3);
    button1.setText("Computer start up");
    button1.addActionListener(this);
    button2.setText("Drop fork");
    button2.addActionListener(this);
    button3.setText("fog horn");
    button3.addActionListener(this);
    frame.pack();
    frame.setTitle("Sound effects machine");
}
public void playsound() {
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
