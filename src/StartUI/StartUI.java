package StartUI;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class StartUI extends JFrame {

	private JTextField userID = new JTextField();
	private JTextField userPsd = new JTextField();
	private JButton logBtn = new JButton();
	private JButton regBtn = new JButton();

	private Dimension userID_Size = new Dimension(230, 40);
	private Dimension userPsd_Size = new Dimension(230, 40);
	private Dimension logBtn_Size = new Dimension(90, 30);
	private Dimension regBtn_size = new Dimension(90, 30);

	private JPanel cPanel = new JPanel();
	// private JPanel sPanel = new JPanel();
	private JPanel nPanel = new JPanel();

	private Dimension nPanel_Size = new Dimension(300, 260);
	// private Dimension sPanel_Size = new Dimension(300, 100);

	public void startUI() {
		this.setSize(300, 500);
		this.setTitle("ICQN START");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

		userID.setText("userID");
		userID.setPreferredSize(userID_Size);
		userPsd.setText("userPsd");
		userPsd.setPreferredSize(userPsd_Size);

		cPanel.add(userID);
		cPanel.add(userPsd);

		logBtn.setText("login");
		logBtn.setPreferredSize(logBtn_Size);
		regBtn.setText("register");
		regBtn.setPreferredSize(regBtn_size);

		cPanel.add(logBtn);
		cPanel.add(regBtn);

		nPanel.setPreferredSize(nPanel_Size);
		// sPanel.setPreferredSize(sPanel_Size);

		this.add(nPanel, BorderLayout.NORTH);
		this.add(cPanel, BorderLayout.CENTER);
		// this.add(sPanel, BorderLayout.SOUTH);

		this.setVisible(true);
	}

	public JTextField getUserID() {
		return userID;
	}

	public JTextField getUserPsd() {
		return userPsd;
	}

}
