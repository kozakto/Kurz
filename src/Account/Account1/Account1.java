package Account.Account1;

public class Account1 {
    public static void mainx() {


        Account u1 = new Account();
        Account u2 = new Account();

        u1.insetInto(100);
        u2.insetInto(100);

        u1.writeBalance();
        u2.writeBalance();
        System.out.println("------------");

        u1.transferTo(u2, 50);

        u1.writeBalance();
        u2.writeBalance();
        System.out.println("------------");

        u1.transferTo(u2);  // excercise 1b
        u1.writeBalance();
        u2.writeBalance();

    }

    public static class Account {
        public int balance;

        public void insetInto(int amount) {
            balance += amount;
        }
        public void transferTo(Account account, int amount) {


            if (amount > balance) {
                System.out.println("Not enough money on balance");

            } else {
                balance -= amount;
                account.balance += amount;
            }
        }

                                                        // excercise  1b
        public void transferTo(Account account) {

            account.balance += balance;
            balance -= balance;
            transferTo(account, this.balance);

        }


        public void writeBalance() {
            System.out.println("Ballance is: " + balance);
        }
    }
}











