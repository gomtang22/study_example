package progenitor;

import java.util.Objects;

class Student implements Cloneable{ //������������ �˸������ؼ� Cloneable�� implements�� 
	String name;
	Student(String name){
		this.name = name;
	

	try {
	Student s1 = new Student("egoing");
	Student s2 =  (Student) s1.clone();
	System.out.println(s1.name);
	System.out.println(s2.name);
	} catch (CloneNotSupportedException e) {
		e.printStackTrace();
	}
}

	public class ObjectDemo {
	public static void main(String[] args) {
	}

   }
