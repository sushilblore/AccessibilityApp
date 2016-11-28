package com.android.avast.avastpayapp.models;

import java.util.HashMap;

/**
 * Created by sushil.jha on 11/25/2016.
 */

public class SimpleModels {

    public static class Merchant {
        public static final String WEHKAMP = "wehkamp";
        public static HashMap<String, String> packageMap;
        public static HashMap<String, String> packageToMerchant;
        static {
            packageMap = new HashMap();
            packageMap.put(WEHKAMP, "nl.wehkamp.shop");
        }
    }
}
