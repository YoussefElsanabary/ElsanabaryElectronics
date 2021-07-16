package com.example.elsanabaryelectronics;

public class User {

    int id ;
    String name,address,mail,phone;

    public static User user_Data ;

    private User(int id,String name,String address ,String mail , String phone){
        this.id = id;
        this.address = address;
        this.mail = mail;
        this.phone = phone;
        this.name = name;
    }

    public static User getInstance(int id,String name,String address ,String mail , String phone){

        if (user_Data == null){
            user_Data = new User(id, name, address, mail, phone);
        }
        return user_Data;
    }

}
