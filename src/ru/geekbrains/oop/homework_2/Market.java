package ru.geekbrains.oop.homework_2;

import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour{
    private List<Person> queue;
    private List<Order> orders;

    public Market() {
        queue = new ArrayList<>();
        orders = new ArrayList<>();
    }

    @Override
    public void enqueue(Person person) {
        queue.add(person);
    }

    @Override
    public Person dequeue() {
        if (!queue.isEmpty()) {
            return queue.remove(0);
        }
        return null;
    }

    @Override
    public void acceptOrder(Order order) {
        orders.add(order);
    }

    @Override
    public Order deliverOrder() {
        if (!orders.isEmpty()) {
            return orders.remove(0);
        }
        return null;
    }

    // Метод update - обновление состояния магазина (принимает и отдаёт заказы)
    public void update() {
        Person person = dequeue();
        if (person != null) {
            System.out.println("Обслуживается: " + person.getName());
            Order order = deliverOrder();
            if (order != null) {
                System.out.println("Заказ: " + order.getItemName());
            } else {
                System.out.println("Нет заказов");
            }
        } else {
            System.out.println("Очередь пуста");
        }
    }
}

