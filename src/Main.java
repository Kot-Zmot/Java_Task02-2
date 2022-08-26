public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        // Счет
        int account = 100;
        // Пополнение счета
        int replenishment = 350;

        int bonus = 0;

        if (replenishment > 1000) {
            bonus = replenishment / 100;
        }
        account = account + replenishment + bonus;
        System.out.println("Итоговая сумма по Вашему счету составляет " + account + " руб. Из них " + bonus + " руб. - бонусное начисление средств.");
    }
}