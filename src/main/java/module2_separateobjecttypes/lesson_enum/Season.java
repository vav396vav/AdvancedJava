package module2_separateobjecttypes.lesson_enum;

import lombok.Getter;

public enum Season {
    WINTER("Зима", -10),
    SPRING("Весна", 10),
    SUMMER("Лето",25),
    AUTUMN("Осень",5);

    private final String russianName;
    private final int averageTemperature;

    Season(String russianName, int averageTemperature) {
        this.russianName = russianName;
        this.averageTemperature = averageTemperature;
    }

    public boolean isCold() {
        return averageTemperature <= 0;
    }

    public boolean isWarm() {
        return averageTemperature > 10;
    }

    public String getRecommendedActivity(Season season) {
        return switch (season) {
            case WINTER -> "Катание на лыжах";
            case SPRING -> "Прогулки в парке";
            case SUMMER -> "Пляжный отдых";
            case AUTUMN -> "Сбор грибов";
        };
    }
    public String getRecommendedActivity() {
        return switch (this) {
            case WINTER -> "Катание на лыжах";
            case SPRING -> "Прогулки в парке";
            case SUMMER -> "Пляжный отдых";
            case AUTUMN -> "Сбор грибов";
        };
    }

    public static void main(String[] args) {
        System.out.println("Холодное время года: ");
        for (Season season : Season.values()) {
            if (season.isCold()) {
                System.out.println(season.russianName + ", средняя температура: " +
                        season.averageTemperature + " градусов");
            }
        }

        System.out.println("\nТеплое время года: ");
        for (Season season : Season.values()) {
            if (season.isWarm()) {
                System.out.println(season.russianName + ", средняя температура: " +
                        season.averageTemperature + " градусов");
            }
        }
        System.out.println();
        for (Season season : Season.values()) {
            if (season.averageTemperature > 0 && season.averageTemperature < 15) {
                System.out.println(season.russianName + " " + season.averageTemperature +
                        " градусов" + " Рекомендуемая активность: " + season.getRecommendedActivity(season));
                System.out.println(season.russianName + " " + season.averageTemperature +
                        " градусов" + " Рекомендуемая активность: " + season.getRecommendedActivity());
            }
        }
    }
}
