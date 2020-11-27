package ru.mirea.lab8;
import java.io.*;
import java.util.*;

public class FileTest {

    public static void main(String[] args) {

        try (
                FileWriter writer = new FileWriter("C:\\User\\Ivan\\Text.txt", false)) {

            String text = "Lab8";
            writer.write(text);
            writer.append('\n');

            Scanner in = new Scanner(System.in);
            String line = in.nextLine();
            writer.write(line);
            writer.append('\n');

            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (
                FileReader reader = new FileReader("C:\\User\\Ivan\\Text.txt")) {

            int file;
            while ((file = reader.read()) != -1) {
                System.out.print((char) file);
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (
                FileWriter writer = new FileWriter("C:\\User\\Ivan\\Text.txt", false)) {

            String text2 = "Lab8";
            writer.write(text2);
            writer.append('\n');

            Scanner in = new Scanner(System.in);
            String line2 = in.nextLine();
            writer.write(line2);
            writer.append('\n');

            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (
                FileWriter writer = new FileWriter("C:\\User\\Ivan\\Text.txt", true)) {

            Scanner in = new Scanner(System.in);
            String line2 = in.nextLine();
            writer.write(line2);
            writer.append('\n');

            writer.flush();
        }catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
