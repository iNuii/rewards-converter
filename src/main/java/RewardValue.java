public class RewardValue {
    private double cashValue;
    private double milesValue;
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertCashToMilesValue(cashValue);
    }
    public double getCashValue() {
        return cashValue;
    };

    public double getMilesValue() {
        return milesValue;
    }

    private double convertCashToMilesValue(double miles) {
        return miles * 0.0035;
    }

}
