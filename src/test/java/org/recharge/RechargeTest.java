package org.recharge;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


public class RechargeTest {

    private String INPUT = "123456";
    @Test
    public void testLenght() {
        Assert.assertEquals(63, Recharge.getSha256hex(INPUT).length());
    }


    @Test
    public void getSha256hex() {
    }
}
