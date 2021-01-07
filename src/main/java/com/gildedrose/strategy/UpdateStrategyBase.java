package com.gildedrose.strategy;

import com.gildedrose.Item;

public class UpdateStrategyBase implements UpdateStrategy {
    @Override
    public void updateItem(Item item) {
        updateSellIn(item);
        updateQuality(item, getRate(item.sellIn));
    }

    protected int getRate(int sellIn) {
        return 0;
    }

    protected void updateSellIn(Item item) {
        item.sellIn = item.sellIn - 1;
    }

    protected void updateQuality(Item item, int rate) {
        item.quality = item.quality + rate;
        item.quality = Math.min(item.quality, 50);
        item.quality = Math.max(item.quality, 0);
    }

    protected boolean isExpired(int sellIn) {
        return sellIn < 0;
    }
}
