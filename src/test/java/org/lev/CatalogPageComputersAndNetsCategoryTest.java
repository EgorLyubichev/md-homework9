package org.lev;

import com.codeborne.selenide.ElementsCollection;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static org.lev.CatalogPageConstant.ACCESSORIES;
import static org.lev.CatalogPageConstant.ACCESSORIES_FOR_LAPTOPS_AND_COMPUTERS;
import static org.lev.CatalogPageConstant.CASH_REGISTERS_AND_COMMERCIAL_EQUIPMENT;
import static org.lev.CatalogPageConstant.DATA_STORAGE;
import static org.lev.CatalogPageConstant.GAMES_AND_SOFTWARE;
import static org.lev.CatalogPageConstant.LAPTOPS_COMPUTERS_MONITORS;
import static org.lev.CatalogPageConstant.MANIPULATORS_AND_INPUT_DEVICES;
import static org.lev.CatalogPageConstant.MULTIMEDIA_PERIPHERALS;
import static org.lev.CatalogPageConstant.NETWORK_EQUIPMENT;
import static org.lev.CatalogPageConstant.POWER_SUPPLY;
import static org.lev.CatalogPageConstant.PRINTING_AND_DESIGN_EQUIPMENT;
import static org.lev.NavigationHelper.scrollDown333;

public class CatalogPageComputersAndNetsCategoryTest extends BasicPageTest {
    CatalogPage catalogPage = new CatalogPage();
    CatalogPageComputersAndNetsCategory catalogPageComputersAndNetsCategory = new CatalogPageComputersAndNetsCategory();

    @BeforeClass
    public void clickToComputersAndNetsCategory() {
        basicPage.clickToCatalogLink();
        catalogPage.clickComputersAndNetsCategory();
        scrollDown333();
    }

    @Test
    public void testListOfComputersAndNetsColumn(){
        ElementsCollection listOfComputersAndNetsColumn = catalogPageComputersAndNetsCategory.getListOfComputersAndNetsColumn();
        listOfComputersAndNetsColumn.shouldHave(size(11));
        listOfComputersAndNetsColumn.get(0).shouldHave(text(LAPTOPS_COMPUTERS_MONITORS));
        listOfComputersAndNetsColumn.get(1).shouldHave(text(ACCESSORIES));
        listOfComputersAndNetsColumn.get(2).shouldHave(text(PRINTING_AND_DESIGN_EQUIPMENT));
        listOfComputersAndNetsColumn.get(3).shouldHave(text(CASH_REGISTERS_AND_COMMERCIAL_EQUIPMENT));
        listOfComputersAndNetsColumn.get(4).shouldHave(text(MANIPULATORS_AND_INPUT_DEVICES));
        listOfComputersAndNetsColumn.get(5).shouldHave(text(DATA_STORAGE));
        listOfComputersAndNetsColumn.get(6).shouldHave(text(MULTIMEDIA_PERIPHERALS));
        listOfComputersAndNetsColumn.get(7).shouldHave(text(NETWORK_EQUIPMENT));
        listOfComputersAndNetsColumn.get(8).shouldHave(text(ACCESSORIES_FOR_LAPTOPS_AND_COMPUTERS));
        listOfComputersAndNetsColumn.get(9).shouldHave(text(POWER_SUPPLY));
        listOfComputersAndNetsColumn.get(10).shouldHave(text(GAMES_AND_SOFTWARE));
    }
}
