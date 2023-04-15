package LECTURE_4;
import java.util.*;
public class PATTTERN_MIRROR_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		 
		int row= 1;
		int star= 1;
		
		while(row<=2*n-1) {
			
			int i = 1;
					while(i<=star) {
						
						System.out.print("* ");
						i++;
					}
					if(row<=star/2) {
						star++;
					}
					else {
						star--;
					}
					System.out.println();
					row++;
					
		}
	}
}



	
