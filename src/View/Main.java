package View;

import Model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Macbook Pro", 1098, "Apple", 2500));
        products.add(new Product("Macbook Air", 1099, "Apple", 1700));
        products.add(new Product("iMac 2021", 1088, "Apple", 1500));
        products.add(new Product("iPad 2021", 1092, "Apple", 1200));
        writeToFile("student.txt", products);
        List<Product> studentDataFromFile = readDataFromFile("student.txt");
        for (Product product : studentDataFromFile) {
            System.out.println(product);
        }
    }

    public static void writeToFile(String path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readDataFromFile(String path) {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return products;
    }

}
