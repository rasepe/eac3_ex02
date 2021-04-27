package cat.xtec.ioc.domain;

public class Joc {


    private String name;
    private int quantity;

    public Joc(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public Joc() {
    }

        public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}