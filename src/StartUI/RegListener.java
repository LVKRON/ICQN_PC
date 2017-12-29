package StartUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import Messege.RegisterMsg;

public class RegListener implements ActionListener {

	private JTextField userID;
	private JTextField userPsd;
	RegisterMsg regMsg = new RegisterMsg();

	public RegisterMsg getRegMsg() {
		return regMsg;
	}

	public RegListener(JTextField userID, JTextField userPsd) {
		this.userID = userID;
		this.userPsd = userPsd;
	}

	public void actionPerformed(ActionEvent e) {
		byte[] userid = StartUITools.userID_Burn(userID);
		byte[] userpsd = StartUITools.userPsd_Burn(userPsd);

		regMsg.setReceiverID(userid);// 随意填写
		regMsg.setSenderID(userid);
		regMsg.setUserID(userid);
		regMsg.setUserPassword(userpsd);
	}

}
