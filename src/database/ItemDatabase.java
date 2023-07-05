package database;

import model.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemDatabase {
    private List<Item> items;

    public ItemDatabase() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void updateItem(Item updatedItem) {
        for (Item item : items) {
            if (item.getName().equals(updatedItem.getName())) {
                item.setCategories(updatedItem.getCategories());
                break;
            }
        }
    }

    public void deleteItem(String itemName) {
        Item itemToRemove = null;
        for (Item item : items) {
            if (item.getName().equals(itemName)) {
                itemToRemove = item;
                break;
            }
        }
        if (itemToRemove != null) {
            items.remove(itemToRemove);
        }
    }

    public List<Item> getItems() {
        return items;
    }
}
