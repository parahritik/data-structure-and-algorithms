package LECTURE_4;
import java.util.*;

public class pattern_21 {

	public static void main(String[] args) {
		// question no.17 from pdf
		Scanner scn = new Scanner(System.in);
int n = scn.nextInt();

int row = 1;
int star = 1;
int space=2*n-3;
while(row<=n) {
	int i = 1;
	while(i<=star) {
		System.out.print("* ");
		i++;
	}
	int j = 1;
	while(j<=space) {
		System.out.print("  ");
		j++;
	}
	
	
	int z = 1;
	if(row==n) {
		z=2;
	}
	while(z<=star) {
		System.out.print("* ");
		z++;
	}
	System.out.println();
	row++;
	star++;
	space = space-2;
}
	}
}
	
	
