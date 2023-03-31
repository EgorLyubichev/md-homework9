package org.lev;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static org.lev.CatalogPageConstant.APPLIANCES;
import static org.lev.CatalogPageConstant.BEAUTY_AND_SPORT;
import static org.lev.CatalogPageConstant.BUILDING_AND_RENOVATION;
import static org.lev.CatalogPageConstant.CARS_AND_MOTO;
import static org.lev.CatalogPageConstant.COMPUTERS_AND_NETS;
import static org.lev.CatalogPageConstant.ELECTRONICS;
import static org.lev.CatalogPageConstant.EVERY_DAY;
import static org.lev.CatalogPageConstant.FOR_CHILDREN_AND_MOMS;
import static org.lev.CatalogPageConstant.HOUSE_AND_GARDEN;
import static org.lev.CatalogPageConstant.ONLINER_PRIME;

public class CatalogPageTest extends BasicPageTest {

    CatalogPage catalogPage = new CatalogPage();

    @BeforeMethod
    public void clickToCatalog(){
        basicPage.clickToCatalogLink();
    }

    @Test
    public void testCatalogItems(){
    catalogPage.getCatalogItemList().shouldHave(size(10));
    catalogPage.getCatalogItemList().get(0).shouldHave(text(ONLINER_PRIME));
    catalogPage.getCatalogItemList().get(1).shouldHave(text(ELECTRONICS));
    catalogPage.getCatalogItemList().get(2).shouldHave(text(COMPUTERS_AND_NETS));
    catalogPage.getCatalogItemList().get(3).shouldHave(text(APPLIANCES));
    catalogPage.getCatalogItemList().get(4).shouldHave(text(EVERY_DAY));
    catalogPage.getCatalogItemList().get(5).shouldHave(text(BUILDING_AND_RENOVATION));
    catalogPage.getCatalogItemList().get(6).shouldHave(text(HOUSE_AND_GARDEN));
    catalogPage.getCatalogItemList().get(7).shouldHave(text(CARS_AND_MOTO));
    catalogPage.getCatalogItemList().get(8).shouldHave(text(BEAUTY_AND_SPORT));
    catalogPage.getCatalogItemList().get(9).shouldHave(text(FOR_CHILDREN_AND_MOMS));
    }
}
