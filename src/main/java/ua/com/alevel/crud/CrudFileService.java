package ua.com.alevel.crud;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CrudFileService {

    public void createIO(String path) {
        File file = new File(path);
        if (path.contains(".")) {
            String absolutePath = file.getAbsolutePath();
            System.out.println("absolutePath = " + absolutePath);
            boolean exists = file.exists();
            System.out.println("exists = " + exists);
            try {
                file.createNewFile();
                exists = file.exists();
                System.out.println("exists = " + exists);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            boolean mkdir;
            if (!path.contains("/")) {
                mkdir = file.mkdir();
            } else {
                mkdir = file.mkdirs();
            }
            System.out.println("mkdir = " + mkdir);
        }
    }

    public void createNIO(String path) {
        Path path1 = Paths.get(path);
        if (path.contains(".")) {
            try {
                if (!path1.toFile().exists()) {
                    Files.createFile(path1);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            if (!path1.toFile().exists()) {
                try {
                    if (!path.contains("/")) {
                        Files.createDirectory(path1);
                    } else {
                        Files.createDirectories(path1);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void readAllFiles(String pathToFile) {
        File file = new File(pathToFile);
        boolean directory = file.isDirectory();
        if (directory) {
            readFiles(file);
        }
    }

    private void readFiles(File file) {
        System.out.println("dir = " + file);
        File[] files = file.listFiles();
        for (File innerFile : files) {
            if (innerFile.isDirectory()) {
                readFiles(innerFile);
            } else {
                System.out.println("file = " + innerFile.getName());
            }
        }
    }
}
