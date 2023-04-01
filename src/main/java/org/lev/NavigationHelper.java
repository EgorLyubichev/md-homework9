package org.lev;

import com.codeborne.selenide.Selenide;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NavigationHelper {

    private final static Logger log = LoggerFactory.getLogger(NavigationHelper.class);

    public static void scrollDown333(){
        log.info("method: scrollDown333 runs");
        Selenide.executeJavaScript("window.scrollTo(0, 333)");
    }
}
