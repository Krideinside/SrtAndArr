package ru.netology.stats;

public class StatsService {
//    public int getTotalSales(int[] sales) {
    //
//    }
    public int getMinSales(int[] sales) {
        int minSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minSales]) {
                minSales = i;
            }
        }
        return minSales;
    }
}