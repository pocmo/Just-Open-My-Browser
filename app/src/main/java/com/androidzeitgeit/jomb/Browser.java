package com.androidzeitgeit.jomb;

import android.content.Context;
import android.content.pm.PackageManager;

import java.util.ArrayList;
import java.util.List;

public enum Browser {
    CHROME_STABLE("com.android.chrome"),
    CHROME_BETA("com.android.chrome"),
    CHROME_DEV("com.chrome.dev"),

    FIREFOX_STABLE("org.mozilla.firefox"),
    FIREFOX_BETA("org.mozilla.firefox_beta"),
    FIREFOX_AURORA("org.mozilla.fennec_aurora"),
    FIREFOX_NIGHTLY("org.mozilla.fennec"),

    OPERA("com.opera.browser"),
    OPERA_BETA("com.opera.browser.beta"),
    OPERA_MINI("com.opera.mini.native"),
    OPERA_MINI_BETA("com.opera.mini.native.beta"),

    ANDROID_STOCK_BROWSER("com.android.browser"),
    UC_BROWSER("com.UCMobile.intl"),
    DOLPHIN_BROWSER("mobi.mgeek.TunnyBrowser");

    private String packageName;

    Browser(String packageName) {
        this.packageName = packageName;
    }

    public String getPackageName() {
        return packageName;
    }

    public static List<Browser> getInstalledBrowsers(Context context) {
        final List<Browser> installedBrowsers = new ArrayList<>();
        final PackageManager packageManager = context.getPackageManager();

        for (Browser browser : values()) {
            if (packageManager.getLaunchIntentForPackage(browser.getPackageName()) != null) {
                installedBrowsers.add(browser);
            }
        }

        return installedBrowsers;
    }
}
