package module2_separateobjecttypes.practical.qwen.utils;

public class ProductValidator {

    public static boolean isValidPrice(double price) {
        if (Double.isNaN(price) || Double.isInfinite(price)) {
            return false;
        }
        return true;
    }
}

