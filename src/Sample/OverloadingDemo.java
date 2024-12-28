package Sample;
class AddDemo{
	void add(int a,int b) {
		System.out.println("a+b..."+(a+b));
	}
	void add(int a,int b,int c) {
		System.out.println("a+b+c..."+(a+b+c));
	}
	void add(String firstName,String lastName) {
		System.out.println("full name--->"+firstName+""+lastName);
	}
}
public class OverloadingDemo {

	public static void main(String[] args) {
		AddDemo addDemo=new AddDemo();
		addDemo.add(100,200);
		addDemo.add("sai","surya");
		addDemo.add(100,200,300);
	}
	public static void main(String fName,String lName) {
		

	}

}
