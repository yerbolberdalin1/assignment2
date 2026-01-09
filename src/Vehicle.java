abstract class Vehicle implements Servicable {
    protected int id;
    protected static int idGen=1;
    protected String model;
    protected int year;
    protected double basePrice;

    protected Vehicle(String model, int year, double basePrice) {
        id=idGen++;
        setModel(model);
        setYear(year);
        setBasePrice(basePrice);
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        if(model==null || model=="")throw new IllegalArgumentException();
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        if(year<1 || year>2026)throw new IllegalArgumentException();
        this.year = year;
    }
    public double getBasePrice() {
        return basePrice;
    }
    public void setBasePrice(double basePrice) {
        if(basePrice<=0)throw new IllegalArgumentException();
        this.basePrice = basePrice;
    }
    public int getAge(int CurrentYear){
        return CurrentYear-this.year;
    }
    public abstract double calculateInsuranceFee();

    @Override
    public String toString() {
        return "id=" + id + ", model=" + model + ", year=" + year + ", basePrice=" + basePrice;
    }
}