package org.lev;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.Selenide.closeWindow;

public class BasicPageTest {

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
