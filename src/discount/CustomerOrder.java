package discount;

public class CustomerOrder {

    private String customerName;
    private double billAmount;
    private char discountType;
    private Deduction deduction;

    public CustomerOrder(String customerName, double billAmount, char discountType) {
        this.customerName = customerName;
        this.billAmount = billAmount;
        this.discountType = discountType;
    }

    public void setDeduction(Deduction newDeduction) {
        deduction = newDeduction;
    }

    public double getBillAmount() {
        switch (discountType) {
            case 'S':
            case 's':
                deduction = new Sales();
                deduction.getBillAmount(billAmount);
                break;
            case 'D':
            case 'd':
                deduction = new Discount();
                deduction.getBillAmount(billAmount);
                break;
            case 'L':
            case 'l':
                deduction = new Liquidation();
                deduction.getBillAmount(billAmount);
                break;
            default:
                deduction.getBillAmount(billAmount);
        }
        return deduction.getBillAmount(billAmount);
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "Customer{"
                + "customerName='" + customerName + '\''
                + ", billAmount=" + billAmount
                + ", discountType=" + discountType
                + '}';
    }
}
