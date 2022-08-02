package java_intro;

public class Java_basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// data types
		int num = 5;
		String name= "swathisurender";
		char initial = 'p';
		double value = 0.5;
		boolean married = true;
		System.out.println("number  = "  + num);
				System.out.println	(  "and name is = "  +name);
				System.out.println ( "is she truly married = " + married);
				
				//arrays
				int[] arr = new int[3];// you can store 3 integers,index starts from "0"
				arr[0]=1;
				arr[1]=2;
				arr[2]=3;
				//or
				int [] arr1 = {6,7,8};
				System.out.println(arr[2]);
				// for loop
				for (int i=0; i<arr.length;i++) {
					System.out.println(arr[i]);				}
				
	//string array
	String[]name1 ={"nakka","surender","phd"};
	
	for(int i=0;i<name1.length;i++)
	{
		System.out.println(name1[i]);				
		}
// enhance for loop
	for (String s : name1){
		System.out.println(s);
	}
	// enhance for loop for array
	for (int q : arr1){
		System.out.println(q);
	}
}
}
