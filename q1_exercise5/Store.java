package q1_exercise5;
import java.util.ArrayList;

public class Store {
  private String storeName;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    // Initialize name to parameter and earnings to zero
    storeName = name;
    earnings = 0;
    // Initialize itemList as a new ArrayList
    itemList = new ArrayList();
    // add 'this' store to storeList
    storeList.add(this);
  }

  public String getName(){
    return storeName;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    if (index > itemList.size()){
        int x = itemList.size() + 1;
        System.out.printf("%n There are only %d items in the store", x);
    }
    // get Item at index from itemList and add its cost to earnings
    this.earnings += itemList.get(index).getCost();
    // print statement indicating the sale
    System.out.printf("%n You have succesfully purchased 1 %s",
            itemList.get(index).getName());
  }
  public void sellItem(String name){
    for(Item x:itemList){
        if(x.getName().equals(name)){
            System.out.printf("%n You have successfully purchased 1 %s", x.getName());
            this.earnings += x.getCost();
        }else{
            System.out.printf("%n Sorry! It seems that we do not have this item for sale!");
        }
    }
  }
  public void sellItem(Item i){
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void addItem(Item i){
    // add Item i to store's itemList
    itemList.add(i);
  }
  public void filterType(String type){
    // loop over itemList and print all items with the specified type
  }
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value
    for(Item x:itemList){
        if(x.getCost() <= maxCost){
            System.out.println(x);
        }
    }
  }
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified value
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'

  }
}
