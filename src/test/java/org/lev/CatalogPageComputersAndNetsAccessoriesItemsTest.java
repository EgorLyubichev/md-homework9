package org.lev;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.matchText;
import static com.codeborne.selenide.Condition.text;
import static org.lev.CatalogPageConstant.CHASSIS_TITLE;
import static org.lev.CatalogPageConstant.HDD_TITLE;
import static org.lev.CatalogPageConstant.MOTHERBOARD_TITLE;
import static org.lev.CatalogPageConstant.NETWORKADAPTER_TITLE;
import static org.lev.CatalogPageConstant.OPTICAL_TITLE;
import static org.lev.CatalogPageConstant.POWERSUPPLY_TITLE;
import static org.lev.CatalogPageConstant.REGULAR_EXPRESSION_OF_PRODUCT_AMOUNT_AND_PRICE;
import static org.lev.CatalogPageConstant.SOUNDCARD_TITLE;
import static org.lev.CatalogPageConstant.SSD_TITLE;
import static org.lev.CatalogPageConstant.VIDEOCARDS_TITLE;
import static org.lev.NavigationHelper.scrollDown333;

public class CatalogPageComputersAndNetsAccessoriesItemsTest extends BasicPageTest {
    CatalogPage catalogPage = new CatalogPage();
    CatalogPageComputersAndNetsCategory catalogPageComputersAndNetsCategory = new CatalogPageComputersAndNetsCategory();

    @BeforeClass
    public void clickToComputersAndNetsCategory() {
        basicPage.clickToCatalogLink();
        catalogPage.clickComputersAndNetsCategory();
        scrollDown333();
        catalogPageComputersAndNetsCategory.openAccessoriesFromComputersAndNets();
    }

    @Test
    public void testVideocardSlotTitle(){
        catalogPageComputersAndNetsCategory.getVideocardTitleElement().shouldHave(text(VIDEOCARDS_TITLE));
    }

    @Test
    public void testVideocardSlotProductAmountAndPrice(){
        catalogPageComputersAndNetsCategory.getVideocardProductsAmountAndPriceElement()
                .should(matchText(REGULAR_EXPRESSION_OF_PRODUCT_AMOUNT_AND_PRICE));
    }

    @Test
    public void testMotherboardSlotTitle(){
        catalogPageComputersAndNetsCategory.getMotherboardTitleElement().shouldHave(text(MOTHERBOARD_TITLE));
    }

    @Test
    public void testMotherboardSlotProductAmountAndPrice(){
        catalogPageComputersAndNetsCategory.getMotherboardProductsAmountAndPriceElement()
                .should(matchText(REGULAR_EXPRESSION_OF_PRODUCT_AMOUNT_AND_PRICE));
    }

    @Test
    public void testSSDSlotTitle(){
        catalogPageComputersAndNetsCategory.getSSDTitleElement().shouldHave(text(SSD_TITLE));
    }

    @Test
    public void testSSDSlotProductAmountAndPrice(){
        catalogPageComputersAndNetsCategory.getSSDProductsAmountAndPriceElement()
                .should(matchText(REGULAR_EXPRESSION_OF_PRODUCT_AMOUNT_AND_PRICE));
    }

    @Test
    public void testHDDSlotTitle(){
        catalogPageComputersAndNetsCategory.getHDDTitleElement().shouldHave(text(HDD_TITLE));
    }

    @Test
    public void testHDDSlotProductAmountAndPrice(){
        catalogPageComputersAndNetsCategory.getHDDProductsAmountAndPriceElement()
                .should(matchText(REGULAR_EXPRESSION_OF_PRODUCT_AMOUNT_AND_PRICE));
    }

    @Test
    public void testChassisSlotTitle(){
        catalogPageComputersAndNetsCategory.getChassisTitleElement().shouldHave(text(CHASSIS_TITLE));
    }

    @Test
    public void testChassisSlotProductAmountAndPrice(){
        catalogPageComputersAndNetsCategory.getChassisProductsAmountAndPriceElement()
                .should(matchText(REGULAR_EXPRESSION_OF_PRODUCT_AMOUNT_AND_PRICE));
    }

    @Test
    public void testPowersupplySlotTitle(){
        catalogPageComputersAndNetsCategory.getPowersupplyTitleElement().shouldHave(text(POWERSUPPLY_TITLE));
    }

    @Test
    public void testPowersupplySlotProductAmountAndPrice(){
        catalogPageComputersAndNetsCategory.getPowersupplyProductsAmountAndPriceElement()
                .should(matchText(REGULAR_EXPRESSION_OF_PRODUCT_AMOUNT_AND_PRICE));
    }

    @Test
    public void testSoundcardSlotTitle(){
        catalogPageComputersAndNetsCategory.getSoundcardTitleElement().shouldHave(text(SOUNDCARD_TITLE));
    }

    @Test
    public void testSoundcardSlotProductAmountAndPrice(){
        catalogPageComputersAndNetsCategory.getSoundcardProductsAmountAndPriceElement()
                .should(matchText(REGULAR_EXPRESSION_OF_PRODUCT_AMOUNT_AND_PRICE));
    }

    @Test
    public void testNetworkAdapterSlotTitle(){
        catalogPageComputersAndNetsCategory.getNetworkAdapterTitleElement().shouldHave(text(NETWORKADAPTER_TITLE));
    }

    @Test
    public void testNetworkAdapterSlotProductAmountAndPrice(){
        catalogPageComputersAndNetsCategory.getNetworkAdapterProductsAmountAndPriceElement()
                .should(matchText(REGULAR_EXPRESSION_OF_PRODUCT_AMOUNT_AND_PRICE));
    }

    @Test
    public void testOpticalSlotTitle(){
        catalogPageComputersAndNetsCategory.getOpticalTitleElement().shouldHave(text(OPTICAL_TITLE));
    }

    @Test
    public void testOpticalSlotProductAmountAndPrice(){
        catalogPageComputersAndNetsCategory.getOpticalProductsAmountAndPriceElement()
                .should(matchText(REGULAR_EXPRESSION_OF_PRODUCT_AMOUNT_AND_PRICE));
    }
}
