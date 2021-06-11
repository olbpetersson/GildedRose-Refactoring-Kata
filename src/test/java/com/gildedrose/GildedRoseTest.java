package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GildedRoseTest {

    private GildedRose gildedRose = new GildedRose(new Item[]{});

    @Test
    public void codeWorks() {
        gildedRose.updateQuality();
    }

}
