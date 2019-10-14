package bestcalculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class EventHandler implements ActionListener {
	TextField TXT1; 
	int A=0,B=0,C=0, D=0;
//	Label error;
	public EventHandler(TextField Screen, Label E) {
		TXT1=Screen;
//		error=E;
	}
	public void actionPerformed(ActionEvent AE) {
		
		int firstnumdone =0;
		Button Btn;
		Btn=(Button)AE.getSource();
		String sign=Btn.getLabel();
		try {
			
		if(sign.equals("0")){
			if(firstnumdone == 0) {
				A=0;
				firstnumdone = 1;
			}
			else if(firstnumdone == 1) {
				B=0;
			}
		}
		if(sign.equals("1")){
			if(firstnumdone == 0) {
				A=1;
				firstnumdone = 1;
			}
			else if(firstnumdone == 1) {
				B=1;
			}
		}
		if(sign.equals("2")){
			if(firstnumdone == 0) {
				A=2;
				firstnumdone = 1;
			}
			else if(firstnumdone == 1) {
				B=2;
			}
		}
		if(sign.equals("3")){
			if(firstnumdone == 0) {
				A=3;
				firstnumdone = 1;
			}
			else if(firstnumdone == 1) {
				B=3;
			}
		}
		if(sign.equals("4")){
			if(firstnumdone == 0) {
				A=4;
				firstnumdone = 1;
			}
			else if(firstnumdone == 1) {
				B=4;
			}
		}
		if(sign.equals("5")){
			if(firstnumdone == 0) {
				A=5;
				firstnumdone = 1;
			}
			else if(firstnumdone == 1) {
				B=5;
			}
		}
		if(sign.equals("6")){
			if(firstnumdone == 0) {
				A=6;
				firstnumdone = 1;
			}
			else if(firstnumdone == 1) {
				B=6;
			}
		}
		if(sign.contentEquals("7")){
			if(firstnumdone == 0) {
				A=7;
				firstnumdone = 1;
			}
			else if(firstnumdone == 1) {
				B=7;
			}
		}
		if(sign.contentEquals("8")){
			if(firstnumdone == 0) {
				A=8;
				firstnumdone = 1;
			}
			else if(firstnumdone == 1) {
				B=8;
			}
		}
		if(sign.contentEquals("9")){
			if(firstnumdone == 0) {
				A=9;
				firstnumdone = 1;
			}
			else if(firstnumdone == 1) {
				B=9;
			}
		}
//========================================		
		if(sign.contentEquals("+")) {
			D=1;
		}
		if(sign.contentEquals("-")) {
			D=2;
		}
		if(sign.contentEquals("x")) {
			D=3;
		}
		if(sign.contentEquals("/")) {
			D=4;
		}
		
		if(sign.contentEquals("=")) {
			if(D==1) {
				C = A + B;
				System.out.println(C);
			}
			else if(D==2) {
				C = A - B;
				System.out.println(C);
			}
			else if(D==3) {
				C = A * B;
				System.out.println(C);
			}
			else if(D==4) {
				C = A / B;
				System.out.println(C);
			}
		}
	
			TXT1.setText(Integer.toString(C));
		}
		catch(NumberFormatException ERR) {
//			error.setText("Digits only pls");
			
		}
	}
}
