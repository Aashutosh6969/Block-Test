import model.Items;
import model.Orders;
import model.Users;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Items item1 = new Items("Tshirt","Levis",1001,2000);
        Items item2 = new Items("Jacket","Balenciaga",1002,5000);
        Items item3 = new Items("Shirt","Gucci",1003,3000);
        Items item4 = new Items("Hoodie","Nike",1004,4000);
        Items item5 = new Items("Pant","Armani",1005,1000);
        Items item6 = new Items("Shoes","Adidas",1006,3000);

        ArrayList<Items> order1 = new ArrayList<>();
        order1.add(item1);
        order1.add(item2);
        order1.add(item3);


        ArrayList<Items> order2 = new ArrayList<>();
        order2.add(item4);
        order2.add(item5);
        order2.add(item6);

        ArrayList<Items> order3 = new ArrayList<>();
        order3.add(item1);
        order3.add(item5);
        order3.add(item3);

        ArrayList<Items> order4 = new ArrayList<>();
        order4.add(item5);
        order4.add(item6);
        order4.add(item1);

        Orders ord1 = new Orders(order1,1,2,"Samakhusi","2-3 days");
        Orders ord2 = new Orders(order2,2,3,"Basndhara","4-5 days");
        Orders ord3 = new Orders(order3,3,1,"Chabahil","3-5 days");
        Orders ord4 = new Orders(order4,4,4,"Samakhusi","2-5 days");

        ArrayList<Orders> user_order1 = new ArrayList<>();
        user_order1.add(ord1);
        user_order1.add(ord2);
        user_order1.add(ord3);

        ArrayList<Orders> user_order2 = new ArrayList<>();
        user_order2.add(ord2);
        user_order2.add(ord1);
        user_order2.add(ord3);

        ArrayList<Orders> user_order3 = new ArrayList<>();
        user_order3.add(ord4);
        user_order3.add(ord2);
        user_order3.add(ord1);

        Users user1 = new Users(user_order1,1,"Ram",17,"Samakhusi");
        Users user2 = new Users(user_order2,2,"hari",20,"Basundhara");
        Users user3 = new Users(user_order3,3,"Sita",25,"Chabahil");

        item1.printFormat();
        System.out.println("----------------");
        item2.printFormat();
        System.out.println("----------------");
        item3.printFormat();
        System.out.println("----------------");
        item4.printFormat();
        System.out.println("----------------");
        item5.printFormat();
        System.out.println("----------------");
        item6.printFormat();
        System.out.println("----------------");

    }

}