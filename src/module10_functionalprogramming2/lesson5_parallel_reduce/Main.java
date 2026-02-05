package module10_functionalprogramming2.lesson5_parallel_reduce;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Employee> employee =  Stream.of(
                new Employee(100000, LocalDate.of(2020, 12, 10)),
                new Employee(120000, LocalDate.of(2025, 10, 4)),
                new Employee(80000, LocalDate.of(2025, 6, 30)),
                new Employee(205000, LocalDate.of(2018, 7, 17)),
                new Employee(170000, LocalDate.of(2025, 10, 26)),
                new Employee(70000, LocalDate.of(2023, 8, 14))
        );

//        int sum = employee
//                .filter(e -> e.getHiringDate().isBefore(LocalDate.now().minusYears(1)))
//                .map(Employee::getSalary)
//                .reduce(0, Integer::sum);
//        System.out.println(sum);

        Optional<Employee> employee1 = employee
                .filter(e -> e.getHiringDate().isBefore(LocalDate.now().minusYears(1)))
                .max(Comparator.comparing(Employee::getSalary));
        System.out.println(employee1.get().getSalary());

    }
}
