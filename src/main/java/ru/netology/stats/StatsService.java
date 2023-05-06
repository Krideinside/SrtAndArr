package ru.netology.stats;

public class StatsService {
    public int getTotalSales(int[] sales) {
        int totalSales = 0;
        for (int s = 0; s < sales.length; s++) {
            if (sales[s] > 0) {
                totalSales = totalSales + sales[s];
            }
        }
        return totalSales;
    }

    public int getAverageSales(int[] sales) {
        int totalSales = 0;
        for (int s = 0; s < sales.length; s++) {
            if (sales[s] > 0) {
                totalSales = totalSales + sales[s];
            }
        }
        int averageSales = totalSales / 12;
        return averageSales;
    }

    public int getMinMonth(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int getMaxMonth(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int getLowerMonths(int[] sales) {
        int averageSales = getAverageSales(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales) {
            count = count + 1;
            }
        }
        return count;
    }

    public int getHigherMonths(int[] sales) {
        int averageSales = getAverageSales(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) {
                count = count + 1;
            }
        }
        return count;
    }


}