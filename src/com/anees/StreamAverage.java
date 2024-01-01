package com.anees;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class StreamAverage {
	
	public static void main(String[] args) {
		
		List<Integer> listInt = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("Enter the Value in List");
			listInt.add(sc.nextInt());
			
			System.out.println("Do you want to Add more? Y/N");  	
		}while(sc.next().equalsIgnoreCase("y"));
		
		System.out.println(listInt);
		double aver = listInt.stream()
				.mapToDouble(Integer::doubleValue)
				.average()
				.orElse(0.0);
		
		System.out.println(aver);
		
	}

}
