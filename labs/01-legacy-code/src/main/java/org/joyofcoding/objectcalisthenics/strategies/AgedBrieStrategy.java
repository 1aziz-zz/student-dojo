package org.joyofcoding.objectcalisthenics.strategies;

import org.joyofcoding.objectcalisthenics.Item;

/**
 * Created by aziz on 20-4-17 :)
 */
public class AgedBrieStrategy implements ProductStrategy {

    @Override
    public void operate(Item item) {
        item.increaseQuality();
        item.decreaseSellIn();
        if (item.getSellIn() < 0) {
            item.increaseQuality();
        }
    }
}
