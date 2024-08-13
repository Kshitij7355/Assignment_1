package assignment_1;

import java.util.Scanner;

public class fas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int fac = 1;
		while(n>0) {
			fac = fac*n;
			n--;
		}
		System.out.println(fac);

	}

}
