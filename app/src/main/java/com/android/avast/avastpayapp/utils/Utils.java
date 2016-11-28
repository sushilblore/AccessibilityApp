package com.android.avast.avastpayapp.utils;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.Intent;
import android.view.accessibility.AccessibilityManager;

/**
 * Created by sushil.jha on 11/24/2016.
 */

public class Utils {
    public static void openAccessibilitySettings(Context context) {
        try {
            Intent intent = new Intent("android.settings.ACCESSIBILITY_SETTINGS");
            //intent.addFlags(268435456);
            intent.putExtra("EXTRA_SETTINGS_COMPONENT_NAME", "AvastPay");
            context.startActivity(intent);
        } catch (Exception e) {
        }
    }

    public static boolean isAccessibilityEnabled(Context context) {
        return isAccessibilityEnabled(context, context.getPackageName() + "/.services.AvastPayService");
    }

    private static boolean isAccessibilityEnabled(Context context, String str) {
        for (AccessibilityServiceInfo id : ((AccessibilityManager) context.getSystemService(Context.ACCESSIBILITY_SERVICE)).getEnabledAccessibilityServiceList(-1)) {
            if (str.equals(id.getId())) {
                return true;
            }
        }
        return false;
    }
}
