package bank;

public class Bank {
        String name = "sukumar";
        double availableBalance = 50005.93;
        long accountNumber = 6285843331l;
        public void transferAmount(double amount) {
            availableBalance = availableBalance - amount;
            System.out.println(availableBalance);
        }
        public static void main(String[] args) {
            Bank bank = new Bank();
//        System.out.println(bank.name);
//        System.out.println(bank.availableBalance);
//        System.out.println(bank.accountNumber);
            bank.transferAmount(10000);
    }

}
