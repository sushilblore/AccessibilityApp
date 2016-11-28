package com.android.avast.avastpayapp.events.nlshopping;

import android.util.Log;
import android.view.accessibility.AccessibilityEvent;

import com.android.avast.avastpayapp.events.MerchantEventWrapper;
import com.android.avast.avastpayapp.services.AvastPayService;

/**
 * Created by sushil.jha on 11/25/2016.
 */

public class Wehkamp implements MerchantEventWrapper {
    private final static String TAG = "Wehkamp";

    public Wehkamp() {
    }

    @Override
    public boolean handleEvent(AccessibilityEvent accessibilityEvent) {
        Log.i(TAG, "..WehKamp handleEvent");
        return false;
    }

    @Override
    public void setServiceObject(AvastPayService avastPayService) {
        Log.i(TAG, "..WehKamp setServiceObject");
    }
}
