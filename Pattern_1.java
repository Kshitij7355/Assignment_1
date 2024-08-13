package assignment_1;
import java.util.*;
public class Pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row =1; 
		int star=3;
		int space=-1;
		while(row<=5) {
			int i = 1;
			while(i<=star) {
				System.out.print("*\t");
				i++;
			}
			int j = 1;
			while(j<=space) {
				System.out.print(" \t");
				j++;
			}
			int k =1;
			if(row==1 || row==n) {
				k=2;
			}
			while(k<=star) {
				System.out.print("*\t");
				k++;
			}
			if(row<=n/2) {
				space+=2;
				star--;
			}else {
				space-=2;
				star++;
			}
			row++;
			
			System.out.println();
			
		}
		

	}

}
