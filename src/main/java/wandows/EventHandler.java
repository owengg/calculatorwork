package wandows;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class EventHandler implements ActionListener {
	TextField TXT1,TXT2,TXT3; Label error;
	public EventHandler(TextField T1, TextField T2, TextField T3, Label E) {
		TXT1=T1;
		TXT2=T2;
		TXT3=T3;
		error=E;
	}
	public void actionPerformed(ActionEvent AE) {
		int A,B,C;
		A=B=C=0;
		Button Btn;
		Btn=(Button)AE.getSource();
		String sign=Btn.getLabel();
		try {
		A=Integer.parseInt(TXT1.getText());
		B=Integer.parseInt(TXT2.getText());
		if(sign.equals("+")) {
			C=A+B;
		}
		if(sign.equals("-")) {
			C=A-B;
		}
		if(sign.equals("x")) {
			C=A*B;
		}
		if(sign.equals("/")) {
			C=A/B;
		}
	
			TXT3.setText(Integer.toString(C));
		}
		catch(NumberFormatException ERR) {
			error.setText("Digits only pls");
			
		}
	}
}