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

    @Test
    public void givenMobileNumberIsProperReturnTrue() {
        boolean actualResult = exceptionUserRegistration.mobileNumber("91 9850521236");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenMobileNumberIsNotProperReturnFalse() {
        boolean actualResult = exceptionUserRegistration.mobileNumber("919850521236");
        Assert.assertEquals(false, actualResult);
    }

    @Test
    public void givenPasswordRule1IsProperReturnTrue() {
        boolean actualResult = exceptionUserRegistration.passwordRule1("qwgthjkdl");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenPasswordRule1IsNotProperReturnFalse() {
        boolean actualResult = exceptionUserRegistration.passwordRule1("jnsdsjRcvc");
        Assert.assertEquals(false, actualResult);
    }

    @Test
    public void givenPasswordRule2IsProperReturnTrue() {
        boolean actualResult = exceptionUserRegistration.passwordRule2("qwgthRLjkdl");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenPasswordRule2IsNotProperReturnFalse() {
        boolean actualResult = exceptionUserRegistration.passwordRule2("jnsdjcvcp");
        Assert.assertEquals(false, actualResult);
    }

    @Test
    public void givenPasswordRule4IsProperReturnTrue() {
        boolean actualResult = exceptionUserRegistration.passwordRule4("qw98hRL@&dl");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenPasswordRule4IsNotProperReturnFalse() {
        boolean actualResult = exceptionUserRegistration.passwordRule4("jsdjcvcp");
        Assert.assertEquals(false, actualResult);
    }

}
