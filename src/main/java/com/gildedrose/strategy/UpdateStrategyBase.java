package com.gildedrose.strategy;

import com.gildedrose.item.UnionItemAdapter;

public abstract class UpdateStrategyBase implements UpdateStrategy {
    public abstract void updateItem(UnionItemAdapter item);

    protected void increaseQuality(UnionItemAdapter item) {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
        }
    }

    protected void decreaseQuality(UnionItemAdapter item) {
        if (item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 1);
        }
    }

    protected void decreaseSellIn(UnionItemAdapter item) {
        item.setSellIn(item.getSellIn() - 1);
    }

    protected boolean isExpired(UnionItemAdapter item) {
        return item.getSellIn() < 0;
    }
}
