package com.company.dsa;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FilesUtils {
    public static void traverseDirectories(String path) {
        File directory = new File(path);

        if (directory.isDirectory()) {
            System.out.println(directory.getName() + ":");
            traverse(directory, 1);
        }
    }

    private static void traverse(File file, int indentLevel) {

        File[] files = file.listFiles();
        if (files != null) {
            for (File fileInArray : files) {
                String spacings = "  ".repeat(indentLevel);
                if (fileInArray.isDirectory()) {
                    System.out.println(spacings + fileInArray.getName() + ":");
                    traverse(fileInArray, indentLevel + 1);
                } else {
                    System.out.println(spacings + fileInArray.getName());
                }
            }
        }
    }

    public static List<String> findFiles(String path, String extension) {
        List<String> fileNames = new ArrayList<>();
        File directory = new File(path);
        File[] files = directory.listFiles();
        if (files != null) {
            for (File fileInArray : files) {
                if (fileInArray.isDirectory()) {
                    fileNames.addAll(findFiles(fileInArray.getPath(), extension));
                } else {
                    if (fileInArray.getName().endsWith(extension)) {
                        fileNames.add(fileInArray.getName());
                    }
                }
            }
        }
        return fileNames;
    }

    public static boolean fileExists(String path, String fileName) {
        throw new UnsupportedOperationException();
    }

    public static Map<String, Integer> getDirectoryStats(String path) {
        throw new UnsupportedOperationException();
    }
}
