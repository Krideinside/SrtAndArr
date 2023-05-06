package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void shouldCountTotalSales() {
        StatsService service = new StatsService();

        int expectedTotalSales = 180;
        int actualTotalSales = service.getTotalSales(sales);

        Assertions.assertEquals(expectedTotalSales, actualTotalSales);
    }

    @Test
    public void shouldCountAverageSales() {
        StatsService service = new StatsService();

        int expectedTotalSales = 15;
        int actualTotalSales = service.getAverageSales(sales);

        Assertions.assertEquals(expectedTotalSales, actualTotalSales);
    }

    @Test
    public void shouldFindMaxMonth() {
        StatsService service = new StatsService();

        int expectedMonth = 8;
        int actualMonth = service.getMaxMonth(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindMinMonth() {
        StatsService service = new StatsService();

        int expectedMonth = 9;
        int actualMonth = service.getMinMonth(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldCountLowerMonths() {
        StatsService service = new StatsService();

        int expectedMonth = 5;
        int actualMonth = service.getLowerMonths(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldCountHigherMonths() {
        StatsService service = new StatsService();

        int expectedMonth = 5;
        int actualMonth = service.getHigherMonths(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }
}
