class Account
{
    private int accno;
    private double balance;
    private String Name;
    
    public Account(int accno , double balance , String Name)
    {
        this.accno = accno;
        this.balance = balance;
        this.Name = Name;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    public void withdraw(double balance)
    {
        if(this.balance >= balance)
            this.balance-=balance;
    }
    
    public void deposit(double balance)
    {
        this.balance+=balance;
    }
    
    public void printData()
    {
        System.out.println("Account NUmber = "+accno+"\nCoustomer Name is "+Name+"\nBalance = "+balance);
    }
}
class BankAccount
{
    public static void main(String a[])
    {
       Account obj = new Account(007,50000,"Hari Krishna") ;
       obj.printData();
       System.out.println(obj.getBalance());
       obj.deposit(8000000);
       System.out.println(obj.getBalance());
       obj.withdraw(50754);
       obj.printData();
    }
}