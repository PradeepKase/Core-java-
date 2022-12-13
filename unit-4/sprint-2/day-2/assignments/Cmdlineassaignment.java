package Cmdline;

public class Cmdlineassaignment {
	 static void factorial(int number) {
		int pro=1;
		for(int i=number; i>=1; i--) {
			pro=pro*(i);
		}
		System.out.println(pro);
	}
	public static void main(String[] args) {
		int number;
		// TODO Auto-generated method stub
		if(args.length>2) {
			System.out.println("error");
		}
		if(args.length==1) {
			String num=args[0];
			 number=Integer.parseInt(num);
			 factorial(number);
		}
		if(args.length==2) {
			String num1=args[0];
			String num2=args[1];
			number=Math.abs(Integer.parseInt(num1)-Integer.parseInt(num2));
			factorial(number);
		}
	}

}
