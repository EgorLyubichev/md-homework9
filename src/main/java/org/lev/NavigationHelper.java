package org.lev;

import com.codeborne.selenide.Selenide;
import org.apache.log4j.Logger;

public class NavigationHelper {

    private final static Logger log = Logger.getLogger(NavigationHelper.class);

    public static void scrollDown333(){
        log.info("method: scrollDown333 runs");
        Selenide.executeJavaScript("window.scrollTo(0, 333)");
    }
}
