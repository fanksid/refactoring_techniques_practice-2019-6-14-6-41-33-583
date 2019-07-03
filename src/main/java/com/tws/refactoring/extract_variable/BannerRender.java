package com.tws.refactoring.extract_variable;

public class BannerRender {
    String renderBanner(String platform, String browser) {
        if (containMac(platform) && containIE(browser)) {
            return "IE on Mac?";
        }
        return "banner";
    }

    private boolean containIE(String browser) {
        return browser.toUpperCase().contains("IE");
    }

    private boolean containMac(String platform) {
        return platform.toUpperCase().contains("MAC");
    }
}
