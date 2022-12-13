package Q2;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee m1= new Employee();
		m1.Name="pradeep";
		System.out.println(m1.Name);
		m1.Age=24;
		System.out.println(m1.Age);
		m1.Phone_number="8746008088";
		System.out.println(m1.Phone_number);
		m1.Address="Mudhol";
		System.out.println(m1.Address);
		m1.Salary=90999.97;
		m1.printSalary(m1.Salary);
		
		Manager m2= new Manager();
		m2.Name="pradee";
		System.out.println(m2.Name);
		m2.Age=25;
		System.out.println(m2.Age);
		m2.Phone_number="874600808";
		System.out.println(m2.Phone_number);
		m2.Address="Banglore";
		System.out.println(m2.Address);
		m2.Salary=120999.97;
		m2.printSalary(m2.Salary);
	}

}
class Member{
	String Name;
	int	Age; 
	String Phone_number; 
	String Address;
	double Salary;
	void printSalary(double Salary) {
		System.out.println(Salary);
	}
}

class Employee extends Member{
//	Member m1=new Member();
	String Specialisation;
	String Department;
}
class Manager extends Member{
//	Member m2=new Member();
	String Specialisation;
	String Department;
}