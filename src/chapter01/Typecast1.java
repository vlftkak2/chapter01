package chapter01;

public class Typecast1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b = 25;
		short s = b;
		int i = s;
		long l = i;
		float f = i;
		double d = f;

		byte b1 = (byte)256;

		System.out.println("b = " + b);
		System.out.println("s = " + s);
		System.out.println("i = " + i);
		System.out.println("l = " + l);

		System.out.println("f = " + f);
		System.out.println("d = " + d);
		System.out.println("b1 = " + b1);
	}

}
