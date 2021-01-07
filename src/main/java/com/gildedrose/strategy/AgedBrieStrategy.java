package com.gildedrose.strategy;

import com.gildedrose.Item;

public class AgedBrieStrategy extends UpdateStrategyBase {
    @Override
    protected void updateQuality(Item item) {
        increaseQuality(item);
    }

    @Override
    protected void updateQualityAfterExpiration(Item item) {
        increaseQuality(item);
    }

}
