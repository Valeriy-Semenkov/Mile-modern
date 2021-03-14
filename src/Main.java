public class Main {
    public static void main(String[] args) {
        BonusMileService service = new BonusMileService();
        int price = 28_569;
        int miles = service.calculate(price);
        System.out.println(miles);
    }
}