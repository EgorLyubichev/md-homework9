package org.lev;

import com.codeborne.selenide.ElementsCollection;
import org.apache.log4j.Logger;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class CatalogPage {

    Logger log = Logger.getLogger(CatalogPage.class);


    private static final String CATALOG_ITEM = "//li[@class='catalog-navigation-classifier__item ']";

    private static final String COMPUTERS_AND_NETS_CATEGORY = "//li[@data-id='2']";

    public ElementsCollection getCatalogItemList(){
        log.info("method: getCatalogItemList runs");
        return $$x(CATALOG_ITEM);
    }

    public void clickComputersAndNetsCategory(){
        log.info("method: clickComputersAndNetsCategory runs");
        $x(COMPUTERS_AND_NETS_CATEGORY).click();
    }
}
