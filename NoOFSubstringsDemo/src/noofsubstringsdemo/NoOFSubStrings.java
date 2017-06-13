package noofsubstringsdemo;

class NoOFSubStrings
{
    private String mainString;
    
    public NoOFSubStrings(String mainString)
    {
        this.mainString = mainString;
    }
    public int Occurances(String subString)
    {
//        int count = 0;
//        int pos;
//        pos = mainString.indexOf(subString);
//        if(pos==-1)
//            return pos;
//        count++;
//        pos+=(subString.length()+1);
//        if(pos<=mainString.length()-subString.length()-1)
//            pos = mainString.indexOf(subString,pos);
//        if(pos==-1)
//            return count;
//        
        int count =0,pos=0;
        while(true)
        {
            pos = mainString.indexOf(subString,pos);
            if(pos == -1)
                break;
            count++;
            pos++;
        }
        return count;
    }
}