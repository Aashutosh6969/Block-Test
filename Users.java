package model;

import java.util.ArrayList;

public class Users {

    ArrayList<Orders> user_order= new ArrayList<>();
    int user_id;
    String user_name;
    int user_age;
    String user_address;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getUser_age() {
        return user_age;
    }

    public void setUser_age(int user_age) {
        this.user_age = user_age;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public ArrayList<Orders> getUser_order() {
        return user_order;
    }

    public void setUser_order(ArrayList<Orders> user_order) {
        this.user_order = user_order;
    }




    public Users(ArrayList<Orders> user_order, int user_id, String user_name, int user_age, String user_address) {
        this.user_order = user_order;
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_age = user_age;
        this.user_address = user_address;
    }




    }



