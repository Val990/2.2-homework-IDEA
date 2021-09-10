public class Main {

    public static void main(String[] args) {
        int initialAccount = 100;
        int deposit = 1100;
        int bonus;
        int total;

        if (deposit <= 1000) {
            bonus = 0;
            total = initialAccount + deposit + bonus;
            System.out.println("Общий баланс:" + total);
            System.out.println("Бонус:" + bonus);
        } else {
            bonus = deposit / 100;
            total = initialAccount + deposit + bonus;
            System.out.println("Общий баланс:" + total);
            System.out.println("Бонус:" + bonus);
        }
        }
    }
