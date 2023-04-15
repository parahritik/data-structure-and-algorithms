package lecture_3;
import java.util.*;
public class PATTERN_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=i;j++) {     //this line is used to print star j<=i ya j<=n jistna bhi j hoga utna star print honga
				System.out.print("* ");
			}
		
		System.out.println();
		}
		

	}

}
