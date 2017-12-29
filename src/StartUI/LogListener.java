package StartUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import Messege.LoginMsg;

public class LogListener implements ActionListener {

	private JTextField userID;
	private JTextField userPsd;
	LoginMsg logMsg = new LoginMsg();

	public LoginMsg getLogMsg() {
		return logMsg;
	}

	public LogListener(JTextField userID, JTextField userPsd) {
		this.userID = userID;
		this.userPsd = userPsd;
	}

	public void actionPerformed(ActionEvent e) {
		byte[] userid = StartUITools.userID_Burn(userID);
		byte[] userpsd = StartUITools.userPsd_Burn(userPsd);

		logMsg.setReceiverID(userid);// 随意填写
		logMsg.setSenderID(userid);
		logMsg.setUserID(userid);
		logMsg.setUserPassword(userpsd);
	}

}
