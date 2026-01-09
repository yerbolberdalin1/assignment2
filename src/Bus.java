public class Bus extends Vehicle  {
    protected int passengerCapacity;

    public Bus(String model, int year, double basePrice, int passengerCapacity) {
        super(model, year, basePrice);
        this.passengerCapacity = passengerCapacity;
    }
    @Override
    public double calculateInsuranceFee() {
        return super.year*passengerCapacity;
    }

    @Override
    public void performService() {
        System.out.println("Bus service:changed oil and replaced mator");
    }

    @Override
    public int getSerivceInterval() {
        return 10000;
    }
    @Override
    public String toString() {
        return "id=" + id + ", model=" + model + ", year=" + year + ", basePrice=" + basePrice + ", passengerCapacity=" + passengerCapacity;
    }
}