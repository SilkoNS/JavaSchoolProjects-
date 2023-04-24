package src.cv10;

import java.io.File;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Faktura faktura = new Faktura();
        System.out.println(faktura);
        Faktura faktura1 = new Faktura(Date.from(Instant.now().minus(10, ChronoUnit.DAYS)));
        System.out.println(faktura1);
        ToolFile.fileInfo(new File("C:\\Users\\Hende\\Downloads\\untitled\\src\\main\\java\\src\\cv10\\Main.java"));
        File f = new File("C:\\Users\\Hende\\Downloads\\untitled");
        ToolFile.directoryInfo(f);
        ToolFile.directoryInfoWithChild(f);
        ToolFile.getDirs(f);
        ToolFile.getFiles(f);
    }
}
