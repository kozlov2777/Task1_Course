package guitar;

import java.util.ArrayList;

public abstract class Guitar {

    private String name;
    private String price;
    private String year;

    public Guitar(String name, String price, String year) {
        this.name = name;
        this.price = price;
        this.year = year;
    }

    public void play(ArrayList list){
        System.out.println(list);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
