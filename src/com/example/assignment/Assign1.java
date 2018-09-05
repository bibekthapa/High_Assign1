package com.example.assignment;

import java.time.Instant;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class Assign1 {

	
	public static void main(String[] args) throws InterruptedException
	{
		long lStartTime = Instant.now().toEpochMilli();

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the total number of values available in the folder");
		
		int n=Integer.parseInt(input.nextLine());
		
		System.out.println("Enter the number of values that needs to be in output ");
		int k = Integer.parseInt(input.nextLine());
		
		
		Set<Integer> number_of_values=new TreeSet<Integer>();
					
		while(number_of_values.size()!=k) {
		
			number_of_values.add((int) (Math.random()*n+1));
			
		}
		
		System.out.println("In Ascending Order: ");
		System.out.println(number_of_values);
		input.close();
		long lEndTime = Instant.now().toEpochMilli();
		long output = lEndTime - lStartTime;
		System.out.println("Elapsed time in milliseconds: " + output);
	}
	
}
