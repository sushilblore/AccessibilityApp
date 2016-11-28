package com.android.avast.avastpayapp.utils;

import android.util.Log;

import com.android.avast.avastpayapp.events.MerchantEventWrapper;
import com.android.avast.avastpayapp.events.nlshopping.Wehkamp;
import com.android.avast.avastpayapp.models.SimpleModels;
import com.android.avast.avastpayapp.services.AvastPayService;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sushil.jha on 11/25/2016.
 */

public class PackageMap {
    private final static String TAG = "PackageMap";
    public static List<String> shoppingApps;
    public static Map<String, MerchantEventWrapper> packageHandlerMap;

    static final class MerchantPackages extends HashMap<String, MerchantEventWrapper> {
        MerchantPackages() {
            put("nl.wehkamp.shop", new Wehkamp());
        }
    }

    static {
        packageHandlerMap = new MerchantPackages();
        shoppingApps = Arrays.asList(new String[]{(String) SimpleModels.Merchant.packageMap.get(SimpleModels.Merchant.WEHKAMP)});
    }

    public static  MerchantEventWrapper getHandlerForPackage(String str, AvastPayService avastPayService) throws ClassNotFoundException {
        Log.d(TAG, "getHandlerForPackage");
        if (packageHandlerMap.containsKey(str)) {
            Log.d(TAG, "getHandlerForPackage contains key");
            MerchantEventWrapper merchantEventWrapper = (MerchantEventWrapper) packageHandlerMap.get(str);
            merchantEventWrapper.setServiceObject(avastPayService);
            return merchantEventWrapper;
        }
        throw new ClassNotFoundException();
    }
}
