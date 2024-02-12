package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxVer() {
        StatisticsService service = new StatisticsService();

        long[] incomesInMillions = {8, 9, 4, 21, 15, 7, 19, 6, 10, 11, 2};
        long expected = 21;

        long actual = service.findMax(incomesInMillions);

        Assertions.assertEquals(expected, actual);
    }
}