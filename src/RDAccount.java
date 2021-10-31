public class RDAccount extends Account{
    int noOfMonths;
    double monthlyAmount;
    int ageOfACHolder;

    public RDAccount(int ageOfACHolder, int noOfMonths, double monthlyAmount) {
        super(ageOfACHolder);
        this.noOfMonths = noOfMonths;
        this.monthlyAmount = monthlyAmount;
    }

    @Override
    double calculateInterest() {
        if(noOfMonths>=21) {
            if (ageOfACHolder>=60) {
                interestRate=(monthlyAmount*9.25)/100;
            }
            else {
                interestRate=(monthlyAmount*8.75)/100;
            }
        }
        else if(noOfMonths>=18){
            if(ageOfACHolder>=60){
                interestRate=(monthlyAmount*9.0)/100;
            }
            else {
                interestRate=(monthlyAmount*8.5)/100;
            }
        }
        else if(noOfMonths>=15){
            if(ageOfACHolder>=60){
                interestRate=(monthlyAmount*8.75)/100;
            }
            else {
                interestRate=(monthlyAmount*8.25)/100;
            }
        }
        else if(noOfMonths>=12){
            if(ageOfACHolder>=60){
                interestRate=(monthlyAmount*8.5)/100;
            }
            else {
                interestRate=(monthlyAmount*8.0)/100;
            }
        }
        else if(noOfMonths>=9){
            if(ageOfACHolder>=60){
                interestRate=(monthlyAmount*8.25)/100;
            }
            else {
                interestRate=(monthlyAmount*7.75)/100;
            }
        }
        else if(noOfMonths>=6){
            if(ageOfACHolder>=60){
                return (monthlyAmount*8.0)/100;
            }
            else {
                return (monthlyAmount*7.5)/100;
            }
        }
        return interestRate;
    }
}
