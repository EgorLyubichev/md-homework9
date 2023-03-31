package org.lev;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;


public class CatalogPageComputersAndNetsCategory {

    private static final String COMPUTERS_AND_NETS_ITEMS =
            "//div[@data-id='2']/div[1]/div/div";
    private static final String VIDEOCARD_TITLE_ELEMENT =
            "//div[@data-id='2']/div[1]/div/div[2]/div[2]/div/a[@href='https://catalog.onliner.by/videocard']/span/span[2]";
    private static final String VIDEOCARD_PRODUCT_AMOUNT_AND_PRICE =
            "//div[@data-id='2']/div[1]/div/div[2]/div[2]/div/a[@href='https://catalog.onliner.by/videocard']/span/span[3]";
    private static final String MOTHERBOARD_TITLE_ELEMENT =
            "//div[@data-id='2']/div[1]/div/div[2]/div[2]/div/a[@href='https://catalog.onliner.by/motherboard']/span/span[2]";
    private static final String MOTHERBOARD_PRODUCT_AMOUNT_AND_PRICE =
            "//div[@data-id='2']/div[1]/div/div[2]/div[2]/div/a[@href='https://catalog.onliner.by/motherboard']/span/span[3]";
    private static final String SSD_TITLE_ELEMENT =
            "//div[@data-id='2']/div[1]/div/div[2]/div[2]/div/a[@href='https://catalog.onliner.by/ssd']/span/span[2]";
    private static final String SSD_PRODUCT_AMOUNT_AND_PRICE =
            "//div[@data-id='2']/div[1]/div/div[2]/div[2]/div/a[@href='https://catalog.onliner.by/ssd']/span/span[3]";
    private static final String HDD_TITLE_ELEMENT =
            "//div[@data-id='2']/div[1]/div/div[2]/div[2]/div/a[@href='https://catalog.onliner.by/hdd']/span/span[2]";
    private static final String HDD_PRODUCT_AMOUNT_AND_PRICE =
            "//div[@data-id='2']/div[1]/div/div[2]/div[2]/div/a[@href='https://catalog.onliner.by/hdd']/span/span[3]";
    private static final String CHASSIS_TITLE_ELEMENT =
            "//div[@data-id='2']/div[1]/div/div[2]/div[2]/div/a[@href='https://catalog.onliner.by/chassis']/span/span[2]";
    private static final String CHASSIS_PRODUCT_AMOUNT_AND_PRICE =
            "//div[@data-id='2']/div[1]/div/div[2]/div[2]/div/a[@href='https://catalog.onliner.by/chassis']/span/span[3]";
    private static final String POWERSUPPLY_TITLE_ELEMENT =
            "//div[@data-id='2']/div[1]/div/div[2]/div[2]/div/a[@href='https://catalog.onliner.by/powersupply']/span/span[2]";
    private static final String POWERSUPPLY_PRODUCT_AMOUNT_AND_PRICE =
            "//div[@data-id='2']/div[1]/div/div[2]/div[2]/div/a[@href='https://catalog.onliner.by/powersupply']/span/span[3]";
    private static final String SOUNDCARD_TITLE_ELEMENT =
            "//div[@data-id='2']/div[1]/div/div[2]/div[2]/div/a[@href='https://catalog.onliner.by/soundcard?type_soundcard%5B0%5D=internal&type_soundcard%5Boperation%5D=union']/span/span[2]";
    private static final String SOUNDCARD_PRODUCT_AMOUNT_AND_PRICE =
            "//div[@data-id='2']/div[1]/div/div[2]/div[2]/div/a[@href='https://catalog.onliner.by/soundcard?type_soundcard%5B0%5D=internal&type_soundcard%5Boperation%5D=union']/span/span[3]";
    private static final String NETWORKADAPTER_TITLE_ELEMENT =
            "//div[@data-id='2']/div[1]/div/div[2]/div[2]/div/a[@href='https://catalog.onliner.by/networkadapter']/span/span[2]";
    private static final String NETWORKADAPTER_PRODUCT_AMOUNT_AND_PRICE =
            "//div[@data-id='2']/div[1]/div/div[2]/div[2]/div/a[@href='https://catalog.onliner.by/networkadapter']/span/span[3]";
    private static final String OPTICAL_TITLE_ELEMENT =
            "//div[@data-id='2']/div[1]/div/div[2]/div[2]/div/a[@href='https://catalog.onliner.by/optical']/span/span[2]";
    private static final String OPTICAL_PRODUCT_AMOUNT_AND_PRICE =
            "//div[@data-id='2']/div[1]/div/div[2]/div[2]/div/a[@href='https://catalog.onliner.by/optical']/span/span[3]";


    public ElementsCollection getListOfComputersAndNetsColumn() {
        return $$x(COMPUTERS_AND_NETS_ITEMS);
    }

    public void openAccessoriesFromComputersAndNets() {
        $$x(COMPUTERS_AND_NETS_ITEMS).get(1).hover();
    }

    public SelenideElement getVideocardTitleElement() {
        return $x(VIDEOCARD_TITLE_ELEMENT);
    }

    public SelenideElement getVideocardProductsAmountAndPriceElement() {
        return $x(VIDEOCARD_PRODUCT_AMOUNT_AND_PRICE);
    }

    public SelenideElement getMotherboardTitleElement() {
        return $x(MOTHERBOARD_TITLE_ELEMENT);
    }

    public SelenideElement getMotherboardProductsAmountAndPriceElement() {
        return $x(MOTHERBOARD_PRODUCT_AMOUNT_AND_PRICE);
    }

    public SelenideElement getSSDTitleElement() {
        return $x(SSD_TITLE_ELEMENT);
    }

    public SelenideElement getSSDProductsAmountAndPriceElement() {
        return $x(SSD_PRODUCT_AMOUNT_AND_PRICE);
    }

    public SelenideElement getHDDTitleElement() {
        return $x(HDD_TITLE_ELEMENT);
    }

    public SelenideElement getHDDProductsAmountAndPriceElement() {
        return $x(HDD_PRODUCT_AMOUNT_AND_PRICE);
    }

    public SelenideElement getChassisTitleElement() {
        return $x(CHASSIS_TITLE_ELEMENT);
    }

    public SelenideElement getChassisProductsAmountAndPriceElement() {
        return $x(CHASSIS_PRODUCT_AMOUNT_AND_PRICE);
    }

    public SelenideElement getPowersupplyTitleElement() {
        return $x(POWERSUPPLY_TITLE_ELEMENT);
    }

    public SelenideElement getPowersupplyProductsAmountAndPriceElement() {
        return $x(POWERSUPPLY_PRODUCT_AMOUNT_AND_PRICE);
    }

    public SelenideElement getSoundcardTitleElement() {
        return $x(SOUNDCARD_TITLE_ELEMENT);
    }

    public SelenideElement getSoundcardProductsAmountAndPriceElement() {
        return $x(SOUNDCARD_PRODUCT_AMOUNT_AND_PRICE);
    }

    public SelenideElement getNetworkAdapterTitleElement() {
        return $x(NETWORKADAPTER_TITLE_ELEMENT);
    }

    public SelenideElement getNetworkAdapterProductsAmountAndPriceElement() {
        return $x(NETWORKADAPTER_PRODUCT_AMOUNT_AND_PRICE);
    }

    public SelenideElement getOpticalTitleElement() {
        return $x(OPTICAL_TITLE_ELEMENT);
    }

    public SelenideElement getOpticalProductsAmountAndPriceElement() {
        return $x(OPTICAL_PRODUCT_AMOUNT_AND_PRICE);
    }
}
