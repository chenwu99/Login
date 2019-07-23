package com.example.myapplication.users;

import java.io.Serializable;

public class People implements Serializable {
    private String  name;
    private String password;
    private String  phone;
    private String sex,VIP;
    private int number;
    public int getNumber(){return number;}
    public String getVIP(){return VIP;}
    public String getSex(){return sex;}
    public String getName(){return name;}
    public String getPassword(){return password;}
    public void setName(String n){name=n;}
    public void setNumber(int n){number=n;}
    public void setSex(String n){sex=n;}
    public void setVIP(String n){VIP=n;}
    public void setPassword(String p){password=p;}
    public String getPhone(){return phone;}
    public void setPhone(String ph){phone=ph;}
    //People (String n,String p,String ph){name=n;password=p;phone=ph;}
}
