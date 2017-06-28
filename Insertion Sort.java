//TEMPLATE
public class Solution{
    public static void main(String args[]){
        //TODO
    }
    public void sort(int arr[]){
        int n = arr.length;
        for(int i = 1;i<=n-1;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j -= 1;
            }
            aerr[j+1] = key;
        }
    }
}
