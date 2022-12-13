package eval2;

public class Question5 {

	public static void main(String[] args) {
		Integer[] nums= {1,2,3,4};
//		Integer[] num= new Integer[4];
		String str="";
		for(int i=0;i<nums.length; i++) {
			str+=(nums[i]*2)+" ";	
		}
		System.out.println(str);
	}
}
