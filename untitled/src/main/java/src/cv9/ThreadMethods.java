package src.cv9;

import src.cv8.IOFileTool;

public class ThreadMethods {
    public void u1() {
        var thread = new Thread(() -> printChars('a', 'z'));
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(() -> printChars('A', 'Z')).start();
    }

    public void u2a(String filename, String fileToCopy) {
        IOFileTool io = new IOFileTool();
        new Thread(() -> {
            io.u3b(filename, fileToCopy);
            System.out.println("File was copied");
        }).start();
    }

    public void u2b(String filename1, String filename2, int multiply) {
        new IOFileTool().duplicateFileContent(filename1, filename2, multiply);
    }

    void printChars(int start, int stop) {
        for (int i = start; i <= stop; i++) {
            System.out.print((char)i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

}
