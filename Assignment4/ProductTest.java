import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("enter no of products");
            Product[] prod = new Product[sc.nextInt()];
        try {
            for (int i = 0; i < prod.length; i++) {
                Product p = new Product();

                    System.out.println("enter name of product");
                    p.setName(sc.next());

                    System.out.println("enter price of product");
                    p.setPrice(sc.nextInt());

                    System.out.println("enter quantity of product");
                    p.setQuantity(sc.nextInt());
                    prod[i] = p;
                }
            System.out.println("Enter the index of the product u want to see");
            int c = sc.nextInt();

                System.out.println("Product details-" + prod[c - 1]);

        }
        catch (InputMismatchException e) {
            System.out.println("Price need to be in integer only");
        }catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Product is out of range, please enter the range correctly");
            }

    }
}
