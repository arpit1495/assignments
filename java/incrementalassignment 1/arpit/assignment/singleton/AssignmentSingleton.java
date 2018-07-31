package singleton;

public class AssignmentSingleton {
	String member;
	public static AssignmentSingleton staticMethod(String name){
		AssignmentSingleton obj = new AssignmentSingleton();
		obj.member = name;
		return obj;
	}
	public void print(){
		System.out.println(member);
	}
}