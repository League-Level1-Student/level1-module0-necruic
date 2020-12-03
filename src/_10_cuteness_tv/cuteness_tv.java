package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class cuteness_tv implements ActionListener {
	JButton buttonducks = new JButton();
    JButton buttonfrog = new JButton();
    JButton buttonfluffy = new JButton();
public static void main(String[] args) {
	cuteness_tv ctv = new cuteness_tv();
	ctv.showButton();
}
void showDucks() {
    playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
}

void showFrog() {
    playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
}

void showFluffyUnicorns() {
    playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
}

void playVideo(String videoID) {
    
    // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't
    //work on some Linux implementations
    try {
    if (System.getProperty("os.name").toLowerCase().contains("linux")) {
    if (Runtime.getRuntime().exec(new String[] {
     "which", "xdg- open" }).getInputStream().read() != -1) {
    Runtime.getRuntime().exec(new String[] { "xdg-open", videoID });
    }
    } else {
         URI uri = new URI(videoID);
         java.awt.Desktop.getDesktop().browse(uri);
    }      } catch (Exception e) {
         e.printStackTrace();
    }
}

public void showButton() {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	frame.add(panel);
	buttonducks.setText("Ducks");
    buttonfrog.setText("Frog");
    buttonfluffy.setText("Fluffy Unicorns");
	panel.add(buttonducks);
	panel.add(buttonfluffy);
	panel.add(buttonfrog);
    frame.pack();
    frame.setVisible(true);
    buttonducks.addActionListener(this);
    buttonfrog.addActionListener(this);
    buttonfluffy.addActionListener(this);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == buttonducks){
		JOptionPane.showMessageDialog(null, "ducks");
			}
	else if(e.getSource() == buttonfrog){
		JOptionPane.showMessageDialog(null, "frog");
	}
	else if(e.getSource() == buttonfluffy){
		JOptionPane.showMessageDialog(null, "fluffy unicorn");
	}

}
}



