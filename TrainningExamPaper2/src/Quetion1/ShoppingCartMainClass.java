package Quetion1;

import java.util.HashMap;
import java.util.Scanner;
import static Quetion1.ProductUtilsMap.*;
public class ShoppingCartMainClass {
    public static void main(String[] args) throws CustExceptionHandling {
        Scanner sc=new Scanner(System.in);

        int i=0;
        int price=0;
        int price1=0;
        int status=0;
        HashMap<String, CartClass> cart=new HashMap<>();
        HashMap<String, GroceryClass>groceryHashMap=getGrocery();
        HashMap<String, ElectronicsClass>electronicsHashMap=getElectronics();
        HashMap<String, KidsClass>kidsHashMap=getKids();
        while(i!=1) {
            System.out.println("Select your option");
            System.out.println("1.Add to Cart 2.Remove from Cart 3.Show bill 4.Show Category bill 5.Exit");
            switch (sc.nextInt())
            {
                case 1:System.out.println("Select Category of products 1.Grocery 2.Electronics 3.Kids");
                    switch (sc.nextInt())
                    {
                        case 1:System.out.println("Select the grocery product ");
                            System.out.println(groceryHashMap);
                            String prod=sc.next();
                            if(groceryHashMap.containsKey(prod))
                            {
                                GroceryClass grocery1=groceryHashMap.get(prod);
                                cart.put(grocery1.getName(),new CartClass(grocery1.getName(),grocery1.getPrice(),"Grocery"));
                            }
                            else
                            {
                                throw new CustExceptionHandling("Grocery Product is not availiable");
                            }
                            break;
                        case 2: System.out.println("Select the electronics product");
                            System.out.println(electronicsHashMap);
                            String prod1=sc.next();
                            if(electronicsHashMap.containsKey(prod1))
                            {
                                ElectronicsClass electronics1=electronicsHashMap.get(prod1);
                                cart.put(electronics1.getName(),new CartClass(electronics1.getName(),electronics1.getPrice(),"Electronics"));
                            }
                            else
                            {
                                throw new CustExceptionHandling("Electronics Product is not availiable");
                            }
                            break;
                        case 3:System.out.println("Select the kids product");
                            System.out.println(kidsHashMap);
                            String prod2=sc.next();
                            if(kidsHashMap.containsKey(prod2))
                            {
                                KidsClass kids1=kidsHashMap.get(prod2);
                                cart.put(kids1.getName(),new CartClass(kids1.getName(),kids1.getPrice(),"Kids"));
                            }
                            else
                            {
                                throw new CustExceptionHandling("Kids Product is not availiable");
                            }
                            break;
                        default:throw new CustExceptionHandling("Select correct option");
                    }
                    break;
                case 2:
                    System.out.println("Enter the product to remove");
                    System.out.println(cart);
                    String removeProd=sc.next();
                    if(cart.containsKey(removeProd))
                    {
                        cart.remove(removeProd);
                        System.out.println("Product removed from cart");
                    }
                    else {
                        throw new CustExceptionHandling("Please select correct product");
                    }
                    break;
                case 3:
                    for (CartClass p: cart.values())
                        price=price+p.getPrice();
                    System.out.println("Total price="+price);
                    price=0;
                    break;
                case 4:
                    System.out.println("Enter Category for total amount");
                    String cat=sc.next();
                    price1=0;
                    for(CartClass p1:cart.values())
                    {
                        if(p1.getCategory().contains(cat))
                        {
                            price1=price1+p1.getPrice();
                        }
                    }
                    System.out.println("Price for "+cat+" category="+price1);
                    break;
                case 5:
                    i=1;
                    System.out.println("Thanks ");
                    break;
                default:throw new CustExceptionHandling("Select correct option");
            }
        }
    }
}