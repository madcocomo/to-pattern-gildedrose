package com.gildedrose.strategy;

import com.gildedrose.Item;

public class PassesStrategy extends UpdateStrategyBase {
    @Override
    public void updateItem(Item item) {
        super.updateItem(item);
        if (isExpired(item.sellIn)) {
            item.quality = 0;
        }
    }

    @Override
    protected int getRate(int sellIn) {
        if (sellIn < 5) {
            return 3;
        }
        if (sellIn < 10) {
            return 2;
        }
        return 1;
    }
}
