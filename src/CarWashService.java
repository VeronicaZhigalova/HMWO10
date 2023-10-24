import java.util.ArrayList;
import java.util.List;

public class CarWashService implements WashStrategy {
    private WashStrategy strategy;
    private int totalWashes;
    private double moneyEarned;
    private List<String> blacklist;

    public CarWashService() {
        this.totalWashes = 0;
        this.moneyEarned = 0.0;
        this.blacklist = new ArrayList<>();
    }

    public WashStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(WashStrategy strategy) {
        this.strategy = strategy;
    }

    public int getTotalWashes() {
        return totalWashes;
    }

    public void setTotalWashes(int totalWashes) {
        this.totalWashes = totalWashes;
    }

    public double getMoneyEarned() {
        return moneyEarned;
    }

    public void setMoneyEarned(double moneyEarned) {
        this.moneyEarned = moneyEarned;
    }

    public List<String> getBlacklist() {
        return blacklist;
    }

    public void setBlacklist(List<String> blacklist) {
        this.blacklist = blacklist;
    }

    @Override
    public boolean wash(Car car, CarOwner carOwner) {
        if (isClientBlackListed(carOwner.name)) {
            throw new BlackListedException("You are in black list");
        }
        if (carOwner.getBalance() <= 0) {
            throw new NegativeBalanceException("You don't have enough money");
        }
        if (strategy == null) {
            return false;
        }
        strategy.wash(car, carOwner);
        totalWashes++;
        moneyEarned++;
        return true;
    }


    @Override
    public boolean washAndDry(Car car, CarOwner carOwner) {
        if (isClientBlackListed(carOwner.name)) {
            throw new BlackListedException("You are in black list");
        }
        if (carOwner.getBalance() <= 0) {
            throw new NegativeBalanceException("You don't have enough money");
        }
        if (strategy == null) {
            return false;
        }
        strategy.washAndDry(car, carOwner);
        totalWashes++;
        moneyEarned++;
        return true;
    }

    public boolean isClientBlackListed(String carOwner) {
        return blacklist.contains(carOwner);
    }

    public void addToBlacklist(String carOwner) {
        blacklist.add(carOwner);

    }
}
