package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("with sesame")
                .burgers(3)
                .sauce("spicy")
                .ingredient("salade")
                .ingredient("beckon")
                .ingredient("cheese")
                .ingredient("tomate")
                .ingredient("cucumber")
                .build();

        System.out.println(bigmac);

        //When
        int quantityOfBurgers = bigmac.getBurgers();
        int quantityOfIngredient = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(3, quantityOfBurgers);
        Assert.assertEquals(5,quantityOfIngredient);

    }
}
