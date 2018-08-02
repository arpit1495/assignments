package data;
public class AssignmentData {

	int var1;//creating int field
	char var2;//creating char field

	public void display(){
		System.out.println("int variable is " + var1);//object fields take default values if not initiated
		System.out.println("char variable is " + var2);//object fields take default values if not initiated
	}
	public void test(){
		int var3;
		int var4;
		//System.out.println("variable is " + var3);//these are not possible, local variables must be initiated to print them
		//System.out.println("variable is " + var4);//these are not possible, local variables must be initiated to print them
	}
}