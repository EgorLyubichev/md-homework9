package org.lev;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class BasicPage {

    Logger log = LoggerFactory.getLogger(BasicPage.class);

    private static final String URL = "https://www.onliner.by/";
    private static final String CATALOG_LINK = "//a[@href='https://catalog.onliner.by'][@class='b-main-navigation__link']";

    public BasicPage openBasePage(){
        log.info("method: openBasePage runs");
        open(URL);
        return this;
    }

    public BasicPage clickToCatalogLink(){
        log.info("method: clickToCatalogLink runs");
        $x(CATALOG_LINK).click();
        return this;
    }
}
