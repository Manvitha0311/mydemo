import java.util.Scanner;
public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = scanner.nextLine().toLowerCase();
        int vowelCount = 0;
        for (char c : name.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);       
        scanner.close();
    }
}
