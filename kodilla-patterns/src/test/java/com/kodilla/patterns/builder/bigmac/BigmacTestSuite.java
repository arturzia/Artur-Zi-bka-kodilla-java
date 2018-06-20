package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient("Onion")
                .bun("Sesame")
                .sauce("Barbecue")
                .burgers(2)
                .ingredient("Chili")
                .ingredient("Mushrooms")
                .ingredient("Cheese")
                .ingredient("Salad")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        String whatBun = bigmac.getBun();
        int hawManyBurgers = bigmac.getBurgers();
        //Then
        Assert.assertEquals(5, howManyIngredients);
        Assert.assertEquals("Sesame", whatBun);
        Assert.assertEquals(2, hawManyBurgers);
    }
}
