package FinalTest.model;

public class ForeignPhone extends SmartPhone {
    private int GuaranteeTime;
    private String GuaranteeArea;

    public ForeignPhone(int ID, String name, double price, int quantity, String brand,int GuaranteeTime, String GuaranteeArea) {
        super(ID, name, price, quantity, brand);
        this.GuaranteeTime = GuaranteeTime;
        this.GuaranteeArea = GuaranteeArea;

    }

    public int getGuaranteeTime() {
        return GuaranteeTime;
    }

    public void setGuaranteeTime(int guaranteeTime) {
        GuaranteeTime = guaranteeTime;
    }

    public String getGuaranteeArea() {
        return GuaranteeArea;
    }

    public void setGuaranteeArea(String guaranteeArea) {
        GuaranteeArea = guaranteeArea;
    }

    @Override
    public String toString() {
        return "ForeignPhone" + super.toString()+
                "GuaranteeTime=" + GuaranteeTime + "years"+
                ", GuaranteeArea='" + GuaranteeArea + '\'' +
                '}';
    }
}
