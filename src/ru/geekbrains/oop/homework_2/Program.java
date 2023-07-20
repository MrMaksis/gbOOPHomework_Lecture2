package ru.geekbrains.oop.homework_2;

public class Program {
    public static void main(String[] args) {
        Market market = new Market();

        Person person1 = new Person("John");
        Person person2 = new Person("Alice");

        Order order1 = new Order("Item 1");
        Order order2 = new Order("Item 2");

        market.enqueue(person1);
        market.enqueue(person2);
        market.acceptOrder(order1);
        market.acceptOrder(order2);

        market.update();
        market.update();
        market.update();
    }
}
