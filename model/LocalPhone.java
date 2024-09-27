package FinalTest.model;

public class LocalPhone extends SmartPhone {
    private String nation;
    private String condition;

    public LocalPhone(int ID, String name, double price, int quantity, String brand,String nation, String condition) {
        super(ID, name, price, quantity, brand);
        this.nation = nation;
        this.condition = condition;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "LocalPhone{" + super.toString() +
                "nation='" + nation + '\'' +
                ", condition='" + condition + '\'' +
                '}';
    }
}
