package java_intro;

public class Methods_demo {

	public static void main(String[] args) {
		Methods_demo a = new Methods_demo();
		String returnedvalue = a.getdata();
		System.out.println(returnedvalue);
		// we need to store the returned value in a string variable
		Methods_demo1 b = new Methods_demo1();
		b.getuserdata();
		getdata2();// we are calling method directly
	}

// we always create a method out side of main block
// here void means what this method returns (integer,string,boolean) 
//if you put void The method does not return any value it simply execute some program
// public means you can call this method in any class.
	public String getdata() {
		System.out.println("Hello world");
		return "swathi";
	}

	public static void getdata2() {
		System.out.println("static key word makes method belongs to class");
		// we can directly call the this method without creating object bcoz of static
		// keyword

	}
}
