package MainUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import Messege.ChatMsg;

public class sendListener implements ActionListener {

	private JTextField inputText;
	private ChatMsg chatMsg = new ChatMsg();

	public ChatMsg getChatMsg() {
		return chatMsg;
	}

	public sendListener(JTextField inputText) {
		this.inputText = inputText;
	}

	public void actionPerformed(ActionEvent e) {
		String words = inputText.getText();
		byte[] words_1 = words.getBytes();
		chatMsg.setReceiverID(null);// 必须完善接收者id
		chatMsg.setSenderID(null);// 必须完善发送者id
		chatMsg.setWords(words_1);

	}

}
