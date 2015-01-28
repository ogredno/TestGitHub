package com.company;
import java.io.*;
/**
 * Created by Серёга on 28.01.2015.
 */
public class FileWork {
    public static void write(String fileName, String text) {
        //Определяем файл
        File file = new File(fileName);

        try {
            //проверяем, что если файл не существует то создаем его
            if (!file.exists()) {
                file.createNewFile();
            }

            //PrintWriter обеспечит возможности записи в файл
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());

            try {
                //Записываем текст у файл
                out.print(text);
            } finally {
                //После чего мы должны закрыть файл
                //Иначе файл не запишется
                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String text = "This new text \nThis new text2\nThis new text3\nThis new text4\n";
    private static String fileName = "C://blog/a.txt";

    public static void main(String[] args) throws FileNotFoundException {
        FileWork fw=new FileWork();
        //Запись в файл
        fw.write(fileName, text);

    }
}