import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        AddressBook.addAll(
                new Entry("Timothy",
                        "John",
                        "555-555-5555",
                        "BobTim@aol.com"),
                new Entry("Gram",
                        "Oak",
                        "318-558-7420",
                        "Gramd@gmail.com"),
                new Entry("Susan",
                        "Cheeks",
                        "558-924-368",
                        "Cheeky@icloud.com")
        );
        Scanner scanner = new Scanner(System.in);
        Operations.makeSelection(scanner);
    }
}
