package Account.Account3;

public class Account3 {
    public static void mainx() {

        Person p1 = new Person("Jarda", 30);
        Person p2 = new Person("Láďa", 50);

        Account u1 = new Account(p1, 500);
        Account u2 = new Account(p2, 1000);

        p1.myAccount.writeBalance();

       /* u1.writeBalance();
        u2.writeBalance();*/



    }

    public static class Person{
        public int age;
        public String name;
        Account myAccount;

        public Person(String name, int age ) {
            this.age = age;
            this.name = name;
        }
    }

    public static class Account {
        public int balance;
        public Person owner;

        public Account(Person ucet, int balance) {
            this.balance = balance;
            owner.name = ucet.name;
            owner.age = owner.age;
            owner.myAccount = ucet.myAccount;
        }

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
        public void writeBalance() {
            System.out.println("Owner is: " + owner.name + ", Ballance is: " + balance);
        }
    }
}











