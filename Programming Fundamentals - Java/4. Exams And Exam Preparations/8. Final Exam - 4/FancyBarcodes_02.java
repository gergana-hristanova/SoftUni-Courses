package final_exam_04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Pattern pattern = Pattern.compile("^@#+(?<barcode>[A-Z][A-Za-z\\d]{4}[A-Za-z\\d]*[A-Z])@#+$");

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            String barcode;
            Matcher matcher = pattern.matcher(input);
            if(matcher.find()) {
                barcode = matcher.group("barcode");
            } else {
                System.out.println("Invalid barcode");
                continue;
            }

            StringBuilder productGroup = new StringBuilder();
            for (char symbol : barcode.toCharArray()) {
                if (Character.isDigit(symbol)) {
                    productGroup.append(symbol);
                }
            }

            if (productGroup.length() == 0) {
                productGroup = new StringBuilder("00");
            }

            System.out.println("Product group: " + productGroup);
        }
    }
}