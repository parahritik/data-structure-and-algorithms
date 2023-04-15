package LECTURE_4;
import java.util.*;

public class pattern_5 {

	public static void main(String[] args) {
		// question no.17 from pdf
		Scanner scn = new Scanner(System.in);
int n = scn.nextInt();

int row = 1;
int star = n/2;
int space=1;
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
	while(z<=star) {
		System.out.print("* ");
		z++;
	}
	if(row<n/2+1) {
		star--;
		space = space+2;
		
	}
	else {
		 star++;
		space = space-2;
		
	}
	
	
	System.out.println();
	
	row++;
}


	}

}


