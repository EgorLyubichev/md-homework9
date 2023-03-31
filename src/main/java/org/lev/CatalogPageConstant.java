package org.lev;

public interface CatalogPageConstant {

    /**
     * Catalog items
     */
    String ONLINER_PRIME = "Onlíner Prime";
    String ELECTRONICS = "Электроника";
    String COMPUTERS_AND_NETS = "Компьютеры и сети";
    String APPLIANCES = "Бытовая техника";
    String EVERY_DAY = "На каждый день";
    String BUILDING_AND_RENOVATION = "Стройка и ремонт";
    String HOUSE_AND_GARDEN = "Дом и сад";
    String CARS_AND_MOTO = "Авто и мото";
    String BEAUTY_AND_SPORT = "Красота и спорт";
    String FOR_CHILDREN_AND_MOMS = "Детям и мамам";

    /**
     * Computers and nets items
     */
    String LAPTOPS_COMPUTERS_MONITORS = "Ноутбуки, компьютеры, мониторы";
    String ACCESSORIES = "Комплектующие";
    String PRINTING_AND_DESIGN_EQUIPMENT = "Техника для печати и дизайна";
    String CASH_REGISTERS_AND_COMMERCIAL_EQUIPMENT = "Кассовые аппараты и торговое оборудование";
    String MANIPULATORS_AND_INPUT_DEVICES ="Манипуляторы и устройства ввода";
    String DATA_STORAGE ="Хранение данных";
    String MULTIMEDIA_PERIPHERALS ="Мультимедиа периферия";
    String NETWORK_EQUIPMENT ="Сетевое оборудование";
    String ACCESSORIES_FOR_LAPTOPS_AND_COMPUTERS ="Аксессуары к ноутбукам и компьютерам";
    String POWER_SUPPLY ="Электропитание";
    String GAMES_AND_SOFTWARE ="Игры и программное обеспечение";

    /**
     * Accessories items
     * */
    String VIDEOCARDS_TITLE = "Видеокарты";
    String MOTHERBOARD_TITLE = " Материнские платы ";
    String SSD_TITLE = "SSD";
    String HDD_TITLE = "Жесткие диски";
    String CHASSIS_TITLE = "Корпуса";
    String POWERSUPPLY_TITLE = "Блоки питания";
    String SOUNDCARD_TITLE = "Звуковые карты";
    String NETWORKADAPTER_TITLE = "Сетевые адаптеры";
    String OPTICAL_TITLE = "Оптические приводы";

    String REGULAR_EXPRESSION_OF_PRODUCT_AMOUNT_AND_PRICE =
            "[\\d]{0,}[\\,]?[\\d]+[\\s][товар[а]?[ов]?\nот\\s[\\d]+[\\,]?[\\d]{0,}[\\s]р\\.]";
}
