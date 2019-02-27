package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country suisse = new Country(new BigDecimal("10000000"),"Suisse");
        Country poland = new Country(new BigDecimal("40000000"), "Poland");

        Continent europe = new Continent("Europe");
        europe.addCountry(suisse);
        europe.addCountry(poland);

        World world = new World();
        world.addContinent(europe);

        //When
        BigDecimal result = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(new BigDecimal("50000000"), result);
    }
}