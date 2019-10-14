package bestcalculator;

import java.awt.*;

public class Main {

	public static void main(String[] args) {
		Frame F =new Frame("3D Calculator");
		Panel P1=new Panel();
		Panel P2=new Panel();
		GridLayout GL=new GridLayout(4,4);
		P2.setLayout(GL);
		TextField Screen=new TextField(20);
		Button B0,B1,B2,B3,B4,B5,B6,B7,B8,B9;
		Button ADD,SUB,MUL,DIV,CLEAR,EQUALS;
		B0 = new Button("0");
		B1 = new Button("1");
		B2 = new Button("2");
		ADD = new Button("+");
		B3 = new Button("3");
		B4 = new Button("4");
		B5 = new Button("5");
		SUB = new Button("-");
		B6 = new Button("6");
		B7 = new Button("7");
		B8 = new Button("8");
		MUL = new Button("X");
		B9 = new Button("9");
		CLEAR = new Button("C");
		EQUALS = new Button("=");
		DIV = new Button("/");
		P1.add(Screen);
		P2.add(B0);
		P2.add(B1);
		P2.add(B2);
		P2.add(ADD);
		P2.add(B3);
		P2.add(B4);
		P2.add(B5);
		P2.add(SUB);
		P2.add(B6);
		P2.add(B7);
		P2.add(B8);
		P2.add(MUL);
		P2.add(B9);
		P2.add(CLEAR);
		P2.add(EQUALS);
		P2.add(DIV);
		
		EventHandler event=new EventHandler(Screen, null);
		B0.addActionListener(event);
		B1.addActionListener(event);
		B2.addActionListener(event);
		B3.addActionListener(event);
		B4.addActionListener(event);
		B5.addActionListener(event);
		B6.addActionListener(event);
		B7.addActionListener(event);
		B8.addActionListener(event);
		B9.addActionListener(event);
		ADD.addActionListener(event);
		SUB.addActionListener(event);
		MUL.addActionListener(event);
		DIV.addActionListener(event);
		CLEAR.addActionListener(event);
		EQUALS.addActionListener(event);
		F.add(P1,BorderLayout.NORTH);
		F.add(P2,BorderLayout.CENTER);
		F.setSize(400,400);
		F.setVisible(true);
	}
}