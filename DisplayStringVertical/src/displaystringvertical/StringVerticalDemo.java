package displaystringvertical;

class StringVerticalDemo
{
    private String string;
    
    public StringVerticalDemo(String string)
    {
        this.string = string;
    }
    public void Vertical()
    {
        for(int i=0;i<=string.length()-1;i++)
        {
            System.out.println(string.charAt(i));
        }
    }
}