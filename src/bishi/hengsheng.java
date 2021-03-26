package bishi;

/**
 * @author ywt
 * @version 1.0
 * @date 2021/3/20 18:44
 */
class BankAccount {
    String name;
    double balance;
    int year;
    double rate = 0.01;

    public BankAccount(){
        this.balance = 10;
        this.year = 1;
    }
    public BankAccount(double balance,int year){
        this.balance = balance;
        this.year = year;
    }
    public void fetch() {
        this.balance = 0;
    }


    public double calcTotal() {
        return this.balance*this.rate*this.year + this.balance;
    }

    public void save(double money) {
        this.balance += money;
    }
}

public class hengsheng {
    public static void main(String[] args) {
        BankAccount tom = new BankAccount(1000,3);
        tom.save(2000);
        tom.calcTotal();
    }
}
