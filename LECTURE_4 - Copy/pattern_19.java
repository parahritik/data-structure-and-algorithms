package LECTURE_4;
import java.util.*;

import java.util.Scanner;

public class pattern_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int row =1;
		int star = n;
		while(row<=n) {
		
		if(row==1 || row==n) {
			int i = 1;
			while(i<=n) {
				System.out.print("* ");
				i++;
			}
		}
		else {
			System.out.print("*       *");
		}
		System.out.println();
		row++;
		
		}

	}

}
