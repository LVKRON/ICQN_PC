package MainUI;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainUI extends JFrame {

	private JTextField viewText = new JTextField();
	private JTextField inputText = new JTextField();
	private JButton sendBtn = new JButton();
	private JButton menuBtn = new JButton();
	private JList contactsList = new JList();

	private Dimension vT_Size = new Dimension(450, 350);
	private Dimension iT_Size = new Dimension(450, 80);
	private Dimension sB_Size = new Dimension(100, 30);
	private Dimension mB_Size = new Dimension(100, 30);
	private Dimension cL_size = new Dimension(150, 431);

	public JTextField getViewText() {
		return viewText;
	}

	public JTextField getInputText() {
		return inputText;
	}

	public JList getContactsList() {
		return contactsList;
	}

	private JPanel ePanel = new JPanel();
	private JPanel wPanel = new JPanel();

	private Dimension eP_Size = new Dimension(450, 500);
	private Dimension wP_Size = new Dimension(150, 500);

	public void mainUI() {

		this.setTitle("ICQN MAIN");
		this.setSize(600, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);

		contactsList.setPreferredSize(cL_size);
		sendBtn.setPreferredSize(sB_Size);
		menuBtn.setPreferredSize(mB_Size);
		viewText.setPreferredSize(vT_Size);
		inputText.setPreferredSize(iT_Size);

		wPanel.setPreferredSize(wP_Size);
		wPanel.add(contactsList);

		ePanel.setPreferredSize(eP_Size);
		ePanel.add(viewText);
		ePanel.add(inputText);
		ePanel.add(sendBtn);
		ePanel.add(menuBtn);

		this.add(ePanel, BorderLayout.EAST);
		this.add(wPanel, BorderLayout.WEST);

		this.setVisible(true);

	}

}
