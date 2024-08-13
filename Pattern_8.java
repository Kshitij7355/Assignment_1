package assignment_1;
import java.util.*;
public class Pattern_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row=1;
		int space1=n-1;
		int star=5;
		int space=3;
		while(row<=n) {
			int i =1;
			while(i<=space1) {
				System.out.print(" ");
				i++;
			}
			if(row==1 && row==n) {
				int j =1;
				while(j<=star) {
					System.out.print("*");
					j++;
				}
					
				}else {
					System.out.println("*");
			}
			if(row>1 && row<n) {
				int k =1;
				while(k<=space) {
					System.out.print(" ");
					k++;
				}
			}else {
				System.out.print("*");
			}
			
		}
		row++;
		space1--;
		System.out.println();
		System.out.println();

	}

}
