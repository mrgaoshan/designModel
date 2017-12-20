package zhuangtaimoshi;

/**
 * Created by kasimodo on 2017-12-20.
 */
abstract class AccountState {
    protected Account acc;
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void computeInterest();
    public abstract void stateCheck();
}
