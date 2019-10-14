package com.nationwide.calculator;

import java.awt.Frame;
import java.awt.Button;
import java.awt.BorderLayout;

public class WindowsXP {
	public static void main(String xyz[]) {
		Button B1,B2,B3,B4,B5;
		B1=new Button("Click1");
		B2=new Button("Click2");
		B3=new Button("Click3");
		B4=new Button("Click4");
		B5=new Button("Click5");
		Frame F=new Frame("Nationwide");
		F.add(B1, BorderLayout.NORTH);
		F.add(B2, BorderLayout.EAST);
		F.add(B3, BorderLayout.WEST);
		F.add(B4, BorderLayout.SOUTH);
		F.add(B5);
		ButtonClicked Bevent=new ButtonClicked();
		ButtonClicked1 Bevent1=new ButtonClicked1();
		ButtonClicked2 Bevent2=new ButtonClicked2();
		ButtonClicked3 Bevent3=new ButtonClicked3();
		ButtonClicked4 Bevent4=new ButtonClicked4();
		B5.addActionListener(Bevent);
		B1.addActionListener(Bevent1);
		B2.addActionListener(Bevent2);
		B3.addActionListener(Bevent3);
		B4.addActionListener(Bevent4);
		F.setSize(400,400);
		F.setVisible(true);
	}

}
