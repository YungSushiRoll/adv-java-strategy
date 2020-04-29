package discount;

public class Sales implements Deduction {
    @Override
    public double getBillAmount(double billAmount) {
        double afterDisc = billAmount - (billAmount * 0.1);
        return afterDisc;
    }
}
