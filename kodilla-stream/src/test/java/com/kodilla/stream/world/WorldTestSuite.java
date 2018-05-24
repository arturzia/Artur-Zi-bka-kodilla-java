package com.kodilla.stream.world;

import org.junit.*;

import java.math.BigDecimal;

public class WorldTestSuite {


    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testGetPeopleQuantity() {
        //Given

        Country usa = new Country("USA", BigDecimal.valueOf(356000000));
        Country poland = new Country("Poland", BigDecimal.valueOf(38000000));
        Country germany = new Country("Germany", BigDecimal.valueOf(87000000));
        Country china = new Country("China", BigDecimal.valueOf(1300000000));
        Continent americaPn = new Continent("AmericaPn");
        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");

        //When
        americaPn.addCountry(usa);
        europe.addCountry(poland);
        europe.addCountry(germany);
        asia.addCountry(china);

        World world = new World();
        world.addContinent(americaPn);
        world.addContinent(europe);
        world.addContinent(asia);

        BigDecimal totalPeople = world.getPeopleQuantity();

        //Then
        System.out.println(totalPeople);
        BigDecimal expectedPeople = new BigDecimal("1781000000");
        Assert.assertEquals(expectedPeople, totalPeople);

    }
}
