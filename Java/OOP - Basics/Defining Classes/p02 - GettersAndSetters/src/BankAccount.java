public class BankAccount {

    private int id;
    private double balance;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public void deposit(int amount){
        this.balance += amount;
    }

    public void withdraw(int amount){
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "ID " + this.id;
    }
}
