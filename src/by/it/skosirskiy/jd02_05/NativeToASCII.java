package by.it.skosirskiy.jd02_05;

import java.io.*;

public class NativeToASCII {
    public static void main(String[] args) {
        File dir = new File(System.getProperty("user.dir") +
                "/src/by/it/skosirskiy/jd02_05");
        if (dir.exists() && dir.isDirectory()) {
            File[] files = dir.listFiles();
            for (File file : files) {
                if (file.getName().contains(".txt"))
                    process(file);
            }
        } else
            System.out.println("ERROR!!!!!!!!!!!!!");
    }

    private static void process(File file) {
        File fileout=new File(file.getAbsolutePath()
                .replace(".txt",".properties"));
        try (BufferedReader r=new BufferedReader(new FileReader(file));
             BufferedWriter w=new BufferedWriter(new FileWriter(fileout))
        ){
            while (r.ready()) {
                int i = r.read();
                if (i<128)
                    w.write(i);
                else
                    w.write("\\u"+String.format("%04x",i));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file.getName());
    }
}
