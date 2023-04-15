package LECTURE_4;
import java.util.*;
public class pattern_27{
	Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int row = 1;
    int star = 1;
    int space = n/2;

    while(row<=n){
        int i = 0;
        while(i<=space){
            System.out.print("  ");
            i++;

        }
        int j =  1;
        while(j<=star){
            System.out.print("* ");
            j++;
        }
        System.out.println();
        row++;
        star++;
        space--;
    }
}
}
	
