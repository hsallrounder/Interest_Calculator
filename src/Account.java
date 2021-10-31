public abstract class Account {
    double interestRate;
    double amount;
    int ageOfACHolder;

    public Account(double amount, int ageOfACHolder) {
        this.amount = amount;
        this.ageOfACHolder = ageOfACHolder;
    }

    public Account(double amount) {
        this.amount = amount;
    }

    public Account(int ageOfACHolder) {
        this.ageOfACHolder = ageOfACHolder;
    }

    abstract double calculateInterest();

}
