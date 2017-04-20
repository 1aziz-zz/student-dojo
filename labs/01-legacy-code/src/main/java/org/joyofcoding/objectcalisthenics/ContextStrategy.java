package org.joyofcoding.objectcalisthenics;

import org.joyofcoding.objectcalisthenics.strategies.ProductStrategy;

/**
 * Created by aziz on 20-4-17 :)
 */
class ContextStrategy {

    private static ContextStrategy instance = new ContextStrategy();

    private ContextStrategy() {

    }

    static ContextStrategy getInstance() {
        return instance;
    }

    void operate(Item item, ProductStrategy productStrategy) {
        productStrategy.operate(item);
    }
}
