//Java Program to reverse the letters present in the given String
public class Main {
	public static void main(String[] args){
		String str = "Studytonight";
		System.out.println(str);
		String str2 = "";
		for (int i = str.length()-1; i>=0; i--) {
			str2 += str.charAt(i);
		}
		System.out.println(str2);
	}
}
