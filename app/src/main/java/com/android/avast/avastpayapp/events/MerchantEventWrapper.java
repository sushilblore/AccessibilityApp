package com.android.avast.avastpayapp.events;

import android.view.accessibility.AccessibilityEvent;

import com.android.avast.avastpayapp.services.AvastPayService;

/**
 * Created by sushil.jha on 11/25/2016.
 */

public interface MerchantEventWrapper {
    boolean handleEvent(AccessibilityEvent accessibilityEvent);
    void setServiceObject(AvastPayService avastPayService);
}
