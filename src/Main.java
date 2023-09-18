public class Main {

    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10000;
        int bonus = 20;
        int miles = service.calculate(price); //
        int finalbonus = price / bonus; // Итоговый бонус

        if (finalbonus > 1000) {
            System.out.println("Итоговый бонус положительный");
        }


        System.out.println("Итоговая сумма счета:");
        System.out.println((price / bonus) + " миль");


    }
}
