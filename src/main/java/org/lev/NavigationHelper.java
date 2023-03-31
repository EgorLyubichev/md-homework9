package org.lev;

import com.codeborne.selenide.Selenide;

public class NavigationHelper {
    public static void scrollDown333(){
        Selenide.executeJavaScript("window.scrollTo(0, 333)");
    }
}
