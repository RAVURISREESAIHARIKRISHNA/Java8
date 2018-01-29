import java.util.Scanner;

public class ClosestPairBruteForce{
	public static void main(String[] args){
		int n;	//number of points;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of Points");
		n = s.nextInt();
		int a[][] = new int[n][2];
		System.out.println("Enter Points");
		for(int i=0;i<=n-1;i++){
			a[i][0] = s.nextInt();
			a[i][1] = s.nextInt();
		}
		System.out.println("The pOints are");
		for(int i=0;i<=n-1;i++){
			System.out.println(a[i][0]+" , "+a[i][1]);
		}
		double distance = Double.MAX_VALUE;
		int index1,index2;
		index1 = index2 = 0;
		for(int i=0;i<=n-1;i++){
			for(int j=i+1;j<=n-1;j++){
				if(distance >= Math.sqrt(Math.pow(( a[i][0]-a[j][0]),2)+Math.pow((a[i][1]-a[j][1]),2) ) ){
					index1 = i;index2 = j;
					distance = Math.sqrt(Math.pow(( a[i][0]-a[j][0]),2)+Math.pow((a[i][1]-a[j][1]),2) ) ;
				}
			}
		}
		System.out.println("("+a[index1][0]+","+a[index1][1]+")\t("+a[index2][0]+","+a[index2][1]+")");
		System.out.println(distance);
	}
}
