package foreach;

//A Breif Examples on Enhanced-For Loop :
public class ForEach 
{
    public static void main(String arg[])
    {
        int arr[];
        arr=new int[10];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        arr[5]=6;
        arr[6]=7;
        arr[7]=8;
        arr[8]=9;
        arr[9]=10;
        int Sum=0;
        System.out.println("Printing Using For Loop:");
        for(int i=0;i<=9;i++)
        {
            System.out.print(arr[i]+"  ");
            Sum+=arr[i];
            
        }
        System.out.println("\nThe Sum is : "+Sum);
        System.out.println("\n\nPrintting Using For-Each Loop:");
        Sum=0;
        /*
        For-Each Loop Syntax:
        
        for(DataType <Iteration Variable>:<Base Address of The Collection>)
        {
            //For-Each Block;
        }
        
        */
        
        for(int i:arr)
        {
            System.out.print(i+"  ");
            Sum+=i;
        }
        System.out.println("\nSum is : "+Sum);
        
        int p[][]=
        {
            {1,2,3},
            {4,5,6},
            {7,8,9}
            
        };
        //Printing 2-D Array With For-Each Loop
        System.out.println();
        for(int i[]:p)
        {
            for(int j:i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
            
        }
        
        int h[][][]=
        {
            {{1},{2},{3}},
            {{4},{5},{6}},
            {{7},{8},{9}}
            
        };
        //Printing 3-D Array with For-Each Loop
        
        System.out.println();
        
        for(int i[][]:h)
        {
            for(int j[]:i)
            {
                for(int k:j)
                {
                    System.out.print(k);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
