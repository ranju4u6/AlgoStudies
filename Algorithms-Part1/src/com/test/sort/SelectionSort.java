package com.test.sort;

import java.util.Scanner;


//100 80 90 70 60 40 50 30 10 20
public class SelectionSort {

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
		for(int i=0; i<dataIntAry.length; i++){
			
			int smallest = dataIntAry[i];
			int smallestPos = i;
			for(int j=i+1; j< dataIntAry.length; j++){
				
				System.out.println("Iteration :"+(++iteration)+ "  Compare ["+smallest +"] & ["+dataIntAry[j] +"]");
				if(dataIntAry[j] < smallest){
					smallest = dataIntAry[j];
					smallestPos = j;
				}
			}
			
			if(smallest != dataIntAry[i]){
				int temp = dataIntAry[i];
				dataIntAry[i] = smallest;
				dataIntAry[smallestPos] = temp;
				
				print(dataIntAry, i);
			}
			
		}
		
		print(dataIntAry, -1);

	}
	
	
	private static void print(int[] dataIntAry, int smallestPos){
		System.out.println();
		for(int i=0; i< dataIntAry.length ; i++){
			
			System.out.print(dataIntAry[i] + " ");
			
		}
		System.out.println();
	}

}
