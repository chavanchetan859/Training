package Quetion1;import java.util.HashMap;
public class ProductUtilsMap {
    static HashMap<String, GroceryClass>grocery=new HashMap<>();
    static HashMap<String, ElectronicsClass>electronics=new HashMap<>();
    static HashMap<String, KidsClass>kids=new HashMap<>();
    public static HashMap<String, ElectronicsClass> getElectronics() {
        electronics.put("Airdopes",new ElectronicsClass("Airdopes",10000));
        electronics.put("Iron",new ElectronicsClass("Washing Machine",1500));
        electronics.put("Mixer",new ElectronicsClass("Dishwasher",12000));
        return electronics;
    }
    public static HashMap<String, GroceryClass> getGrocery(){
        grocery.put("Sugar",new GroceryClass("Rice",70));
        grocery.put("Curd",new GroceryClass("Milk",50));
        grocery.put("Biscuit",new GroceryClass("Biscuit",30));
        return grocery;
    }

    public static HashMap<String, KidsClass> getKids() {
        kids.put("Shoes",new KidsClass("Shirt",500));
        kids.put("pant",new KidsClass("TShirt",450));
        kids.put("PlayingGame",new KidsClass("Shoes",750));
        return kids;
    }
}