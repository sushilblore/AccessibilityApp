package com.android.avast.avastpayapp.models;

/**
 * Created by sushil.jha on 11/28/2016.
 */

public class EventModel {

    public class AppNotSupported {
        public String packageName;

        public AppNotSupported(String str) {
            this.packageName = str;
        }
    }

    public class AutoFillEvent {
    }

    public class BrowserProductEvent {
        public DataModel.BrowserProductDetail product;
    }

    public class AppProductEvent {

    }

    public class GenericEvent {
        public String message;
        public String type;
    }

    public class AvastPayServiceStartEvent {
    }

    public class ShowOverlayButtonEvent {
    }

    public class ShowOverlayEvent {
    }


}
