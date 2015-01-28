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

   /* public static void update(String nameFile, String newText) throws FileNotFoundException {
        StringBuilder sb = new StringBuilder();
        exists(nameFile);
        String oldFile = read(nameFile);
        sb.append(oldFile);
        sb.append(newText);
        write(nameFile, sb.toString());
    }*/


}