
public class RewardValue {

    private final double cash;
    private final int miles;
    protected static final double MILES_TO_CASH = 0.0035;


    public RewardValue(double cash){
        this.cash = cash;
        this.miles = (int)(cash/MILES_TO_CASH);
    }
    public RewardValue(int miles){
        this.cash = miles * MILES_TO_CASH;
        this.miles = miles;
    }
    public double getCashValue() {
        return this.cash;
    }
    public int getMilesValue() {
        return this.miles;
    }

}
