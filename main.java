package ru.mirea.prac1;

public class  main {
    public static void main(String[] args) {
        Dog d1 = new Dog("Mike", 2);
        Dog d2 = new Dog("Helen", 7);
        Dog d3 = new Dog("Bob");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
        System.out.println();

        Ball b1 = new Ball("green", 100);
        Ball b2 = new Ball("blue");
        Ball b3 = new Ball(100);
        b3.setColor("pink");
        System.out.println(b1+"\n"+b2+"\n"+b3);

        Book book1 = new Book("how 2 learnd pascal", 100);
        Book book2 = new Book("Java");
        Book book3 = new Book(15);
        book1.setName("cringe");
        System.out.println("\n"+book1.getName()+" "+book2.getName()+" "+book3.getName());

    }
}
