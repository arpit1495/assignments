package arpit.assignment.main;


import data.AssignmentData;
import singleton.AssignmentSingleton;

public class AssignmentMain {
	public static void main(String[] args) {
		AssignmentData obj1 = new AssignmentData();//creating a object of AssignmentData
		obj1.display();
		obj1.test();

		AssignmentSingleton obj2 = AssignmentSingleton.staticMethod("Hello");
		obj2.print();


	}
}