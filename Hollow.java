package assignment_1;
import java.util.*;
public class Hollow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = n;
		int space = n-1;
		while(row<=n) {
			int i = 1;
			while(i<=space) {
				System.out.print(" ");
				i++;
			}
			int j = 1;
			while(j<=star) {
				if(row==1 ||row==n) {
					System.out.print("*");
					j++;
				}
				else {
					if(j==1 || j==star) {
						System.out.print("*");
					}
					else {
					System.out.print(" ");
				}
				j++;
			}
		}
		System.out.println();
		space--;
		row++;
		}

	}

}
