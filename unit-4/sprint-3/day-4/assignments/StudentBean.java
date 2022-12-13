package practiceset;

public class StudentBean {
		private int roll;
		private String Name;
		private int mark;
		private char grade;
		
//		public StudentBean() {
//			
//		}
		public StudentBean(int roll, String Name, int mark, char grade){
			this.roll=roll;
			this.Name=Name;
			this.mark=mark;
			this.grade=grade;
		}
		public int getroll() {
			return roll;
		}
		public void setroll(int roll) {
			this.roll=roll;
		}
		public String getName() {
			return Name;
		}
		public void setName(String Name) {
			this.Name=Name;
		}
		public int getmark() {
			return mark;
		}
		public void setmark(int mark) {
			this.mark=mark;
		}
		public char getgrade() {
			return grade;
		}
		public void setgrade(char grade) {
			this.grade=grade;
		}
		
		public char calculateGrade(int mark) {
			if(mark>500) {
				return 'A';
			}
			else if(mark<500 && mark>=400) {
				return 'B';
			}
			else {
				return 'C';
			}
		}
		
		public void displayDetails() {
			System.out.println(roll);
			System.out.println(Name);
			System.out.println(mark);
			System.out.println(grade);
		}
		
}

