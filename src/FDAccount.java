public class FDAccount extends Account{
    int noOfDays;

    public FDAccount(double amount, int ageOfACHolder, int noOfDays) {
        super(amount, ageOfACHolder);
        this.noOfDays = noOfDays;
    }

    @Override
    double calculateInterest() {
        if(amount<10000000){
            if(noOfDays>=185 && noOfDays<366) {
                if (ageOfACHolder>=60) {
                    interestRate=(amount*8.5)/100;
                }
                else {
                    interestRate=(amount*8.0)/100;
                }
            }
            else if(noOfDays>=61){
                if(ageOfACHolder>=60){
                    interestRate=(amount*8.0)/100;
                }
                else {
                    interestRate=(amount*7.5)/100;
                    }
            }
            else if(noOfDays>=45){
                if(ageOfACHolder>=60){
                    interestRate=(amount*7.5)/100;
                }
                else {
                    interestRate=(amount*7.0)/100;
                }
            }
            else if(noOfDays>=30 && noOfDays<45){
                if(ageOfACHolder>=60){
                    interestRate=(amount*6.0)/100;
                }
                else {
                    interestRate=(amount*5.5)/100;
                }
            }
            else if(noOfDays>=15 && noOfDays<29){
                if(ageOfACHolder>=60){
                    interestRate=(amount*5.25)/100;
                }
                else {
                    interestRate=(amount*4.75)/100;
                }
            }
            else if(noOfDays>=7 && noOfDays<14){
                if(ageOfACHolder>=60){
                    return (amount*5.0)/100;
                }
                else {
                    return (amount*4.5)/100;
                }
            }
        }
        else{
            if(noOfDays>=185 && noOfDays<366) {
                interestRate=(amount*10.0)/100;
            }
            else if(noOfDays>=61){
                interestRate=(amount*8.5)/100;
            }
            else if(noOfDays>=45){
                interestRate=(amount*8.0)/100;
            }
            else if(noOfDays>=30 && noOfDays<45){
                interestRate=(amount*6.75)/100;
            }
            else if(noOfDays>=15 && noOfDays<29){
                interestRate=(amount*6.75)/100;
            }
            else if(noOfDays>=7 && noOfDays<14){
                interestRate=(amount*6.5)/100;
            }
        }
        return interestRate;
    }
}

