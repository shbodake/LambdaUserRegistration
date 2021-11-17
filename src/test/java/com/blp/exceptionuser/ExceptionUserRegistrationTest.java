package com.blp.exceptionuser;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionUserRegistrationTest
{
    ExceptionUserRegistration exceptionUserRegistration = new ExceptionUserRegistration();

    @Test
    public void givenFirstNameIsProperReturnTrue()
    {
        boolean actualResult = exceptionUserRegistration.firstName("Sayali");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenFirstNameIsProperReturnFalse()
    {
        boolean actualResult = exceptionUserRegistration.firstName("SaYali");
        Assert.assertEquals(false, actualResult);
    }

    @Test
    public void givenLastNameIsProperReturnTrue()
    {
        boolean actualResult = exceptionUserRegistration.firstName("Bodake");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenLastNameIsProperReturnFalse()
    {
        boolean actualResult = exceptionUserRegistration.firstName("BodaKE");
        Assert.assertEquals(false, actualResult);
    }

    @Test
    public void givenEmailIdIsProperReturnTrue() {
        boolean actualResult = exceptionUserRegistration.emailId("sayalibodake28@gmail.com");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenEmailIdIsNotProperReturnFalse() {
        boolean actualResult = exceptionUserRegistration.emailId("sayalibodake28gmail.com");
        Assert.assertEquals(false, actualResult);
    }

}
