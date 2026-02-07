package module11_exceptions_debugging.lesson4_exception_handling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Scil {
    public static void main(String[] args) {
//        BufferedReader reader = null;
//        FileReader fileReader = null;
//
//        try {
//            fileReader = new FileReader("file.txt");
//            reader = new BufferedReader(fileReader);
//            String data = reader.readLine();
//            doSomething(data);
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found: ");
//        } catch (IOException e){
//            System.out.println("IO Exception: ");
//        } finally {
//            try {
//                reader.close();
//                fileReader.close();
//            } catch (IOException e) {
//                System.out.println("Error closing file: ");
//            }
//        }

        try (FileReader fileReader = new FileReader("file.txt");
             BufferedReader reader = new BufferedReader(fileReader);){
            String data = reader.readLine();
            doSomething(data);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: ");
        } catch (IOException e){
            System.out.println("IO Exception: ");
        }
    }

    public static void doSomething (String data) {
        System.out.println("Do something with data: ");
    }
}
