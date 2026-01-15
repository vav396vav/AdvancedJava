package module2_separateobjecttypes.practical.qwen.enums;

public enum ProductCategory {
    FOOD("Еда"),
    ELECTRONICS("Электроника"),
    CLOTHES("Одежда");

    private String displayName;

    ProductCategory(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
