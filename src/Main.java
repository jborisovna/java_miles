public class Main {
    public static void main(String[] args) {
        int price = 12000;
        int oneMile = 20;
        int bonusMiles = price / oneMile * 1;

        System.out.println("Начислено бонусных миль: " + bonusMiles);
    }
}