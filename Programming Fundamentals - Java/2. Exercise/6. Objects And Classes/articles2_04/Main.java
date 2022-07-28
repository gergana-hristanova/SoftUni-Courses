package articles2_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<articles2_04.Article> articlesList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] articleData = scanner.nextLine().split(", ");
            String title = articleData[0];
            String content = articleData[1];
            String author = articleData[2];

            articles2_04.Article article = new articles2_04.Article(title, content, author);
            articlesList.add(article);
        }

        String input = scanner.nextLine();

        for (Article element : articlesList) {
            System.out.println(element.toString());
        }
    }
}