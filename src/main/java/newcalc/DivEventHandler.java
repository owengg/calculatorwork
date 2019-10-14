package newcalc;

import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DivEventHandler implements ActionListener {
	TextField TXT1,TXT2,TXT3; Label error;
	public DivEventHandler(TextField T1, TextField T2, TextField T3, Label E) {
		TXT1=T1;
		TXT2=T2;
		TXT3=T3;
		error=E;
	}
	public void actionPerformed(ActionEvent E) {
		int No1,No2,Result;
		try {
			Result=Integer.parseInt(TXT1.getText())/Integer.parseInt(TXT2.getText());
			TXT3.setText(Integer.toString(Result));
		}
		catch(NumberFormatException ERR) {
			error.setText("Digits only pls");	
		}
		catch(ArithmeticException ERR) {
			error.setText("No div by zero pls");	
		}
	}
}