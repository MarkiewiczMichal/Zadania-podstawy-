public class Account
{
    double balance = 0;
    static double interestRate;

    public void deposit(double deposit)
    {
        if(deposit >= 0){
            balance =balance+deposit;
        }


    }

    public void withdraw(double withdraw)
    {
        if (withdraw >= 0)
        {
            if (balance < withdraw)
            {
                System.out.println("Zbyt mało środków na koncie. Stan konta: " + balance);
            } else
            {
                balance = balance - withdraw;
            }
        }
    }

    public void transfer(Account account, double transferMoney)
    {
        if (this.balance <= transferMoney)
        {
            account.balance = account.balance + this.balance;
            this.balance = 0;
        } else
        {
            this.balance = this.balance - transferMoney;
            account.balance = account.balance + transferMoney;
        }
    }

    public void addInterest()
    {
        balance = balance+(interestRate / 100) * balance;
    }

    public static void setInterestRate(double interestRate)
    {
        if (interestRate >= 0)
        {
            Account.interestRate = interestRate;
        }
    }
}
