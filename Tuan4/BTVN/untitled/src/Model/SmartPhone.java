package Model;

public class SmartPhone extends Product{
    private boolean has5G;

    public SmartPhone() {
        super();
        this.has5G = false;
    }

    public SmartPhone(String name, String description, double price, boolean has5G) {
        super(name, description, price);
        this.has5G = has5G;
    }


    @Override
    public String getInfo() {
        String x;
        if(!this.has5G){
            x = "no";
        }
        else{
            x = "yes";
        }
        return "SmartPhone{" + super.getInfo() +
                "has5G=" + x +
                '}';
    }

}
