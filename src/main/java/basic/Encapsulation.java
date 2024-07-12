package basic;

public class Encapsulation {
    private long accountnmuber;
    private double balance;

    public long getAccountnmuber() {
        return accountnmuber;
    }

    public void setAccountnmuber(long accountnmuber) {
        this.accountnmuber = accountnmuber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static  void main(String[] args){
        Encapsulation obj=new Encapsulation();
        obj.setAccountnmuber(546465546454l);
        obj.setBalance(2334354);
        System.out.println("enter account number:"+obj.getAccountnmuber());
        System.out.println("enter account balance:"+obj.getBalance());
    }
}