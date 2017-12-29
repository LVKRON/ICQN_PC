package MainUI;

import javax.swing.JTextField;

public class MainUITools {

	private MainUITools() {
	}

	public static byte[] words_Burn(JTextField inputText) {

		byte[] words;
		String words_1 = inputText.getText();
		words = words_1.getBytes();

		return words;

	}

	public static void view_Burn(JTextField viewText, byte[] words) {
		// 提前需要将messege的words变成string添加上发送人等再变成byte[]
		String words_1 = words.toString();
		viewText.setText(words_1);

	}

}
