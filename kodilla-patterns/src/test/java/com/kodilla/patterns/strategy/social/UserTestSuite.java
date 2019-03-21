package com.kodilla.patterns.strategy.social;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {

        //Given
        User ola1 = new Millenials("Ola");
        User ala2 = new YGeneration("Ala");
        User janek3 = new ZGeneration("Janek");

        //When
        String millenialsShare = ola1.sharePost();
        System.out.println("Ola share post on " + millenialsShare);

        String yGenerationShare = ala2.sharePost();
        System.out.println("Ala share post on " + yGenerationShare);

        String zGenerationShare = janek3.sharePost();
        System.out.println("Janek share post on " + zGenerationShare);

        //Then
        Assert.assertEquals("Facebook",millenialsShare);
        Assert.assertEquals("Twitter",yGenerationShare);
        Assert.assertEquals("Snapchat",zGenerationShare);

    }


    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User ola1 = new YGeneration("Ola");

        //When
        String millenialsShare = ola1.sharePost();
        System.out.println("Ola not always share post on " + millenialsShare);

        ola1.setSocialPublisher(new SnapchatPublisher());
        millenialsShare = ola1.sharePost();

        System.out.println("Ola not always share post on " + millenialsShare);

        //Then
        Assert.assertEquals("Snapchat" , millenialsShare);
    }
}