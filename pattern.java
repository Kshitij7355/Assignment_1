package assignment_1;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int star = 5;
		int row =1;
		int space = 3;
		while(row<=n) {
			if(row == 1 || row==n) {
				int i =1;
				while(i<=star) {
					System.out.print("* ");
					i++;
				}
			}else {
				System.out.print("* ");
			}
			if(row >=2 && row<n) {
				int j =1;
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
