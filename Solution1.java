import java.util.Scanner;
import java.util.TreeSet;

public class Solution{
    public static void main(String args[]){
        int dummy;
        Scanner s = new Scanner(System.in);
        dummy = s.nextInt();s.nextLine();
        String raw;
        raw = s.nextLine();
        char a[] = chars(raw);
        
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<=raw.length()-1;i++){
            if(a[i]!='\u0000'){
                set.add(solveFor(raw,a[i]));
            }
        }
        System.out.println(set.last());

    }
    public static char[] chars(String src){
        char a[] = new char[src.length()];
        int j=0;
        boolean found;
        for(int i=0;i<=src.length()-1;i++){
            found = false;
            for(int k=0;k<=j;k++){
                if(a[k]==src.charAt(i)){
                    found = true;
                    break;
                }
            }
            if(!found){
                a[j++]=src.charAt(i);
                //count++;
            }
        }
        return a;
    }
    public static boolean repeat(String src){
        for(int i=0;i<=src.length()-2;i++){
            if(src.charAt(i)==src.charAt(i+1)){
                return true;
            }
        }
        return false;
    }
    public static int solveFor(String src,char ch){
        while(src.indexOf(ch)!=-1){
            src = src.substring(0,src.indexOf(ch))+src.substring(src.indexOf(ch)+1,src.length());
            //System.out.println(src);
        }
        System.out.println(src+" "+src.length());
        if(repeat(src)){
            return 0;
        }else{
            return src.length();
        }
    }
}
