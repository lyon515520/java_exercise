package chiptre3;

import java.util.Scanner;

public class Ex3_4 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int a = (int)(Math.random()*100);
		int b = (int)(Math.random()*100);
		Scanner input = new Scanner(System.in);
		System.out.println("please enter the result of "+a+"+"+b);
		int sum = input.nextInt();
		if(a+b == sum){
			System.out.println("the answer is true!");
		}
		else{
			System.out.println("the answer is false");
		}

	}

}
