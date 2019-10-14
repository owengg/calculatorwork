package calcplusword;

public class Numberletter {
	
	public String Convert(int num) {
		String ones[]={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String ty[]= {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
		String Result="";
		Numberletter q=new Numberletter();
		if(num>=1000) {
			Result+=ones[num/1000]+" thousand";
			num%=1000;
		}
		if(num>=100) {
			Result+=ones[num/100]+" hundred";
			num%=100;
		}
		if(num>=20) {
			Result+=ty[num/10];
			num=num-(num/10*10);
		}
		if(num>=1) {
			Result+=ones[num];
		}
		return Result;
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
//		private String ones(int no) {
//			String word="";
//			switch(no) {
//			case 1:word="one";break;
//			case 2:word="two";break;
//			case 3:word="three";break;
//			case 4:word="four";break;
//			case 5:word="five";break;
//			case 6:word="six";break;
//			case 7:word="seven";break;
//			case 8:word="eight";break;
//			case 9:word="nine";break;
//			case 10:word="ten";break;
//			case 11:word="eleven";break;
//			case 12:word="twelve";break;
//			case 13:word="thirteen";break;
//			case 14:word="fourteen";break;
//			case 15:word="fifteen";break;
//			case 16:word="sixteen";break;
//			case 17:word="seventeen";break;
//			case 18:word="eighteen";break;
//			case 19:word="nineteen";break;
//			}
//		return word;
//		}
//		String Result="";
//		if(num>=1000) {
//			Result+=ones(num/1000)+" Thousand";
//			num%=1000;
//		}
//		if (num>=100) {
//			Result+=ones(num/100)+" Hundred";
//			num%=100;
//		}
//		if(num>=20) {
//			Result+=Ty(num/10*10);
//			num=num-(num/10*10);
//		}
//		System.out.println(Result);
//	}
//}
	