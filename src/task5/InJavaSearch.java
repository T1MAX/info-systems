package task5;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class InJavaSearch {

    public static void main(String[] args) {
        javaFilesSearch("C:\\Program Files\\Java\\jdk1.8.0_121\\src.zip");
    }

    public static void javaFilesSearch(String zip) {

        try (ZipFile zipFile = new ZipFile(zip)) {
            List<ZipEntry> result = zipFile.stream()
                    .filter(zipEntry -> !zipEntry.isDirectory())
                    .filter(zipEntry -> zipEntry.getName().endsWith(".java"))
                    .filter(zipEntry -> containsText(zipFile, zipEntry, "transient") || containsText(zipFile, zipEntry, "volatile"))
                    .collect(Collectors.toList());

            for (ZipEntry ze : result) {
                System.out.println(ze.getName());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static boolean containsText(ZipFile zipFile, ZipEntry zipEntry, String word) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(zipFile.getInputStream(zipEntry)));

            return reader.lines().filter(l -> l.contains(word)).findAny().isPresent();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

}
