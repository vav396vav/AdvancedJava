package module2_separateobjecttypes.practical.scill;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // 1. Создаём габариты для ячеек и посылок
        Dimensions smallBox = new Dimensions(new BigDecimal("10"), new BigDecimal("10"), new BigDecimal("10"));
        Dimensions largeBox = new Dimensions(new BigDecimal("30"), new BigDecimal("30"), new BigDecimal("30"));

        // 2. Создаём посылки
        Shipment fragilePackage = new Shipment(smallBox, new BigDecimal("2.5"), "Хрупкая посылка");
        Shipment heavyPackage = new Shipment(largeBox, new BigDecimal("15.0"), "Тяжёлая посылка");

        // 3. Создаём ячейки постамата
        PostCell cell1 = new PostCell(smallBox); // Ячейка для маленькой посылки
        PostCell cell2 = new PostCell(largeBox); // Ячейка для большой посылки

        // 4. Создаём постамат
        PostCell[] cells = {cell1, cell2};
        Postamat postamat = new Postamat(cells);

        // 5. Пробуем положить посылки
        System.out.println("Пытаемся положить хрупкую посылку...");
        Integer index1 = postamat.putShipment(fragilePackage);
        if (index1 != null) {
            System.out.println("Посылка положена в ячейку #" + index1);
        }

        System.out.println("\nПытаемся положить тяжёлую посылку...");
        Integer index2 = postamat.putShipment(heavyPackage);
        if (index2 != null) {
            System.out.println("Посылка положена в ячейку #" + index2);
        }

        // 6. Пробуем положить ещё одну посылку в занятую ячейку
        System.out.println("\nПытаемся положить ещё одну посылку (должна не поместиться)...");
        Shipment anotherPackage = new Shipment(smallBox, new BigDecimal("1.0"), "Ещё одна");
        Integer index3 = postamat.putShipment(anotherPackage);
        if (index3 == null) {
            System.out.println("Не удалось положить посылку — нет свободных ячеек.");
        }

        // 7. Выводим общий вес всех посылок
        System.out.println("\nОбщий вес всех посылок в постамате: " + postamat.weightAllShipments());

        // 8. Извлекаем посылки
        System.out.println("\nИзвлекаем посылку из ячейки #0...");
        Shipment extracted = postamat.getShipment(0);
        if (extracted != null) {
            System.out.println("Извлечена посылка: " + extracted.description());
        }

        // 9. Выводим общий вес после извлечения
        System.out.println("\nОбщий вес после извлечения: " + postamat.weightAllShipments());
    }
}
