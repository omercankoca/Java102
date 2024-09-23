package PatikaStore;

import java.util.ArrayList;

public class Products {
    private int categoryId;
    private String categoryName;

    public Products(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }
    public static ArrayList<Products> categories(){
        ArrayList<Products> categories = new ArrayList<>();
        categories.add(new Products(1, "Telefonlar"));
        categories.add(new Products(2, "Laptoplar"));
        return categories;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }
}
