package ru.netology.mvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class MonthCountServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/count.csv")
    public void MonthCalculate(int expected, int income, int expense, int threshold) {
        MonthCountService service = new MonthCountService();

        int actual = service.calculate(income, expense, threshold);
        Assertions.assertEquals(expected, actual);

    }
}
