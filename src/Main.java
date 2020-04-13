public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();


        int miles = BonusMilesService.calculate(5000);

        System.out.println("Начислено бонусных миль: " + miles);
    }
}