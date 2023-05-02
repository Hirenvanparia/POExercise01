package org.example;

import com.google.common.annotations.VisibleForTesting;
import org.testng.annotations.Test;

public class TestSuit extends BaseTest {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();

    @Test
    public void verifyUserShouldBeAbleToRegistrationSuccessfully() {
        // click on register button
        homePage.clickOnRegisterButton();
        // fill in registration details
        registerPage.enterRegistrationDetails();
        // register result
        registerResultPage.verifyUserRegisteredSuccessfully();


    }

    public void verifyUserShouldBeAbleToVote() {
        VotePage votePage = new VotePage();
        VoteResultPage voteResultPage = new VoteResultPage();


    }
    public  void verifyRegisteredUserShouldBeAbleTOVote() {
        homePage.clickOnRegisterButton();
        // fill in registration details
        registerPage.enterRegistrationDetails();
        // register result
        registerResultPage.verifyUserRegisteredSuccessfully();
    }
}
