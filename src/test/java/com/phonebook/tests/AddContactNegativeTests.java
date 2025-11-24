package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddContactNegativeTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        clickOnLoginLink();
        fillLoginRegisterForm(new User()
                .setEmail(UserData.email)
                .setPassword(UserData.password));
        clickOnLoginButton();
    }
    @Test
    public void addContactWithInvalidPhone(){
        clickOnAddLink();
        fillContactForm(new Contact()
                .setName(ContactData.name)
                .setLastName(ContactData.lastName)
                .setPhone("123456789")
                .setEmail(ContactData.email)
                .setAddress(ContactData.address)
                .setDescription(ContactData.description));
        clickOnSaveButton();
        Assert.assertTrue(isAlertPresent());

    }
}
