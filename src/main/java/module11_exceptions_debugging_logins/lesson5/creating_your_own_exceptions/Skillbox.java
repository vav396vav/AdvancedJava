package module11_exceptions_debugging_logins.lesson5.creating_your_own_exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Skillbox {
    public static void main(String[] args) throws IOException {

        readLineFromFile("");
    }

    public static String readLineFromFile(String fileName) throws IOException {
        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader reader = new BufferedReader(fileReader)) {
            return reader.readLine();
        } catch (FileNotFoundException e) {
            if (!isFileNameValid(fileName)) {
                throw new IncorrectFileNameException("File name " + fileName + " is not valid");
            } else {
                throw e;
            }
        }
    }


    public static boolean isFileNameValid(String fileName) {
        // checkins file name
        return false;
    }
}
