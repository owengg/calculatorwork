package com.nationwide.calculator;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BEventHandler implements ActionListener {
	TextField TXT;
	public BEventHandler(TextField x) {
		TXT=x;
	}
	public void actionPerformed(ActionEvent E) {
		TXT.setText("Hello My Friend");
	}

}
