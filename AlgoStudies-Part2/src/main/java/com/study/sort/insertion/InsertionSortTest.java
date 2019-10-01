package com.study.sort.insertion;

public class InsertionSortTest {

	public static void main(String[] args) {
		
		for(int j=1; j< args.length; j++){
			
			int key = Integer.parseInt(args[j]);
			int i = j-1;
			
			while((i>=0) && (Integer.parseInt(args[i]) > key)){
				args[i+1] = args[i];
				i=i-1;
			}
			
			args[i+1] = String.valueOf(key);
			
		}
		
		
		for(String value: args){
			System.out.print(value + "  ");
		}
		

	}

}
