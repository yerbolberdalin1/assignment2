import java.util.ArrayList;
import java.util.Scanner;

public class FleetApp {
    public ArrayList<Vehicle> vehicles = new ArrayList<>();
    public ArrayList<Servicable> vehicles1 = new ArrayList<>();
    Scanner cin = new Scanner(System.in);




    public void run() {
        while (true) {
            System.out.println(" 1. Print all vehicles\n" +
                    "2. Add new car\n" +
                    "3. Add new bus\n" +
                    "4. Show total yearly insurance fees\n" +
                    "5. Show vehicles older than N years\n" +
                    "6. Perform service for all vehicles\n" +
                    "7. Quit"
            );
            int choice = cin.nextInt();
            cin.nextLine();

            switch (choice) {
                case 1:
                    if(vehicles.size()>0) {
                        for(int i=0;i<vehicles.size();i++) {
                            System.out.println(vehicles.get(i).toString());
                        }
                    }
                    else System.out.println("There are no vehicles");
                    break;

                case 2:
                    System.out.println("Enter car model: ");
                    String model = cin.nextLine();
                    System.out.println("Enter car year: ");
                    int year = cin.nextInt();
                    cin.nextLine();
                    System.out.println("Enter car base price: ");
                    double basePrice = cin.nextDouble();
                    cin.nextLine();
                    System.out.println("Enter car number of doors: ");
                    int numberOfDoors = cin.nextInt();
                    cin.nextLine();
                    vehicles.add(new Car(model,year,basePrice,numberOfDoors));
                    vehicles1.add(new Car(model,year,basePrice,numberOfDoors));
                    break;

                case 3:
                    System.out.println("Enter bus model: ");
                    model = cin.nextLine();
                    System.out.println("Enter bus year: ");
                    year = cin.nextInt();
                    cin.nextLine();
                    System.out.println("Enter bus base price: ");
                    basePrice = cin.nextDouble();
                    cin.nextLine();
                    System.out.println("Enter bus passenger capacity: ");
                    int passengercapacity = cin.nextInt();
                    cin.nextLine();
                    vehicles.add(new Bus(model,year,basePrice,passengercapacity));
                    vehicles1.add(new Bus(model,year,basePrice,passengercapacity));
                    break;

                case 4:
                    for(int  i=0;i<vehicles.size();i++) {
                        System.out.println(vehicles.get(i).calculateInsuranceFee());
                    }
                    break;

                case 5:
                    int nn;
                    System.out.println("Number N:");
                    nn = cin.nextInt();
                    cin.nextLine();
                    for(int  i=0;i<vehicles.size();i++) {
                        if(vehicles.get(i).getYear()<nn) {
                            System.out.println(vehicles.get(i).toString());
                        }
                    }
                    break;

                case 6:
                    for(int  i=0;i<vehicles.size();i++) {
                        vehicles1.get(i).performService();
                    }
                    break;

                case 7:
                    System.out.print("GOOD BYE !!!! ");
                    return;
            }
        }
    }
    public static void main(String[] args) {
        new FleetApp().run();
    }
}