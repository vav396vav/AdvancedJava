package module2_separateobjecttypes.lesson4_record.easy;

public record Product(String name, double price, int quantity) {

    public double getTotalCost(){
        return price * quantity;
    }

    public boolean isInStock(){
        return quantity > 0;
    }

    public static void main(String[] args) {
        Product a = new Product("Хлеб",45,10);
        System.out.println(a);
        System.out.println(a.getTotalCost());
        System.out.println(a.isInStock());
    }
}
