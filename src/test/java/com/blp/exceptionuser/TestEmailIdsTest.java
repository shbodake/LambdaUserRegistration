package com.blp.exceptionuser;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestEmailIdsTest {
    TestEmailIds testEmailIds = new TestEmailIds();

    @Test
    public void givenEmailId1IsProperReturnTrue() {
        boolean actualResult = testEmailIds.testForValidEmails("abc@yahoo.com");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenEmailId2IsProperReturnTrue() {
        boolean actualResult = testEmailIds.testForValidEmails("abc-100@yahoo.com");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenEmailId3IsProperReturnTrue() {
        boolean actualResult = testEmailIds.testForValidEmails("abc.100@yahoo.com");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenEmailId4IsProperReturnTrue() {
        boolean actualResult = testEmailIds.testForValidEmails("abc111@abc.com");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenEmailId5IsProperReturnTrue() {
        boolean actualResult = testEmailIds.testForValidEmails("abc-100@abc.net");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenEmailId6IsProperReturnTrue() {
        boolean actualResult = testEmailIds.testForValidEmails("abc.100@abc.com.au");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenEmailId7IsProperReturnTrue() {
        boolean actualResult = testEmailIds.testForValidEmails("abc@1.com");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenEmailId8IsProperReturnTrue() {
        boolean actualResult = testEmailIds.testForValidEmails("abc@gmail.com.com");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenEmailId9IsProperReturnTrue() {
        boolean actualResult = testEmailIds.testForValidEmails("abc+100@gmail.com");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenEmilId1IsNotProperReturnFalse() {
        boolean actualResult = testEmailIds.testForNonValidEmails("abc");
        Assert.assertEquals(false, actualResult);
    }
    @Test
    public void givenEmilId2IsNotProperReturnFalse() {
        boolean actualResult = testEmailIds.testForNonValidEmails("abc@.com.my");
        Assert.assertEquals(false, actualResult);
    }
    @Test
    public void givenEmilId3IsNotProperReturnFalse() {
        boolean actualResult = testEmailIds.testForNonValidEmails("abc123@gmail.a");
        Assert.assertEquals(false, actualResult);
    }
    @Test
    public void givenEmilId4IsNotProperReturnFalse() {
        boolean actualResult = testEmailIds.testForNonValidEmails("abc123@.com");
        Assert.assertEquals(false, actualResult);
    }
    @Test
    public void givenEmilId5IsNotProperReturnFalse() {
        boolean actualResult = testEmailIds.testForNonValidEmails("abc123@.com.com");
        Assert.assertEquals(false, actualResult);
    }
    @Test
    public void givenEmilIds6IsNotProperReturnFalse() {
        boolean actualResult = testEmailIds.testForNonValidEmails(".abc@abc.com");
        Assert.assertEquals(false, actualResult);
    }
    @Test
    public void givenEmilId7IsNotProperReturnFalse() {
        boolean actualResult = testEmailIds.testForNonValidEmails("abc()*@gmail.com");
        Assert.assertEquals(false, actualResult);
    }
    @Test
    public void givenEmilId8IsNotProperReturnFalse() {
        boolean actualResult = testEmailIds.testForNonValidEmails("abc@%*.com");
        Assert.assertEquals(false, actualResult);
    }
    @Test
    public void givenEmilId9IsNotProperReturnFalse() {
        boolean actualResult = testEmailIds.testForNonValidEmails("abc..2002@gmail.com");
        Assert.assertEquals(false, actualResult);
    }
    @Test
    public void givenEmilId10IsNotProperReturnFalse() {
        boolean actualResult = testEmailIds.testForNonValidEmails("abc.@gmail.com");
        Assert.assertEquals(false, actualResult);
    }
    @Test
    public void givenEmilId11IsNotProperReturnFalse() {
        boolean actualResult = testEmailIds.testForNonValidEmails("abc@abc@gmail.com");
        Assert.assertEquals(false, actualResult);
    }
    @Test
    public void givenEmilId12IsNotProperReturnFalse() {
        boolean actualResult = testEmailIds.testForNonValidEmails("abc@gmail.com.1a");
        Assert.assertEquals(false, actualResult);
    }
    @Test
    public void givenEmilId13IsNotProperReturnFalse() {
        boolean actualResult = testEmailIds.testForNonValidEmails("abc@gmail.com.aa.au");
        Assert.assertEquals(false, actualResult);
    }

}