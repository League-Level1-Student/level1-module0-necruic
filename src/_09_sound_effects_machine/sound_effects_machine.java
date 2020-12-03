package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class sound_effects_machine implements ActionListener {
	JButton button1 = new JButton ();
    JButton button2 = new JButton ();
    JButton button3 = new JButton ();
public static void main(String[] args) {
	sound_effects_machine machine = new sound_effects_machine();
	machine.showButton();
}
public void showButton() {
    JFrame frame = new JFrame ();
    JPanel panel = new JPanel ();   
    panel.add(button1);
    panel.add(button2);
    panel.add(button3);
    frame.add(panel);
    button1.setText("Computer start up");
    button1.addActionListener(this);
    button2.setText("Drop fork");
    button2.addActionListener(this);
    button3.setText("fog horn");
    button3.addActionListener(this);
    frame.pack();
    frame.setTitle("Sound effects machine");
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
private void playSound(String fileName) {
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
    sound.play();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == button1){
JOptionPane.showMessageDialog(null, "computer start up");
	}
	else if(e.getSource() == button2){
		JOptionPane.showMessageDialog(null, "drop fork");
	}
		else if(e.getSource() == button3){
			JOptionPane.showMessageDialog(null, "fog horn");
		}
}
}
