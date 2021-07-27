package Model;

import java.io.Serializable;

public class Product implements Serializable {
    private String name;
    private int code;
    private String brand;
    private int price;

    public Product() {
    }

    public Product(String name, int code, String brand, int price) {
        this.name = name;
        this.code = code;
        this.brand = brand;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
