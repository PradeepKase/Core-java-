package eval1;

public class Eval1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("helloworld");
		
		int day=5;
		switch(day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
//		if(day==1) {
//			System.out.println("Monday");
//		}
//		else if(day==2){
//			System.out.println("Tuesday");
//		}
//		else if(day==3){
//			System.out.println("Wednesday");
//		}
//		else if(day==4){
//			System.out.println("Thursday");
//		}
//		else if(day==5){
//			System.out.println("Friday");
//		}
//		else if(day==6){
//			System.out.println("Saturday");
//		}
//		else if(day==7){
//			System.out.println("Sunday");
//		}
//		else {
//			System.out.println("Invalid Input");
//		}
		
		// Print the first ten even number using do while loop
		int i=1;
		do {

			if(i%2==0) {
				
				System.out.println(i);	
			}
			
			i++;
		}
		while(i<=20);
		
		// Print the first ten even number using continue
		for(int j=1; j<=20; j++) {
			if(j%2!=0) {
				continue;
			}
			System.out.println(j);
		}

		System.out.println("Abstraction: Abstract means to hide away the implementation details inside something – sometimes a prototype, sometimes a function. So when you call the function you don't have to understand exactly what it is doing.\r\n"
				+ "Encapsulation:The definition of encapsulation is \"the action of enclosing something in or as if in a capsule\". Removing access to parts of your code and making things private is exactly what Encapsulation is all about (often times, people refer to it as data hiding) in js we used # to  enscapsulate password or username \r\n"
				+ "Inheritance: Inheritance lets one object acquire the properties and methods of another object. ex: we have an object of car then we can extract ssome propertios of that object to make new car \r\n"
				+ "Polymorphism:Polymorphism means \"the condition of occurring in several different forms.\" That's exactly what the fourth and final pillar is concerned with – types in the same inheritance chains being able to do different things.\r\n"

				);
		
		
		System.out.println("JDK:The JDK (Java Development Kit) is a software development kit that develops applications in Java. Along with JRE, the JDK also consists of various development tools (Java Debugger, JavaDoc, compilers, etc.\r\n"
				+ "The Java Runtime Environment (JRE) is an implementation of JVM. It is a type of software package that provides class libraries of Java, JVM, and various other components for running the applications written in Java programming\r\n"
				+ "The Java Virtual Machine (JVM) is a platform-independent abstract machine that has three notions in the form of specifications. This document describes the requirement of JVM implementation.\r\n"
				+ "JRE and JVM are inside JKD");
	}

}
