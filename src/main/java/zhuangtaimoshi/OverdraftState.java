package zhuangtaimoshi;

//透支状态：具体状态类
class OverdraftState extends AccountState
{
    public OverdraftState(Account acc) {
        this.acc = acc;
    }

    public void deposit(double amount) {
        acc.setBalance(acc.getBalance() + amount);
        stateCheck();
    }

    public void withdraw(double amount) {
        acc.setBalance(acc.getBalance() - amount);
        stateCheck();
    }

    public void computeInterest() {
        System.out.println("计算利息！");
    }

    //状态转换
    public void stateCheck() {
        if (acc.getBalance() > 0) {
            acc.setState(new NormalState(this.acc));
        }
        else if (acc.getBalance() == -2000) {
            acc.setState(new RestrictedState(this.acc));
        }
        else if (acc.getBalance() < -2000) {
            System.out.println("操作受限！");
        }
    }
}
