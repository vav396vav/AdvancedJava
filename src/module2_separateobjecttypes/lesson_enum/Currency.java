package module2_separateobjecttypes.lesson_enum;

public enum Currency {
    USD("Доллар", 90.0),
    EUR("Евро", 100.0),
    RUB("Рубль", 1.0);

    private final String rusName;
    private final double course;

    Currency(String rusName, double course) {
        this.rusName = rusName;
        this.course = course;
    }

    public double convertToRub(double amount) {
        return amount * course;
    }

    public static void main(String[] args) {
        for (Currency currency : Currency.values()) {
            System.out.println("Валюта: " + currency.rusName +
                    ", курс: " + currency.course + " руб.");

        }
        System.out.println();

        double usdToRub = Currency.USD.convertToRub(100.0);
        double eurToRub = Currency.EUR.convertToRub(50.0);

        System.out.println("100 USD = " + usdToRub + " руб.");
        System.out.println("50 EUR = " + eurToRub + " руб.");;
    }
}
