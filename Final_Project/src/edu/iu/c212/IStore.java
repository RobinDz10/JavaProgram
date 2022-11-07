package edu.iu.c212;

import edu.iu.c212.models.Item;
import edu.iu.c212.models.Staff;

import java.io.IOException;
import java.util.List;

public interface IStore {

    List<Item> getItemsFromFile();

    List<Staff> getStaffFromFile();

    void saveItemsFromFile(List<Item> itemList);

    void saveStaffFromFile(List<Staff> staffList);

    void takeAction(String command) throws IOException;

}
