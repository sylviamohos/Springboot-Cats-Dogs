package com.bloomtech.catsanddogs.models;

// This POJO will be used to send data back and forth to the server
// SpringBoot will automatically convert to and from json and the Java object.

// Be sure:
//      1. A constructor exists (usually a default constructor)
//      2. Standard getter/setters for the member variables exist
//      3. The member variable names must match the json attribute names.
public class Cat
{
    private final long id;
    private String name;

    public Cat(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public long getId() {
        return id;
    }

}
