import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch=0;
        while(ch!=1) {
            System.out.println("Select the option:");
            System.out.println("\t1. Interest Calculator–SB");
            System.out.println("\t2. Interest Calculator–FD");
            System.out.println("\t3. Interest Calculator–RD");
            System.out.println("\t4. Exit");
            int choice = sc.nextInt();
            boolean validity=true;
            double rate=0;
            switch (choice){
                case 1:{
                    System.out.println("Enter the Average amount in your account:");
                    int a = sc.nextInt();
                    System.out.println("Enter your Type('NRI'/'Normal') of Account:");
                    String b = sc.next().toLowerCase();
                    SBAccount obj = new SBAccount(a,b);
                    rate=obj.calculateInterest();
                }
                break;

                case 2:{
                    System.out.println("Enter the Average amount in your account:");
                    int a = sc.nextInt();
                    System.out.println("Enter the number of days:");
                    int c = sc.nextInt();
                    System.out.println("Enter your age:");
                    int d = sc.nextInt();
                    if(c<7){
                        validity=false;
                    }
                    FDAccount obj = new FDAccount(a,d,c);
                    rate=obj.calculateInterest();
                }
                break;

                case 3:{
                    System.out.println("Enter the Monthly deposit in your account:");
                    int a = sc.nextInt();
                    System.out.println("Enter the number of months:");
                    int e = sc.nextInt();
                    System.out.println("Enter your age:");
                    int d = sc.nextInt();
                    if(e<6){
                        validity=false;
                    }
                    RDAccount obj = new RDAccount(d,e,a);
                    rate=obj.calculateInterest();
                }
                break;

                case 4:
                    ch=1;
                    break;

                default:
                    System.out.println("Invalid Input");
                    break;
            }
            if(choice!=4) {
                if(validity){
                    System.out.println("Interest gained: Rs. " + rate);
                    }
                else {
                    System.out.println("You may have entered any invalid value. Please enter correct values.");
                }
            }
        }
    }
}
