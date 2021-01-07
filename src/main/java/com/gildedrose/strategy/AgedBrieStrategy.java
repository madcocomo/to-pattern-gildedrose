package com.gildedrose.strategy;

public class AgedBrieStrategy extends UpdateStrategyBase {

    @Override
    protected int getRate(int sellIn) {
        return isExpired(sellIn) ? 2 : 1;
    }

}
