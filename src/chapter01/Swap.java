package chapter01;

public class Swap {

	public static void main(String[] args) {
		
		int n1=10;
		int n2=30;
		int k;
		
		if(n2>n1){
			k=n1;
			n1=n2;
			n2=k;
		}
			System.out.println("n1:"+n1);
			System.out.println("n2:"+n2);
  }
}
