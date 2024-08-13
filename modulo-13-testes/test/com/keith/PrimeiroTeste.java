package com.keith;

import org.junit.Assert;
import org.junit.Test;

public class PrimeiroTeste {

    @Test
    public void test() {
        String nome = "Keith";
        Assert.assertEquals("Keith", nome);
    }

    @Test
    public void testNotEquals() {
        String nome = "Keith";
        Assert.assertNotEquals("Keith1", nome);
    }

}