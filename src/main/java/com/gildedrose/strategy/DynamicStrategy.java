package com.gildedrose.strategy;

import com.gildedrose.item.UnionItemAdapter;
import com.gildedrose.strategy.util.RealTimeSalesDataCollector;

/**
It is a REAL strategy that update items quality by status data
*/
public class DynamicStrategy implements UpdateStrategy{
    @Override
    public void updateItem(UnionItemAdapter item) {
        RealTimeSalesDataCollector collector = RealTimeSalesDataCollector.instance();
        RealTimeSalesDataCollector.SalesData salesData = collector.fetchSalesDataOf(item.getName());
        if (salesData.getCount() > 1) {
            // ...
        }
        throw new RuntimeException("It is too complex that cannot be called in unit test");
    }
}
