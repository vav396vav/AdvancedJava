package objectTypes_2.class_Record_4;

import objectTypes_2.class_Record_4.model.Account;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("ACCount1", BigDecimal.valueOf(1000.00),
                "Алексей", 40, true);
        Account account2 = new Account("ACCount2", BigDecimal.valueOf(500.50),
                "Александр",30, true);
        Account account3 = new Account("ACCount2", BigDecimal.valueOf(500.50),
                "Александр",30, true);

        System.out.println(account1);
        System.out.println(account1.hashCode());
        System.out.println(account2.equals(account3));
        System.out.println(account2 == account3);
    }
}
