package calcplusword;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConEventHandler implements ActionListener {
	TextField TXT1,TXT2,TXT3,TXT4; Label error;
	public ConEventHandler(TextField T1, TextField T2, TextField T3, TextField T4, Label E) {
		TXT1=T1;
		TXT2=T2;
		TXT3=T3;
		TXT4=T4;
		error=E;
	}
	public void actionPerformed(ActionEvent E) {
		int No1,No2,Result;
		try {
			Result=Integer.parseInt(TXT3.getText());
			TXT4.setText(Integer.toString(Result));
//			if(Result==24) {
//				TXT4.setText("Twenty Four");
//			}
		}
		catch(NumberFormatException ERR) {
			error.setText("Digits only pls");	
		}
		
	}
}