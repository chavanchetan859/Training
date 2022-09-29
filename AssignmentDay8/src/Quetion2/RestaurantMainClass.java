package Quetion2;


    public class RestaurantMainClass {

        public static void main(String[] args) {
            WaiterClass q=new WaiterClass();
            new ChefClass(q);
            new CustomerClass(q);

        }

    }

