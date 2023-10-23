
public class Main {

    public static void main(String[] args) {

        CheapWash cheapWash = new CheapWash();
        RegularWash regularWash = new RegularWash();
        PremiumWash premiumWash = new PremiumWash();

        CarWashService carWashService = new CarWashService();
        carWashService.setStrategy(cheapWash);
        CarWashService carWashService2 = new CarWashService();
        carWashService2.setStrategy(regularWash);
        CarWashService carWashService3 = new CarWashService();
        carWashService3.setStrategy(premiumWash);

        Car car1 = new Car(100);
        CarOwner carOwner1 = new CarOwner("Anna", 100);
        Car car2 = new Car(430);
        CarOwner carOwner2 = new CarOwner("Julia", 430);
        Car car3 = new Car(150);
        CarOwner carOwner3 = new CarOwner("John", 650);
        Car car4 = new Car(950);
        CarOwner carOwner4 = new CarOwner("Jimin", 230);
        Car car5 = new Car(620);
        CarOwner carOwner5 = new CarOwner("Alice", 2000);
        Car car6 = new Car(470);
        CarOwner carOwner6 = new CarOwner("San", 910);

        System.out.println("Welcome, " + carOwner1.name + ", your balance is: " + carOwner1.balance + ", your dirtiness is: " + car1.dirtiness);
        if (carWashService.wash(car1, carOwner1)) {
            System.out.println("Your balance after is: " + carOwner1.getBalance() + ", your dirtiness after is: " + car1.getDirtiness());
            System.out.println("The car has been washed successfully");
        }
        System.out.println(" ");
        System.out.println("Welcome, " + carOwner2.name + ", your balance is: " + carOwner2.balance + ", your dirtiness is: " + car2.dirtiness);
        if (carWashService.washAndDry(car2, carOwner2)) {
            System.out.println("Your balance after is: " + carOwner2.getBalance() + ", your dirtiness after is: " + car2.getDirtiness());
            System.out.println("The car has been successfully washed and dried");
        }
        System.out.println(" ");
        System.out.println("Welcome, " + carOwner3.name + ", your balance is: " + carOwner3.balance + ", your dirtiness is: " + car3.dirtiness);
        if (carWashService2.wash(car3, carOwner3)) {
            System.out.println("Your balance after is: " + carOwner3.getBalance() + ", your dirtiness after is: " + car3.getDirtiness());
            System.out.println("The car has been washed successfully");
        }
        System.out.println(" ");
        System.out.println("Welcome, " + carOwner4.name + ", your balance is: " + carOwner4.balance + ", your dirtiness is: " + car4.dirtiness);
        if (carWashService2.washAndDry(car4, carOwner4)) {
            System.out.println("Your balance after is: " + carOwner4.getBalance() + ", your dirtiness after is: " + car4.getDirtiness());
            System.out.println("The car has been successfully washed and dried");
        }
        System.out.println(" ");
        System.out.println("Welcome, " + carOwner5.name + ", your balance is: " + carOwner5.balance + ", your dirtiness is: " + car5.dirtiness);
        if (carWashService3.wash(car5, carOwner5)) {
            System.out.println("Your balance after is: " + carOwner5.getBalance() + ", your dirtiness after is: " + car5.getDirtiness());
            System.out.println("The car has been washed successfully");
        }
        System.out.println(" ");
        System.out.println("Welcome, " + carOwner6.name + ", your balance is: " + carOwner6.balance + ", your dirtiness is: " + car6.dirtiness);
        if (carWashService3.washAndDry(car6, carOwner6)) {
            System.out.println("Your balance after is: " + carOwner6.getBalance() + ", your dirtiness after is: " + car6.getDirtiness());
            System.out.println("The car has been successfully washed and dried");
        }
    }
}
