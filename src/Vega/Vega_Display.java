package Vega;

import Messege.*;

public class Vega_Display extends Thread{

	private boolean control_flag = true;
	private boolean display_flag = false;
	private Messege this_Messege;
	
	public void run() {
		process();
	}

	public void setDisplay_flag(boolean display_flag) {
		this.display_flag = display_flag;
	}

	public void setControl_flag(boolean control_flag) {
		this.control_flag = control_flag;
	}

	public void setThis_Messege(Messege this_Messege) {
		this.this_Messege = this_Messege;
	}



	private void process() {
		while(control_flag) {
			
		}
	}
	
}
