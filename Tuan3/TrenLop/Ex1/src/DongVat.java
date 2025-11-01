public class DongVat {
    String name;
    int year;
    String description;
    double weight;
    public DongVat(){
        this.name="Ne Lam";
        this.year=2005;
        this.description="bi ngu";
        this.weight=100;
    }
    public DongVat(String name, int year,String description, double weight){
        this.name=name;
        this.year=year;
        this.description=description;
        this.weight=weight;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Year: "+year);
        System.out.println("Description: "+description);
        System.out.println("Weight: "+weight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
