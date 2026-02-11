/*
Problem Statement:
Create a Java program that simulates a basic inventory system for a store using a `static` variable
to keep track of the total number of items in stock.
Requirements:
1. Create a class named "InventoryItem".
2. Inside the "InventoryItem" class, define the following attributes and methods:
- A `static` variable named "totalItems" to keep track of the total number of items in stock.
- An instance variable named "itemName" to store the name of the item.
- An instance variable named "quantity" to store the quantity of the item in stock.
- A constructor that initializes the item's name and quantity when an object is created.
- A `static` method named "getTotalItems" that returns the total number of items in stock.
- A method named "addToInventory" that takes an integer as a parameter and adds it to the item's
quantity while also incrementing the "totalItems" variable.
- A method named "removeFromInventory" that takes an integer as a parameter and subtracts it
from the item's quantity while also decrementing the "totalItems" variable.
3. In the "Main" class, create instances of the "InventoryItem" class and perform the following
operations:
- Create multiple inventory items.
- Add items to the inventory and update the total items in stock.
- Remove items from the inventory and update the total items in stock.
- Display the total number of items in stock using the "getTotalItems" method.
Ensure that your Java program effectively demonstrates the use of the `static` variable to keep
track of the total number of items in stock and allows for adding and removing items from the
inventory.
 */
package Assignment_Static;

public class InventoryItem{
    static int totalItems;
    String itemName;
    int quantity;

    InventoryItem( String itemName, int quantity){
        this.itemName = itemName;
        this.quantity = quantity;
        totalItems += quantity;
    };

    static int getTotalItems(){
        return totalItems;
    }

    void addToInventory(int value){
//        quantity += value;
        totalItems += value;

    }

    void removeFromInventory(int value){
//        quantity -= value;
        totalItems -= value;
    }
}

class Main{
    public static void main(String[] args){
        InventoryItem Laptop = new InventoryItem("Dell", 10);
        InventoryItem Mouse = new InventoryItem("HP", 10);
        InventoryItem Keyboard = new InventoryItem("Dell", 20);
        InventoryItem Monitor = new InventoryItem("Asus", 20);


        Laptop.addToInventory(20);
        Laptop.removeFromInventory(10);
        System.out.println(InventoryItem.getTotalItems());
    }

}
