package model;

import java.util.List;

public class Item {
    private String name;
    private List<String> categories;

    public Item(String name, List<String> categories) {
        this.name = name;
        this.categories = categories;
    }

    public String getName() {
        return name;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

}
