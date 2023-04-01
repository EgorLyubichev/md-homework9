package org.lev;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.Selenide.closeWindow;

public class BasicPageTest {
    Logger log = LoggerFactory.getLogger(BasicPageTest.class);


    BasicPage basicPage = new BasicPage();

    @BeforeClass
    public void openCatalog(){
        basicPage.openBasePage();
    }

    @AfterClass
    public void closeResource(){
        clearBrowserCookies();
        closeWindow();
    }
}
