package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeleteContactTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        clickOnLoginLink();
        fillLoginRegisterForm(new User()
                .setEmail(UserData.email)
                .setPassword(UserData.password));
        clickOnLoginButton();

        clickOnAddLink();
        fillContactForm(new Contact()
                .setName(ContactData.name)
                .setLastName(ContactData.lastName)
                .setPhone(ContactData.phone)
                .setEmail(ContactData.email)
                .setAddress(ContactData.address)
                .setDescription(ContactData.description));
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
