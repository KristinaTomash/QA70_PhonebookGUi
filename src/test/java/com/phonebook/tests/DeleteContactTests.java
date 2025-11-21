package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeleteContactTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        clickOnLoginLink();
        fillLoginRegisterForm(new User()
                .setEmail("manuel67@gmail.com")
                .setPassword("Pp1234567!"));
        clickOnLoginButton();

        clickOnAddLink();
        fillContactForm("Alex", "Stern", "1234567890", "test@gm.com", "Berlin", "QA");
        clickOnSaveButton();
    }
                @Test
         public void deleteContactTest(){

        int sizeBefore = sizeOfContacts();
                    removeContact();

                    pause(1000);
        int sizeAfter = sizeOfContacts();
                    Assert.assertEquals(sizeAfter,sizeBefore-1);
    }

}
