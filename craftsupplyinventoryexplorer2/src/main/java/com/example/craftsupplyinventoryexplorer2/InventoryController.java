package com.example.craftsupplyinventoryexplorer2;

import java.util.ArrayList;

public class InventoryController {

    public InventoryDomain inventoryDomain;


    public InventoryController(InventoryDomain inventoryDomain){
        this.inventoryDomain=inventoryDomain;

    }

    public Item getItem(String name){

        //TODO: make this search the inventory domain for an item with this string, not create a new item
        return new Item(name);
    }

    public ArrayList<String> getTags(){
        //TODO: make this search the inventoryDomain.dataSource for the tas associated with a given item
        return new ArrayList<String>();
    }


}