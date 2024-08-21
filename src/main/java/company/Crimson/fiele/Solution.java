package Crimson.fiele;

import java.util.*;

public class Solution {

    private final Map<String, List<String>> fileTypes = new HashMap<>(3);

    public Solution() {
        List<String> music = new ArrayList<>();
        music.add("mp3");
        music.add("aac");
        music.add("flac");
        fileTypes.put("music", music);

        List<String> images = new ArrayList<>();
        images.add("jpg");
        images.add("bmp");
        images.add("gif");
        fileTypes.put("images", images);

        List<String> movies = new ArrayList<>();
        movies.add("mp4");
        movies.add("avi");
        movies.add("mkv");
        fileTypes.put("movies", movies);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String files = "my.song.mp3 11b\n" +
                "greatSong..flac 1000b\n" +
                "not3.txt 5b\n" +
                "not3.jpg 6b\n" +
                "not3.bmp 5b\n" +
                "video.mp4 200b\n" +
                "game.exe 100b\n" +
                "mov!e.mkv 10000b\n";
        System.out.println(s.solution(files));
    }

    public String solution(String s) {

        //List<String> files = Arrays.asList(s.split(System.getProperty("line.separator")));
        List<String> files = Arrays.asList(s.split("\\r?\\n"));

        Map<String, String> fileAndSize = new HashMap<>(files.size());
        files.stream()
                .filter(e -> e.contains(" "))
                .forEach(f -> {
                    String[] filePair = f.split(" ");
                    fileAndSize.put(filePair[0], filePair[1].substring(0, filePair[1].length() - 1));
                });

        Map<String, Integer> result = new LinkedHashMap<>();
        result.put("music", 0);
        result.put("images", 0);
        result.put("movies", 0);
        result.put("other", 0);

        fileAndSize.forEach((fileName, value) -> {
            String extension = fileName.substring(fileName.lastIndexOf(".") + 1);
            String type = identifyFileType(extension);

            result.merge(type, Integer.parseInt(value), Integer::sum);
        });

        StringBuilder resultStr = new StringBuilder();
        result.forEach((key, value) -> resultStr.append(key)
                .append(" ")
                .append(value)
                .append("b")
                .append(System.lineSeparator()));
        return resultStr.toString();
    }

    private String identifyFileType(String extension) {
        Optional<Map.Entry<String, List<String>>> result =
                fileTypes.entrySet()
                        .stream()
                        .filter(entry -> entry.getValue().contains(extension))
                        .findFirst();
        return result.isPresent() ? result.get().getKey() : "other";
    }
}
