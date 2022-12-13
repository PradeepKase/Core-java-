package day1;

public class Assaignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		naturalNumbers(110);
	}
	 static void naturalNumbers(int num){
		if(num<=100) {
			int sumofnums = num*(num+1)/2;
			System.out.println(sumofnums);		
		}
		else {
			System.out.println("invalid Number");
		}

	}

}
