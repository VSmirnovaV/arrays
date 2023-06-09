package ru.netology.stats;

public class StatsService {
    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(int[] sales) {
        int maxMonthly = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonthly]) {
                maxMonthly = i;
            }
        }
        return maxMonthly + 1;
    }

    public int sumSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public int averageValue(int[] sales) {
        int average = sumSales(sales) / sales.length;
        return average;
    }

    public int amountMonthBelowAverage(int[] sales) {
        int amount = 0;
        for (int sale : sales) {
            if (sale < averageValue(sales)) {
                amount++;
            }
        }
        return amount;
    }

    public int amountMonthAboveAverage(int[] sales) {
        int amount = 0;
        for (int sale : sales) {
            if (sale > averageValue(sales)) {
                amount++;
            }
        }
        return amount;
    }
}