package arrayspractice;

public class Main {

	public static void main(String[] args) {
		int Numbers[]= {15,36,42,91,48};
		int i;
		int maxvalue=Numbers[0];
		for(i=1;i<Numbers.length;i++)
			if(Numbers[i]>maxvalue) {
				maxvalue=Numbers[i];
			}
	System.out.println(maxvalue);
	//change for commit practice
	}
}