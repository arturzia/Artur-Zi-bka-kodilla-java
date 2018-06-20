package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies(){

        //Given
        User steven = new Millenials("Steven Brown");
        User john = new YGeneration("John White");
        User harry = new ZGeneration("Harry Poter");

        //When
        String stevenSocialPublisher = steven.sharePost();
        System.out.println("Steven publish in: " + stevenSocialPublisher);
        String johnSocialPublisher = john.sharePost();
        System.out.println("John publish in: " + johnSocialPublisher);
        String harrySocialPublisher = harry.sharePost();
        System.out.println("Harry publish in: " + harrySocialPublisher);

        //Then
        Assert.assertEquals("Facebook", stevenSocialPublisher);
        Assert.assertEquals("Twitter", johnSocialPublisher);
        Assert.assertEquals("Snapchat", harrySocialPublisher);
    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User steven = new Millenials("Steven Brown");

        //When
        String stevenSocialPublisher = steven.sharePost();
        System.out.println("Steven publish in: " + stevenSocialPublisher);
        steven.setSocialPublisher(new TwitterPublisher());
        stevenSocialPublisher = steven.sharePost();
        System.out.println("Steven now publish in: " + stevenSocialPublisher);

        //Then
        Assert.assertEquals("Twitter", stevenSocialPublisher);
    }
}
