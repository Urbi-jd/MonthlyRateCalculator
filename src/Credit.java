public class Credit {
    private double creditValue;
    private int numberOfYears;
    private double interestRate;

    public Credit(double creditValue, int numberOfYears, double interestRate) {
        this.creditValue = creditValue;
        this.numberOfYears = numberOfYears;
        this.interestRate = interestRate;
    }


    public double getCreditValue() {
        return creditValue;
    }

    public void setCreditValue(double creditValue) {
        this.creditValue = creditValue;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

}
