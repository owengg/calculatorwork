package com.nationwide.calculator;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;

public class Wondows {

	public static void main(String[] args) {
		Frame F=new Frame("QA Consulting");
		Button B=new Button("Click Me");
		TextField T=new TextField();
		BEventHandler BClicked=new BEventHandler(T);
		B.addActionListener(BClicked);
		F.add(T, BorderLayout.NORTH);
		F.add(B, BorderLayout.CENTER);
		F.setSize(400,400);
		F.setVisible(true);
	}

}
