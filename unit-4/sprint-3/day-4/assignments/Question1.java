package practiceset;

public class Question1 {
public static void main(String[] args) {
	
	StudentBean b=new StudentBean(10, "paddu", 309 ,'a');
	char grade=b.calculateGrade(308);
//	b.setroll(10);
//	b.setName("paddu");
//	int mark=308;
//	b.setmark(mark);
	
//	b.setgrade(grade);
	b.displayDetails();	
}
}

