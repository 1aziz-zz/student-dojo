package org.joyofcoding.objectcalisthenics.strategies;

import org.joyofcoding.objectcalisthenics.Item;

/**
 * Created by aziz on 20-4-17 :)
 */
public class ExpirableStrategy implements ProductStrategy {

    @Override
    public void operate(Item item) {
        item.decreaseQuality();
        item.decreaseSellIn();
        if (item.getSellIn() < 0) {
            item.decreaseQuality();
        }
    }
}
