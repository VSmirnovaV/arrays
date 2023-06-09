package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.stats.StatsService;


public class StartsServiceTest {

    @Test
    public void monthInWhichTheMinimumSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 9;
        int actualDay = service.minSales(sales);
        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void monthInWhichTheMaximumSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int actualMonth = service.maxSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void sumSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.sumSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void averageValueSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 15;
        int actualSum = service.averageValue(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void amountMonthBelowAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAmount = 5;
        int actualAmount = service.amountMonthBelowAverage(sales);
        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void amountMonthAboveAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 5;
        int actualMonth = service.amountMonthBelowAverage(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }
}
