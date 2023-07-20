package ru.geekbrains.oop.homework_2;

public interface MarketBehaviour {
    void acceptOrder(Order order);
    Order deliverOrder();
}
