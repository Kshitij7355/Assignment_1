package assignment_1;
import java.util.*;
public class Pattern_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row=1;
		int space=n-1;
		int star=1;
		int var=1;
		while(row<=2*n-1) {
			int i =1;
			while(i<=space) {
				System.out.print("\t");
				i++;
			}
			int j =1;
			int p=var;
			while(j<=star) {
				System.out.print(p+"\t");
				if(j<=star/2) {
					p++;
				}else {
					p--;
				}
				j++;
			}
			if(row<n) {
				space--;
				star+=2;
				var++;
			}else {
				space++;
				star-=2;
				var--;
			}
			row++;
			
			System.out.println();
		}

	}

}
