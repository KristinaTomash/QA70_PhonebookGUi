package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

        @Test
        public void loginPositiveTest(){
            clickOnLoginLink();
            fillLoginRegisterForm(new User()
                    .setEmail("manuel67@gmail.com")
                    .setPassword("Pp1234567!"));
            clickOnLoginButton();
            Assert.assertTrue(isSignOutButtonPresent());

    }
    @Test
        public void loginNegativeWithoutEmailTest(){
            clickOnLoginLink();
            fillLoginRegisterForm(new User()
                    .setPassword("Pp1234567!"));
            clickOnLoginButton();
            Assert.assertTrue(isSignOutButtonPresent());

    }

}