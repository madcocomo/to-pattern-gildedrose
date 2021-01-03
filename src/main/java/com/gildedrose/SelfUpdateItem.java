package com.gildedrose;

import com.gildedrose.item.Item;
import com.gildedrose.item.UnionItemAdapter;
import com.gildedrose.strategy.UpdateStrategy;

public class SelfUpdateItem {
    private final UpdateStrategy strategy;
    private final UnionItemAdapter item;

    public SelfUpdateItem(UnionItemAdapter item, UpdateStrategy strategy) {
        this.item = item;
        this.strategy = strategy;
    }

    public void update() {
        strategy.updateItem(item);
    }

    @Override
    public String toString() {
        return item.itemInfo();
    }
}
