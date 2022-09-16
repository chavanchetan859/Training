package Uppercase;

public class Word {
	public static void main(String[] args) {
		
		String s="i love java";
		String f=s.substring(0,1);
		String r=s.substring(1,s.length());
		s=f.toUpperCase()+r;
		System.out.println(s);
	}
}
