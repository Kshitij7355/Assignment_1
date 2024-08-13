package assignment_1;

import java.util.Scanner;

public class FIBBo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1;
		int a=0;
		int b=1;
		int star = 1;
		while(row<=n) {
			int i = 1;
			int c =0;
			while(i<=star) {
				for(i=1;i<=star;i++) {
					 c=a+b;
					a=b;
					b=c;
					
				}
				System.out.print(c+" ");
				
				i++;
			}
			row++;
			star++;
			System.out.println();
			System.out.println();
			
		}

	}

}
