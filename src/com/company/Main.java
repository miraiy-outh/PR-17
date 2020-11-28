package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {
    static File file = new File("C:\\Users\\shoko\\IdeaProjects\\PR-17\\text.txt");

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        file.createNewFile();
        write(file);
        read(file);
        rewrite(file);
        add(file);
        read(file);
    }

    public static void write(File file) {
        System.out.println("Запишите информацию в файл:");
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(scan.nextLine());
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void read(File file) {
        System.out.println("Вывод информации:");
        Scanner scanner;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void rewrite(File file) {
        System.out.println("Перезапись информации:");
        FileWriter fileWriter1 = null;
        try {
            fileWriter1 = new FileWriter(file, false);
            fileWriter1.write(scan.nextLine());
            fileWriter1.flush();
            fileWriter1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void add(File file) {
        System.out.println("Добавьте информацию:");
        FileWriter fileWriter1 = null;
        try {
            fileWriter1 = new FileWriter(file, true);
            fileWriter1.write(scan.nextLine());
            fileWriter1.flush();
            fileWriter1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
