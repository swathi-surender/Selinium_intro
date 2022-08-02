package java_intro;

public class Strings_basics {

	//String is object that represents sequence of characters
	public static void main(String[] args) {
		String s = "swathi"; // in string literal when text is same 
		String s1="swathi"; // it creats only one object 
		
// string with new key word if text is same it will explicitly creates  two objects in memory
		String s2 = new String("welcome");
		String s3 = new String("welcome");

String s4= "iam ready for the challenge";
System.out.println(s4.length());
String [] splittedstring =s4.split("for");
System.out.println(splittedstring[0]);
System.out.println(splittedstring[1]);
System.out.println(splittedstring[1].trim());
//for(int i=0;i<s4.length();i++)
// for reverse print
for (int i=s4.length()-1;i>=0;i--){
	System.out.println(s4.charAt(i));
}




	}

}
