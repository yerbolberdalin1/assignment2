public class Car extends Vehicle  {
    protected int numberOfDoors;

    public Car(String model, int year, double basePrice, int numberOfDoors) {
        super(model, year, basePrice);
        this.numberOfDoors = numberOfDoors;
    }
    @Override
    public double calculateInsuranceFee() {
        return super.getBasePrice()*0.5;
    }

    @Override
    public void performService() {
        System.out.println( "Car service:filled up with gasoline");
    }

    @Override
    public int getSerivceInterval() {
        return 20000;
    }
    @Override
    public String toString() {
        return "id=" + id + ", model=" + model + ", year=" + year + ", basePrice=" + basePrice + ", numberOfDoors=" + numberOfDoors;
    }
}