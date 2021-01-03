package com.gildedrose;

import com.gildedrose.item.*;
import com.gildedrose.strategy.*;

import java.util.Arrays;

class GildedRose {
    SelfUpdateItem[] items;

    static UnionItemAdapter createItem(String name, int sellIn, int quality) {
        if (name.matches("^[0-9].*")) {
            return new AlienItemAdapter(new AlienItem(name, sellIn, quality));
        }
        return new ItemAdapter(new Item(name, sellIn, quality));
    }

    public GildedRose(UnionItemAdapter[] items) {
        this.items = Arrays.stream(items)
                .map(this::toSelfUpdateItem)
                .toArray(SelfUpdateItem[]::new);
    }

    private SelfUpdateItem toSelfUpdateItem(UnionItemAdapter item) {
        UpdateStrategy strategy = getUpdateStrategyFor(item);
        return new SelfUpdateItem(item, strategy);
    }

    private UpdateStrategy getUpdateStrategyFor(UnionItemAdapter item) {
        UpdateStrategy strategy;
        if (item.getName().equals("Aged Brie")) {
            strategy = new AgedBrieStrategy();
        } else if (item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
            strategy = new PassesStrategy();
        } else if (item.getName().equals("Sulfuras, Hand of Ragnaros")) {
            strategy = new SulfurasStrategy();
        } else {
            strategy = new NormalItemStrategy();
        }
        return strategy;
    }

    public void updateQuality() {
        for (SelfUpdateItem item : items) {
            item.update();
        }
    }

}
