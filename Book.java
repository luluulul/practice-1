package ru.mirea.prac1;

public class Book {
    private String name;
    private int price;
    public Book(String name, int price){
        this.name = name;
        this.price = price;
    }
    public Book(String name){
        this.name = name;
        this.price = 0;
    }
    public Book(int price){
        this.name = "siaod";
        this.price = price;
    }
    public Book(){
        this.name = "siaod";
        this.price = 0;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public String toString(){
        return "color = "+this.name+", price = "+this.price;
    }
}
