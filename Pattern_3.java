package assignment_1;
import java.util.*;
public class Pattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star1 = n;
		int space = -1;
		int star2 = n;
		while(row<=2*n-1) {
			int i = 1;
			while(i<=star1) {
				System.out.print("*");
				i++;
			}
			int j = 1;
			while(j<=space) {
				System.out.print(" ");
				j++;
			}
			int k;
			if(row == 1 || row == 2*n-1) {
				k=2;
			}else {
				k = 1;
			}
			while(k<=star2) {
				System.out.print("*");
				k++;
			}
			if(row<n) {
				star1 = star1 - 1;
				space = space+2;
				star2 = star2 -1;
			}
			else
			{
				star1 = star1 + 1;
				space = space-2;
				star2 = star2 +1;
			}
			row++;
			System.out.println();
		}


	}

}
