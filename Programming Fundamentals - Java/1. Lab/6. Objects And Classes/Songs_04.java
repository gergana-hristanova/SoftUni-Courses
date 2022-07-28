package objectsandclasses_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs_04 {

    static class Song {
        String typeList;
        String name;
        String duration;

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }
        public void setDuration(String duration) {
            this.duration = duration;
        }

        public void  setTypeList(String typeList) {
            this.typeList = typeList;
        }

        public String getTypeList() {
        return this.typeList;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Song> songsList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] inputSongArr = scanner.nextLine().split("_");
            String inputTypeList = inputSongArr[0];
            String inputName = inputSongArr[1];
            String inputDuration = inputSongArr[2];

            Song currentSong = new Song();
            currentSong.setTypeList(inputTypeList);
            currentSong.setName(inputName);
            currentSong.setDuration(inputDuration);

            songsList.add(currentSong);
        }

        String command = scanner.nextLine();
        if (command.equals("all")) {
            for (Song item : songsList) {
                System.out.println(item.getName());
            }
        } else {
            for (Song item : songsList) {
                if (item.getTypeList().equals(command)) {
                    System.out.println(item.getName());
                }
            }
        }
    }
}