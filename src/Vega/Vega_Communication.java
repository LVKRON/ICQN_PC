package Vega;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import Messege.*;

public class Vega_Communication extends Thread{

	private Messege in_Msg = new Messege();
	private Messege out_Msg = new Messege();
	private boolean control_flag_out = false;
	private boolean control_flag = true;
	private Socket client;
	private DataInputStream dins;
	private DataOutputStream dous;
	
	public Vega_Communication(String host, int port) throws UnknownHostException, IOException {
		this.client = new Socket(host, port);
		this.dins = new DataInputStream(client.getInputStream());
		this.dous = new DataOutputStream(client.getOutputStream());
	}
	
	public void setOut_Msg(Messege out_Msg) {
		this.out_Msg = out_Msg;
	}

	public void setControl_flag_out(boolean control_flag_out) {
		this.control_flag_out = control_flag_out;
	}

	public void run() {
		try {
			process();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void process() throws IOException {
		while(true) {
			if(control_flag_out == true) {
				PackageTools.packMsg(this.out_Msg, this.dous);
				control_flag_out = false;
			}
			in_Msg = UnPackageTools.unpackMsg(dins);
			//写一个类来解决显示分包问题
			if(control_flag == false) {
				closeMe();
				break;
			}
		}
	}
	
	private void closeMe() throws IOException {
		this.client.close();
	}
	
}
