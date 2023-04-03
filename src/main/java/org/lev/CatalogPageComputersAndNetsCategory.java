package org.lev;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.apache.log4j.Logger;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;


@Getter
public class CatalogPageComputersAndNetsCategory {

    Logger log = Logger.getLogger(CatalogPageComputersAndNetsCategory.class);


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
        log.info("method: getListOfComputersAndNetsColumn runs");
        return $$x(COMPUTERS_AND_NETS_ITEMS);
    }

    public void openAccessoriesFromComputersAndNets() {
        log.info("method: openAccessoriesFromComputersAndNets runs");
        $$x(COMPUTERS_AND_NETS_ITEMS).get(0).shouldBe(visible);
        $$x(COMPUTERS_AND_NETS_ITEMS).get(1).shouldBe(visible);
        $$x(COMPUTERS_AND_NETS_ITEMS).get(1).hover();
    }

    public SelenideElement getVideocardTitleElement() {
        log.info("method: getVideocardTitleElement runs");
        return $x(VIDEOCARD_TITLE_ELEMENT);
    }

    public SelenideElement getVideocardProductsAmountAndPriceElement() {
        log.info("method: getVideocardProductsAmountAndPriceElement runs");
        return $x(VIDEOCARD_PRODUCT_AMOUNT_AND_PRICE);
    }

    public SelenideElement getMotherboardTitleElement() {
        log.info("method: getMotherboardTitleElement runs");
        return $x(MOTHERBOARD_TITLE_ELEMENT);
    }

    public SelenideElement getMotherboardProductsAmountAndPriceElement() {
        log.info("method: getMotherboardProductsAmountAndPriceElement runs");
        return $x(MOTHERBOARD_PRODUCT_AMOUNT_AND_PRICE);
    }

    public SelenideElement getSSDTitleElement() {
        log.info("method: getSSDTitleElement runs");
        return $x(SSD_TITLE_ELEMENT);
    }

    public SelenideElement getSSDProductsAmountAndPriceElement() {
        log.info("method: getSSDProductsAmountAndPriceElement runs");
        return $x(SSD_PRODUCT_AMOUNT_AND_PRICE);
    }

    public SelenideElement getHDDTitleElement() {
        log.info("method: getHDDTitleElement runs");
        return $x(HDD_TITLE_ELEMENT);
    }

    public SelenideElement getHDDProductsAmountAndPriceElement() {
        log.info("method: getHDDProductsAmountAndPriceElement runs");
        return $x(HDD_PRODUCT_AMOUNT_AND_PRICE);
    }

    public SelenideElement getChassisTitleElement() {
        log.info("method: getChassisTitleElement runs");
        return $x(CHASSIS_TITLE_ELEMENT);
    }

    public SelenideElement getChassisProductsAmountAndPriceElement() {
        log.info("method: getChassisProductsAmountAndPriceElement runs");
        return $x(CHASSIS_PRODUCT_AMOUNT_AND_PRICE);
    }

    public SelenideElement getPowersupplyTitleElement() {
        log.info("method: getPowersupplyTitleElement runs");
        return $x(POWERSUPPLY_TITLE_ELEMENT);
    }

    public SelenideElement getPowersupplyProductsAmountAndPriceElement() {
        log.info("method: getPowersupplyProductsAmountAndPriceElement runs");
        return $x(POWERSUPPLY_PRODUCT_AMOUNT_AND_PRICE);
    }

    public SelenideElement getSoundcardTitleElement() {
        log.info("method: getSoundcardTitleElement runs");
        return $x(SOUNDCARD_TITLE_ELEMENT);
    }

    public SelenideElement getSoundcardProductsAmountAndPriceElement() {
        log.info("method: getSoundcardProductsAmountAndPriceElement runs");
        return $x(SOUNDCARD_PRODUCT_AMOUNT_AND_PRICE);
    }

    public SelenideElement getNetworkAdapterTitleElement() {
        log.info("method: getNetworkAdapterTitleElement runs");
        return $x(NETWORKADAPTER_TITLE_ELEMENT);
    }

    public SelenideElement getNetworkAdapterProductsAmountAndPriceElement() {
        log.info("method: getNetworkAdapterProductsAmountAndPriceElement runs");
        return $x(NETWORKADAPTER_PRODUCT_AMOUNT_AND_PRICE);
    }

    public SelenideElement getOpticalTitleElement() {
        log.info("method: getOpticalTitleElement runs");
        return $x(OPTICAL_TITLE_ELEMENT);
    }

    public SelenideElement getOpticalProductsAmountAndPriceElement() {
        log.info("method: getOpticalProductsAmountAndPriceElement runs");
        return $x(OPTICAL_PRODUCT_AMOUNT_AND_PRICE);
    }
}
