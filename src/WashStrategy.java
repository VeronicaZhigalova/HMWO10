public interface WashStrategy {

    boolean wash(Car car, CarOwner carOwner);

    boolean washAndDry(Car car, CarOwner carOwner);


}
