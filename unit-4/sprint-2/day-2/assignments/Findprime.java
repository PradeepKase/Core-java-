package Cmdline;

public class Findprime {
	public static void findAndReturnPrimeNumbers(int[] inputArray) {
		int factors=0;
	    for  (int i=0;i<=inputArray.length; i++){
	        if(inputArray[i]%i==0){
	            factors++;
	        }
		    if(factors==2){
		        System.out.println(inputArray[i]);
		    }
		    else {
		    	System.out.println("there is no prime number");
		    }
	    }

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,9};
		findAndReturnPrimeNumbers(arr);
	}

}
