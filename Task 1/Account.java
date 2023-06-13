package Tasks;

public abstract class Account {
    protected double balance;


    public void witdraw(double withdramt) {

    }
    public  void deposit(double depoamt) {

}

    public void printBalance() {

    }

    public static void main(String[] args) {
        Account acSavings = new Savings(50000);
        acSavings.deposit(1000);
        acSavings.printBalance();

        acSavings.witdraw(3000);
        acSavings.printBalance();
        System.out.println("------------------------------------------");
        Account curAcct = new Current(50000);
       curAcct.deposit(1000);
       curAcct.printBalance();


       curAcct.witdraw(3000);
       curAcct.printBalance();


    }


}
