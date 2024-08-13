package assignment_1;

import java.util.Scanner;

public class Pattern_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1;
		int star = 1;
		int var=1;
		while(row<=n) {
			int i = 1;
			while(i<=star) {
				System.out.print(var+"\t");
				i++;
				var++;
			}
			row++;
			star++;
			System.out.println();
			
		}

	}

}
