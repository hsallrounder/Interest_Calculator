public class SBAccount extends Account{
    String typeOfAC;

    public SBAccount(double amount, String typeOfAC) {
        super(amount);
        this.typeOfAC = typeOfAC;
    }

    @Override
    double calculateInterest() {
        double rate=0;
        if(typeOfAC.equals("nri")){
            interestRate=(amount*6.0)/100;
        }
        else{
            interestRate=(amount*4.0)/100;
        }
        return interestRate;
    }
}
