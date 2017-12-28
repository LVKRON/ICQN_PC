package StartUI;

import javax.swing.JFrame;

public class StartUI extends JFrame {

	public void startUI() {
		this.setSize(300, 500);
		this.setTitle("ICQN START");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

		this.setVisible(true);
	}

}
