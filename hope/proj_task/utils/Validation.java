package utils;

public class Validation {

    public static boolean valid(int qty, double price) {
        return qty > 0 && price > 0;
    }
}