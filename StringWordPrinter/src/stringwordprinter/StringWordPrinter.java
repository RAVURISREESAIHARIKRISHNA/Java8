package stringwordprinter;

public class StringWordPrinter
{
    private String string;
    //private String words[];
    
    public StringWordPrinter(String string)
    {
        this.string = string;
    }
    public void Printer()
    {
        String words[] = string.split(" ");
        for(int i=0;i<=words.length-1;i++)
        {
            System.out.println(words[i]+"\t"+words[i].length());
        }
    }
}