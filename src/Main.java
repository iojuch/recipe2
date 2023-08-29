public class Main {
    public static void main(String[] args) {
        int onTheAccount = 100;
        int payment = 1100;
        int bonus = 100;
        int receivedBonus;
        if (payment > 1000) {
            receivedBonus = payment / bonus;
        } else {
            receivedBonus = 0;
        }
        int amount = onTheAccount + payment + receivedBonus;

        System.out.println("Сумма на счету:" + amount);

    }
}