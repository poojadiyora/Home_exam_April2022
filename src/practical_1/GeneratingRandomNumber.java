package practical_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GeneratingRandomNumber {
	public static void main(String[] args) {
		//0- 500

		Random ran = new Random();
		int[] number = new int[500];
		
		System.out.println("random number");
		for(int a= 0; a<500; a++) {
		number[a] = ran.nextInt(1000);
		System.out.println(number[a] +" ");
		
		}
		System.out.println("random number is print");
		Arrays.sort(number);
		
		for(int a= 0; a<500; a++ ) {
			System.out.println(number[a] +",");
		}
		System.out.println();
		Scanner hr = new Scanner(System.in);
		System.out.println("give Nth number smallest");
		int y= hr.nextInt();
		System.out.println("give me Nth smallest no in the number" + number[y-1]);	
		
		//[y-1]
		
	}
}
