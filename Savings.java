package Tasks;

public class Savings extends Account{

    private double interestrate = 0.8;

     public Savings(double balance){
   this.balance = balance ;
     }
    @Override
    public void witdraw(double j) {
         double withdr = balance-j-(j*interestrate);
        balance = withdr;
    }

    @Override
    public void deposit( double depoamt) {
        double depo = balance+depoamt+(depoamt*interestrate);
        balance = depo;
    }

    @Override
    public void printBalance() {
        System.out.println("Balance in your Savings Account: " +balance);
    }
}
