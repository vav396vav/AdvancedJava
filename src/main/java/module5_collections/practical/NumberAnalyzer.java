package module5_collections.practical;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumberAnalyzer {
    int SumOfUniqueNumbers;

    List<Integer> numbers = new ArrayList<>();
    Set<Integer> uniqueNumbers = new HashSet<>();

    public void addNumber(int number) {
        numbers.add(number);
    }

    public void printAllNumbers() {
        for (int number : numbers){
            System.out.println(number);
        }
    }
}
