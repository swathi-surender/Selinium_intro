package java_intro;

import java.util.ArrayList;

public class Basics_2 {
	public static void main(String[] args) {
		int []val= {1,2,4,6,8,9,12,224};
		for(int i=0; i<val.length;i++) {
			if (val[i] %4 ==0)
			{
				System.out.println(val[i]);
				//break;
			}
			else {
				System.out.println(val[i] + "not muliple by 4");
			}}
			//arraylist-it's class in java.util package we can use all methods from array list class by creating object
ArrayList<String> a = new ArrayList<String>();
a.add("sai");
a.add("swathi");
a.add("puli");
a.add("surender");


System.out.println(a.get(3));
}}
