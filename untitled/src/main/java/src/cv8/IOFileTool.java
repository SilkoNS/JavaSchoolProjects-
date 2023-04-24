package src.cv8;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.stream.Collectors;

public class IOFileTool {
    public void u2() {
        Path path = Paths.get("int_long.txt");
        try {
            Files.write(path, longToBytes(2131423));
            Files.write(path, intToBytes(2133), StandardOpenOption.APPEND);
            var bytes = Files.readAllBytes(path);
            var bytesForLong = new byte[8];
            var bytesForInt = new byte[4];
            for (int i = 0; i < 8; i++) {
                bytesForLong[i] = bytes[i];
            }
            for (int i = 0; i < 4; i++) {
                bytesForInt[i] = bytes[8 + i];
            }
            long b = bytesToLong(bytesForLong);
            int a = bytesToInt(bytesForInt);
            for (int i = 0; i < 4; i++) {
                bytesForInt[i] = bytes[i];
            }
            for (int i = 0; i < 8; i++) {
                bytesForLong[i] = bytes[4 + i];
            }
            b = bytesToLong(bytesForLong);
            a = bytesToInt(bytesForInt);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void u3a(String filename) {
        Path path = Paths.get(filename);
        try {
            System.out.println("Pocet znaku v souboru: " + Files.readString(path).length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void u3b(String filename, String filename2) {
        File copied = new File(filename2);

        if (!copied.exists()) {
            try {
                copied.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try (
                InputStream in = new BufferedInputStream(
                        new FileInputStream(filename));
                OutputStream out = new BufferedOutputStream(
                        new FileOutputStream(copied))) {

            byte[] buffer = new byte[1024 * 100];
            while (in.read(buffer) > 0) {
                var filtered = Arrays.stream(new String(buffer).split("\n"))
                        .filter(s -> !s.isEmpty() && !s.isBlank())
                        .map(String::trim)
                        .collect(Collectors.joining("\n")).getBytes(StandardCharsets.UTF_8);
                out.write(filtered, 0, filtered.length);
                out.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void duplicateFileContent(String filename, String copied, int multiply) {
        var path = Paths.get(filename);
        var path2 = Path.of(copied);

        var file = new File(copied);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            var strings = String.join("\n", Files.readAllLines(path));
            for (int i = 0; i < multiply; i++) {
                Files.writeString(path2, strings, StandardOpenOption.APPEND);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public <T extends Serializable> void serialize(T obj, String filename) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(filename);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(obj);
            objectOutputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @SuppressWarnings("unchecked")
    public <T extends Serializable> T deserialize(String filename) {
        try (FileInputStream fileInputStream
                     = new FileInputStream(filename);
             ObjectInputStream objectInputStream
                     = new ObjectInputStream(fileInputStream)) {
            T obj = (T) objectInputStream.readObject();
            objectInputStream.close();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    static public byte[] longToBytes(long x) {
        ByteBuffer buffer = ByteBuffer.allocate(Long.BYTES);
        buffer.putLong(x);
        return buffer.array();
    }

    static public byte[] intToBytes(int x) {
        ByteBuffer buffer = ByteBuffer.allocate(Integer.BYTES);
        buffer.putInt(x);
        return buffer.array();
    }

    static public long bytesToLong(byte[] bytes) {
        ByteBuffer buffer = ByteBuffer.allocate(Long.BYTES);
        buffer.put(bytes);
        buffer.flip();//need flip
        return buffer.getLong();
    }

    static public int bytesToInt(byte[] bytes) {
        ByteBuffer buffer = ByteBuffer.allocate(Integer.BYTES);
        buffer.put(bytes);
        buffer.flip();//need flip
        return buffer.getInt();
    }


}
