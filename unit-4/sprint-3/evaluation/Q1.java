package sprint_eval3;

public class Q1 {
 public static void main(String[] args) {
//	 Employee e1=new Employee(employeeId,employeeName);
//	 PermanentEmployee pe=new PermanentEmployee();
	 
	 Loan l= new Loan();
	 l.calculateLoanAmount(null);
	 
	 double amount =l.calculateLoanAmount(new PermanentEmployee(20,"abhi", 2000));
	 double d1=l.calculateLoanAmount(new TemporaryEmployee(20,"pp",10, 100));
	 System.out.println("the loan amout for perment employee"+ amount);
	 System.out.println("the loan amout for tem employee"+ d1);
 }
}
abstract class Employee{
	int employeeId;
	String employeeName;
	double salary;
	  Employee(int employeeId,String employeeName){
		this.employeeId=employeeId;
		this.employeeName=employeeName;
	}
	abstract void calculateSalary();
	
}

class PermanentEmployee extends Employee{
 	private double basicPay;
	
 public	PermanentEmployee(int employeeId, String employeeName,int basicPay ){
	 super(employeeId, employeeName);
	 this.basicPay=basicPay;
	 calculateSalary();
 	}
 	@Override
  	void  calculateSalary(){
  		double abhi= basicPay-(basicPay* 0.12);
  		this.salary=abhi;
 	}
 	
}

class TemporaryEmployee extends Employee{
	int hoursWorked;
	int hourlyWages;
	public TemporaryEmployee(int employeeId, String employeeName,int hoursWorked,int hourlyWages){
		super(employeeId,employeeName);
		this.hoursWorked=hoursWorked;
		this.hourlyWages=hourlyWages;
		calculateSalary();
	}
	@Override
	void calculateSalary(){
		salary=hoursWorked*hourlyWages;
		this.salary=salary;
	}
}

class  Loan{
	public double calculateLoanAmount(Employee e1) {
		if(e1==null) {
			System.out.println("INJvalid input");
			return 0;
		}
		if(e1 instanceof PermanentEmployee) {
			PermanentEmployee p=(PermanentEmployee)e1;
			double amount=(p.salary*15)/100;
			return amount;
		}
		else if(e1 instanceof TemporaryEmployee) {
			TemporaryEmployee t=(TemporaryEmployee)e1;
			double amount=(t.salary*10/100);
			return amount;
		}
		else {
			return 0;
		}

	}
}





