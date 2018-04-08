package com.test.sort;

import java.util.Scanner;

//100 80 90 70 60 40 50 30 10 20
public class InsertionSort {

	public static void main(String[] args) {
		
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
		
		for(int i=1; i<dataIntAry.length; i++){
			for(int j=0; j<i; j++){
				
				System.out.println("Iteration :"+(++iteration)+ "  Compare ["+dataIntAry[i] +"] & ["+dataIntAry[j] +"]");
				int shiftCount = 0;
				
				if(dataIntAry[i]<dataIntAry[j]){
					int temp = dataIntAry[i];
					
					for(int k=i; k>=j; k--){
						shiftCount++;
						if(k == j){
							dataIntAry[k]=temp;
							System.out.println("Shifting Count ["+shiftCount+"] Insertion of ["+temp+"] to position ["+k+"]");
						}
						else {
							System.out.println("Shifting Count ["+shiftCount+"] Shifting of ["+temp+"] to position ["+k+"]");
							dataIntAry[k]=dataIntAry[k-1];
						}
					}
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
