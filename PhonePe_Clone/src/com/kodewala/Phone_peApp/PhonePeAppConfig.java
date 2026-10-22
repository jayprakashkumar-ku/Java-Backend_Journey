package com.kodewala.Phone_peApp;

public class PhonePeAppConfig {
static String appName="PhonePe Clone";

static int version=1;

private PhonePeAppConfig() {
	
}

static void  displayAppInfo() {
	 System.out.println("App Name: " + appName);
     System.out.println("Version: " + version);
}
static void updateVersion(int newVersion) {
    if (newVersion > 0) {
        version = newVersion;
    } else {
        System.out.println("Invalid version!");
    }
}
}
