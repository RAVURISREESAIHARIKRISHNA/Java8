package stringmanip;

class StringManip
{
    public static void main(String arg[])
    {
        String s = "Hari Krishna";
        /*
        Signature:
        char OBJ.charAt(int where);
        */
        char x = s.charAt(1);//Assigns 'a'
        char y = s.charAt(4);//Assigns ''
        System.out.println("X is :"+x+"\nY is :"+y);
        
        /*
        getChars()
        Syntax:
        void getChars(int SourceSart , int SourceEnd , char Arr[] , int ArrIndex )
        
        It Reads and puts them in the Character Array Arr[] from the Array Index ArrIndex
        ****This Reads the String from SourceStart to SourceEnd-1****
        Care must be taken that the CharArray is lrge enough to hold the characters
        */
        char Suff[] = new char[3];//I want to store 'a','r','i'
        s.getChars(1, 4 , Suff , 0);
        System.out.println(Suff);
        /*char InSuff[] = new char[1]
        s.getChars(1 ,4, InSuff ,0);
        System.out.println(InSuff);
        COMPILATION ERROR
        ArrayIndexOutOfBoundsException
        */
        char Ex[] = new char[4];
        s.getChars(1, 4, Ex, 1);
        System.out.println(Ex);
        Ex[0]='z';
        System.out.println(Ex);
        /*
        equals()
        
        Returns a Boolean value.Returns true if both Strings are Equal.
        Syntax:
        S1.equals(S2);
        */
        String s2 = "Chaithanya";
        String s3 = "Hari Krishna";
        /*
        equalsIgnoreCase()
        
        -> It Considers A-Z to be same as a-z
        -> It too returns true if both string contain Same Characters and false otherwise
        
        -> In this Function HELLO and Hello are both Same
        */
        System.out.println(s.equals(s2));//false
        System.out.println(s.equals(s3));//true
        
        System.out.println(s.equalsIgnoreCase(s2));//false
        System.out.println(s.equalsIgnoreCase(s3));//true
        
        System.out.println("HELLO".equalsIgnoreCase("Hello"));//true
    }
}