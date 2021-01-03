package com.gildedrose.strategy;

import com.gildedrose.item.UnionItemAdapter;

public class AgedBrieStrategy extends UpdateStrategyBase {
    @Override
    public void updateItem(UnionItemAdapter item) {
        increaseQuality(item);

        decreaseSellIn(item);

        if (isExpired(item)) {
            increaseQuality(item);
        }
    }

}
