package lecture_3;

import java.util.Scanner;

public class pattern_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
			int n = scn.nextInt();
			
			int row =1;
			int star=n;
			int space=0; 
			 
			while(row<=n) {
				int i =1;
				while(i<=space) {
					System.out.print("  ");
			i++;
				
				}
				int j = 1;
				while(j<=star) {
					System.out.print("* ");
					j++;
		
				}
				System.out.println();
				space= space+2;
				star--;
				row++;
			}
		}

	}


