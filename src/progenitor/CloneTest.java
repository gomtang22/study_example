package progenitor;

public class CloneTest implements Cloneable{
	 String name="name";
	 public static void main(String[] args) {
	  CloneTest inst = new CloneTest();
	  CloneTest inst2 = null;
	  try {
	    inst2= (CloneTest) inst.clone();
	  } catch (CloneNotSupportedException e) {
	   e.printStackTrace();
	  }
	  System.out.println(inst.name.equals(inst2.name)); 
	 }
	}