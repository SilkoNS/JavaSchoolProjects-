package src.cv10;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ToolFile {

    public static void fileInfo(File f) {
        if (f.isFile())
            System.out.println("File size: " + f.length() + " bytes, File name: " + f.getName());
        else if (f.isDirectory())
            System.out.println("Directory name: " + f.getName());
        else
            System.out.println("File isnt recognized");
    }

    public static void directoryInfoWithChild(File f) {
        if (!f.isDirectory()) {
            System.out.println(f + "is not a directory");
        } else {
            for (File file : f.listFiles()) {
                if (file.isDirectory())
                    directoryInfoWithChild(new File(file.getAbsolutePath()));
                else
                    System.out.println("File name: " + file.getAbsolutePath() + ", size: " + file.length() + " bytes");
            }
        }
    }

    public static void directoryInfo(File f) {
        if (!f.isDirectory()) {
            System.out.println(f + "is not a directory");
        } else {
            var files = new ArrayList<File>();
            var dirs = new ArrayList<File>();
            for (File file : Objects.requireNonNull(f.listFiles())) {
                if (file.isDirectory())
                    dirs.add(file);
                else
                    files.add(file);
            }
            for (File dir : dirs) {
                fileInfo(dir);
            }
            for (File file : files) {
                fileInfo(file);
            }
        }
    }

    public static List<File> getDirs(File f) {
        if (!f.isDirectory()) {
            System.out.println(f + "is not a directory");
            return null;
        }
        return Arrays.stream(Objects.requireNonNull(f.listFiles())).filter(File::isDirectory).collect(Collectors.toList());
    }

    public static List<File> getFiles(File f) {
        if (!f.isDirectory()) {
            System.out.println(f + "is not a directory");
            return null;
        }
        return Arrays.stream(Objects.requireNonNull(f.listFiles())).filter(File::isFile).collect(Collectors.toList());
    }
}
