package io.file;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadTextFileV2 {

    public static final String PATH = "temp/hello2.txt";

    public static void main(String[] args) throws IOException {

        String writeString = "abc\n가나다";
        System.out.println("== Write String ==");
        System.out.println(writeString);

        Path path = Path.of(PATH);

        // 쓰기
        Files.writeString(path, writeString, StandardCharsets.UTF_8);

        // 읽기
        System.out.println("== Read String ==");

        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
        for (int i = 0; i < lines.size(); i++) {
            System.out.println((i + 1) + ": " + lines.get(i));
        }
    }
}
