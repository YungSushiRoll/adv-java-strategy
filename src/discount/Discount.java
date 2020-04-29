package discount;

public class Discount implements Deduction {
    @Override
    public double getBillAmount(double billAmount) {
        double afterDisc = billAmount - (billAmount * 0.5);
        return afterDisc;
    }
}
