import java.util.Scanner;

public class SelectionSort{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n;
		System.out.println("Enter Array size");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<=n-1;i++){
			a[i] = s.nextInt();
		}
		selectionSort(a);
		System.out.println("After Sorting");
		for(int i=0;i<=n-1;i++){
			System.out.print(a[i]+" ");
		}

	}
	public static int[] selectionSort(int a[]){
		int n = a.length;
		
		for(int i=0;i<=n-2;i++){	//We need to do (n-2) passes
			int min = i;	//Finding minimum Number from i to end of array
			for(int j=i+1;j<=n-1;j++){
				if(a[j] < a[min]){
					min = j;
				}
			}
			
			//Swap the smallest element to the ith position
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		return a;
	}
}
