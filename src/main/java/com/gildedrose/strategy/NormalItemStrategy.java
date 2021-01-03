package com.gildedrose.strategy;

import com.gildedrose.item.UnionItemAdapter;

public class NormalItemStrategy extends UpdateStrategyBase {
    @Override
    public void updateItem(UnionItemAdapter item) {
        decreaseQuality(item);

        decreaseSellIn(item);

        if (isExpired(item)) {
            decreaseQuality(item);
        }
    }

}
