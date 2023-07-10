package day01.practice;

public class AccessModifier {
	private String a = "a";
	private String b = "b";
	private String c = "c";
	private static String d = "d";
	
	public static void main(String[] args) {
		AccessModifier accessModifier = new AccessModifier();
		System.out.println(accessModifier.a);
		System.out.println(accessModifier.b);
		System.out.println(accessModifier.c);
		System.out.println(d);
	}
}

