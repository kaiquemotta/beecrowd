import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Criptografia {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int qntdEntrada = scanner.nextInt();
        scanner.nextLine();
        List<String> listEntrada = new ArrayList<>();
        for (int i = 0; i < qntdEntrada; i++) {
            String text = new String(scanner.nextLine());
            listEntrada.add(text);
        }

        for (String text : listEntrada) {
            StringBuilder encrypted = new StringBuilder();

            for (int j = 0; j < text.length(); j++) {
                char rotChar = text.charAt(j);
                if (Character.isUpperCase(rotChar) || Character.isLowerCase(rotChar)) {
                    int valueASCII = Integer.valueOf(rotChar + 3);
                    char newChar = (char) valueASCII;
                    encrypted.append(String.valueOf(newChar));
                } else {
                    encrypted.append(String.valueOf(rotChar));
                }
            }
            StringBuilder newString = new StringBuilder();

            for (int j = encrypted.length(); j > 0; j--) {
                int position = j - 1;
                char c = encrypted.charAt(position);
                newString.append(c);
            }


            int metade = newString.length() / 2;
            StringBuilder finalString = new StringBuilder(newString.substring(0, metade));
            for (int j = metade; j < newString.length(); j++) {
                int valueSCII = Integer.valueOf(newString.charAt(j) - 1);
                char c = (char) valueSCII;
                finalString.append(c);
            }
            System.out.println(finalString);
        }
    }
}
