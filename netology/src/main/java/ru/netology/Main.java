package ru.netology;

import ru.netology.mvn.services.MonthCountService;

public class Main {
    public static void main(String[] args) {
        MonthCountService service = new MonthCountService();
        System.out.println(service.calculate(10_000, 3_000, 20_000));
        System.out.println(service.calculate(100_000, 60_000, 150_000));
    }
}