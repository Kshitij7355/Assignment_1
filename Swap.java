package assignment_1;

public class Swap {

	public static void main(String[] args) {
		int []arr = {12,32,45,7,8,20};
		int []other={10,56,8,9,45,76};
        System.out.print(arr[0]+" "+other[0]);
        Swap(arr,other);
        System.out.println();
        System.out.print(arr[0]+" "+other[0]);
	}
	public static void Swap(int[]arr,int[]other) {
		for(int i=0;i<arr.length;i++) {
			int temp = arr[i];
			arr[i]= other[i];
			other[i]=temp;
		}
	}

}
