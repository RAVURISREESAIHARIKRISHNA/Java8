public class Solution{
    public static void main(String args[]){
        System.out.println("Started");
        new Thread(){
            int counter = 10;
            public void run(){
                while(counter>=0){
                    System.out.println(counter--);
                    try{
                        Thread.sleep(1000);
                    }catch(Exception e){
                        System.out.println("Exception");
                        //Can modify JFrame here....
                    }
                }
            }
        }.start();
    }
}
