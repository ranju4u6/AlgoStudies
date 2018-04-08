package com.test.sort;

import java.util.Scanner;

//100 80 90 70 60 40 50 30 10 20
public class BubbleSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String data = scanner.nextLine();

		//System.out.println("Received Input :" + data);

		String[] dataAry = data.split("\\ ");

		int[] dataIntAry = new int[dataAry.length];

		int cnt = 0;
		for (String dataEntity : dataAry) {
			dataIntAry[cnt] = Integer.parseInt(dataEntity);
			cnt++;
		}
		
		int iteration = 0;
		for(int i=0; i<dataIntAry.length; i++){
			
			for(int j=(i+1); j<dataIntAry.length; j++){
				
				System.out.println("Iteration :"+(++iteration)+ "  Compare ["+dataIntAry[i] +"] & ["+dataIntAry[j] +"]");
				if(dataIntAry[i] > dataIntAry[j]){
					int temp = dataIntAry[i];
					dataIntAry[i] = dataIntAry[j];
					dataIntAry[j] = temp;
					
					print(dataIntAry);
				}
				
			}
			
			
		}
		
		print(dataIntAry);


	}
	
	private static void print(int[] dataIntAry){
		System.out.println();
		for(int val: dataIntAry){
			System.out.print(val + " ");
		}
		System.out.println();
	}

}
