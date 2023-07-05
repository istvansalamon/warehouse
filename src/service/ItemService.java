package service;

import database.ItemDatabase;
import model.Item;

import java.util.List;

public class ItemService {
    private ItemDatabase itemDatabase;

    public ItemService(ItemDatabase itemDatabase) {
        this.itemDatabase = itemDatabase;
    }

    public void addItem(Item item) {
        itemDatabase.addItem(item);
    }

    public void updateItem(Item updatedItem) {
        itemDatabase.updateItem(updatedItem);
    }

    public void deleteItem(String itemName) {
        itemDatabase.deleteItem(itemName);
    }

    public List<Item> getItems() {
        return itemDatabase.getItems();
    }
}
