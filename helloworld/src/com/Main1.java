package com;
import java.util.Scanner;
public class Main1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Sum is"+(a+b));
		Main1 obj=new Main1();
		System.out.println(obj.getClass());
		System.out.println(obj.hashCode());
		
	}

}
