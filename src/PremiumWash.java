public class PremiumWash implements WashStrategy {

    private static final int WASH_PRICE = 25;
    private static final int WASH_AND_DRY_PRICE = 30;
    private static final int CLEAN_FACTOR = 100;

    @Override
    public boolean wash(Car car, CarOwner carOwner) {
        int dirtiness = car.getDirtiness();
        int newDirtiness = dirtiness - CLEAN_FACTOR;
        if (newDirtiness < 0) {
            newDirtiness = 0;
        }
        car.setDirtiness(newDirtiness);
        carOwner.setBalance(carOwner.balance - WASH_PRICE);
        return false;
    }

    @Override
    public boolean washAndDry(Car car, CarOwner carOwner) {
        int dirtiness = car.getDirtiness();
        int newDirtiness = dirtiness - CLEAN_FACTOR;
        if (newDirtiness < 0) {
            newDirtiness = 0;
        }
        car.setDirtiness(newDirtiness);
        carOwner.setBalance(carOwner.balance - WASH_AND_DRY_PRICE);
        return false;
    }

    public int getWashPrice() {
        return WASH_PRICE;
    }


    public int getWashAndDryPrice() {
        return WASH_AND_DRY_PRICE;
    }


    public int getCleanFactor() {
        return CLEAN_FACTOR;
    }
}
