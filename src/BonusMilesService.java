public class BonusMilesService<miles> {
    public static int calculate(int price) {
        int miles = price / 20;
        return miles;
    }

}