package com.phonebook.tests;
import org.testng.Assert;
import org.testng.annotations.Test;
public class CreateAccountTests extends TestBase{


    @Test
    public void newUserRegisterPositiveTest(){

        //int i =(int)((System.currentTimeMillis()/1000)%3600);

        //click on Login Link
        clickOnLoginLink();
        //enter email
        fillLoginRegisterForm(new User()
                .setEmail("manuel67@gmail.com")
                .setPassword("Pp1234567!"));
        //click on Registration button
        clickOnRegistrationButton();
        //assert SigOut button present
        Assert.assertTrue(isSignOutButtonPresent());
    }

    @Test
    public void newUserRegisterNegativeTest(){
        clickOnLoginLink();
        fillLoginRegisterForm(new User()
                .setEmail("manuel67@gmail.com")
                .setPassword("Pp1234567!"));
        clickOnRegistrationButton();
        Assert.assertTrue(isAlertPresent());
    }

}