package assignment_1;
import java.util.*;
public class Hollow_square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = n;
		int space =n-2;
		while(row<=n) {
			int i = 1;
			if(row==1 || row==n) {
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			}
			else {
				System.out.print("* ");
			}
			int j = 1;
			if(row!=1 && row!=n) {
				while(j<=space) {
				System.out.print("  ");
				j++;
			}
			}
			if(row>=2 && row<n) {
				System.out.print("* ");
			}
			row++;
			System.out.println();
		}
	}

}


