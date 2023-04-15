package LECTURE_4;
import java.util.*;
public class pattern_zero {

	public static void main(String[] args) {
		  Scanner scn = new Scanner(System.in);
			int n = scn.nextInt();
			 int row = 1;
			 int star = 1;
			 while(row<=n) {
				 int i = 1;
				// int val = row;
				 while(i<=row) {
					 
					 if(i==1|| i==row) {
	                      System.out.print(row+" ");
					 }
					 else {
						 System.out.print("0"+" ");
					 }
					 i++;
					 
				 }
				 System.out.println();
				 row++;
				 star++;
				 
			 }

		}

	}


	    
