package singleton;

public class AssignmentSingleton {
	String member;
	public static AssignmentSingleton staticMethod(String name){//this method is creating and returning a object of class
		AssignmentSingleton obj = new AssignmentSingleton();
		obj.member = name;
		return obj;
	}
	public void print(){
		System.out.println(member);
	}
}