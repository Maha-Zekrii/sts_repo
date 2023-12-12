import java.lang.Math;
public class BankAccount{

private double checkingBalance;
private double savingsBalance;
private static double numberOfAccount=0;
private static double totalMoney=0;
public long accountnum;

        
        public BankAccount(double checkingBalance, double savingsBalance){
            this.checkingBalance=checkingBalance;
            this.savingsBalance=savingsBalance;
            numberOfAccount++;
            totalMoney+=savingsBalance;
            accountnum=randin();
        }

public double getcheckingBalance(){
    return this.checkingBalance;
}

public double getsavingsBalance(){
    return this.savingsBalance;
}

public static double gettotalMoney(){
    return totalMoney;
}

public void setcheckingBalance(double checkingBalance){
     this.checkingBalance=checkingBalance;
}

public void setsavingsBalance(double savingsBalance){
     this.savingsBalance=savingsBalance;
}

public void addTosavingsBalance(double savingsBalance){
     this.savingsBalance+=savingsBalance;
     totalMoney+=this.savingsBalance;}

public void addTocheckingBalance(double checkingBalance){
     this.checkingBalance+=checkingBalance;

}
public void withdrow(double money){
    if(money<=this.checkingBalance){this.checkingBalance-=money; System.out.println("success retrieving money");}
     else{System.out.println("Fail to retrieve money, unsufficient sold");}

}
private long randin(){
    return (long) (Math.random()*Math.pow(10,10));
}

}