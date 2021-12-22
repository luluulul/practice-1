package ru.mirea.prac1;

public class Ball {
    private String color;
    private int price;
    public Ball(String color, int price){
        this.color = color;
        this.price = price;
    }
    public Ball(String color){
        this.color = color;
        this.price = 0;
    }
    public Ball(int price){
        this.price = price;
    }
    public Ball(){
        this.color = "default";
        this.price = 0;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public String getColor(){
        return color;
    }
    public int getPrice(){
        return price;
    }
    public String toString(){
        return "color = "+this.color+", price = "+this.price;
    }
}
