package org.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class InputOutput {
    public static void Test() {
        try {
            BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\18180017\\OneDrive - Vanier College\\testSort\\Test.txt"));
            String line;
            String content = "";
            int num = 0;
            while ((line = bf.readLine()) != null) {
                if (line.contains("qui")) {
                    content += "qui";
                }
            }
            System.out.println(content);
            BufferedWriter br = new BufferedWriter(new FileWriter("C:\\Users\\18180017\\OneDrive - Vanier College\\testSort\\Test.txt"));
            br.write(content);
            br.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
