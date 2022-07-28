package textprocessing_08;

import java.util.Scanner;

public class ExtractFile_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String filePath = scanner.nextLine();
        String[] filePathArr = filePath.split("[.\\\\]");

        String fileName = filePathArr[filePathArr.length - 2];
        String fileExtension = filePathArr[filePathArr.length - 1];

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + fileExtension);
    }
}