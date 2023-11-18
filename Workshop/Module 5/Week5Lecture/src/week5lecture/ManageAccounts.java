package week5lecture;

public class ManageAccounts {

    public static void main(String[] args) {
        Account acct1, acct2;
        //create account1 for Sally with $1000
        acct1 = new Account("Sally", 11111, 1000);

        //create account2 for Joe with $500
        acct2 = new Account("Joe", 22222, 500);

        System.out.println(acct1);
        System.out.println(acct2);

        //deposit $100 to Joe's account
        acct2.deposit(100);

        //print Joe's new balance (use getBalance())
        System.out.println(acct2.getBalance());

        //withdraw $50 from Sally's account
        acct1.withdraw(50);

        //print Sally's new balance (use getBalance())
        System.out.println(acct1.getBalance());
        acct2.withdraw(650);

        //add interest to both accounts
        acct1.addInterest();
        acct2.addInterest();

        //change the name on Joe's account to Joseph
        acct2.setName("Joseph");

        //print summary for both accounts
        System.out.println(acct1);
        System.out.println(acct2);

        Account a3 = new Account("Carl", 123456);
        System.out.println(a3);

        Account a4 = new Account();
        System.out.println(a4);

    }
}
