package chiptre4;

import java.util.Scanner;

public class Ex4_16 {
	@SuppressWarnings("resource")
	public static void main(String[] args){
		System.out.println("please enter a number: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int i = 1;
		while(num != 1){
			i++;
			if(num%i == 0){
				System.out.print(i+" ");
				num = num/i;
				i = 1;
			}
		}
	}
}
