package StartUI;

import javax.swing.JTextField;

public class StartUITools {

	private StartUITools() {
	}

	public static byte[] userID_Burn(JTextField userID) {
		byte[] userid;
		String userid_1 = userID.getText();
		userid = userid_1.getBytes();

		return userid;
	}

	public static byte[] userPsd_Burn(JTextField userPsd) {
		byte[] userpsd;
		String userpsd_1 = userPsd.getText();
		userpsd = userpsd_1.getBytes();

		return userpsd;
	}

}
