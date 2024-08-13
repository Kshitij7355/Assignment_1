package assignment_1;
import java.util.*;
public class Pattern_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row=1;
		int space1=n-1;
		int star1=1;
		int var=1;
		int star2=1;
		int space=-1;
		while(row<=n) {
			int i =1;
			while(i<=space1) {
				System.out.print("  ");
				i++;
			}
			int j =1;
			int p=var;
			while(j<=star1) {
				System.out.print(p+" ");
				p--;
				j++;
			}
			int k =1;
			while(k<=space) {
				System.out.print("  ");
				k++;
			}
			int l =1;
			p=1;
			while(l<=star2) {
				System.out.print(p+" ");
				l++;
				p++;
			}
			if(row<=n/2) {
				space1-=2;
				star1++;
				star2++;
				space+=2;
				var++;
			}else {
				space1+=2;
				star1--;
				star2--;
				space-=2;
				var--;
			}
			row++;
			System.out.println();
		}
		

	}

}
