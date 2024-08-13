package assignment_1;
import java.util.*;
public class Pattern_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1;
		int space1=6;
		int space=-1;
		int var = row;
		while(row<=n) {
			int i = 1;
			while(i<=space1) {
				System.out.print("  ");
				i++;
			}
			int k =1;
			while(k<=row) {
				System.out.print(var+" ");
				k++;
				var--;
			}
			int j =1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			if(row>1 && row<7) {
				int l = 1;
				while(l<=row) {
					System.out.print(l+" ");
					l++;
				}
			}
			
			if(row<=n/2) {
				space1-=2;
				space+=2;
			}else {
				space1+=2;
				space-=2;
				
			}
			row++;
			System.out.println();
		}

	}

}
