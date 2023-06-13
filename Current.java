package Tasks;

public class Current extends Account {

    public Current(double amt) {
      balance = amt;
    }

    @Override
    public void witdraw(double withdramt) {
      double withdr = balance-withdramt;
      balance = withdr;
    }

    @Override
    public void deposit(double depoamt) {
        double depo = balance+depoamt;
        balance = depo;

    }

    @Override
    public void printBalance() {
        System.out.println("Balance in your Current Account : " +balance);
    }
}
