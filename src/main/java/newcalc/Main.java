package newcalc;

import java.awt.*;

public class Main {

	public static void main(String[] args) {
		Frame F =new Frame("QA Consulting");
		TextField T1=new TextField(10);
		TextField T2=new TextField(10);
		TextField T3=new TextField(10);
		Label L1=new Label("First No.");
		Label L2=new Label("Second No.");
		Label L3=new Label("Result");
		Label error=new Label();
		Button B1 = new Button("+");
		Button B2 = new Button("-");
		Button B3 = new Button("x");
		Button B4 = new Button("/");
		FlowLayout Flow=new FlowLayout();
		F.setLayout(Flow);
		AddEventHandler plus=new AddEventHandler(T1,T2,T3,error);
		SubEventHandler sub=new SubEventHandler(T1,T2,T3,error);
		MulEventHandler mul=new MulEventHandler(T1,T2,T3,error);
		DivEventHandler div=new DivEventHandler(T1,T2,T3,error);
		B1.addActionListener(plus);
		B2.addActionListener(sub);
		B3.addActionListener(mul);
		B4.addActionListener(div);
		F.add(L1);
		F.add(T1);
		F.add(L2);
		F.add(T2);
		F.add(B1);
		F.add(B2);
		F.add(B3);
		F.add(B4);
		F.add(L3);
		F.add(T3);
		F.add(error);
		F.setSize(400,400);
		F.setVisible(true);
	}
}
