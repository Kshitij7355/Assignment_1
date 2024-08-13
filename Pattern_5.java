package assignment_1;

import java.util.Scanner;

public class Pattern_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row=1;
		int space=3;
		int star=1;
		int var=row;
		while(row<=n) {
			int i = 1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j =1;
			while(j<=star) {
				System.out.print(var+" ");
				j++;
				if(j<=star/2) {
					var++;
				}else {
					var--;
				}
				
			}
			if(row<=n/2) {
				star+=2;
				space--;
			}else {
				star-=2;
				space++;
			}
			row++;
			System.out.println();
		}
		

	}

}
