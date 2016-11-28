package com.android.avast.avastpayapp.models;

import java.util.HashMap;
import java.util.List;

/**
 * Created by sushil.jha on 11/28/2016.
 */

public class DataModel {

    public class BrowserProductDetail {
        String from;
        String location;
        String url;

        public BrowserProductDetail(String str) {
            this.from = "app";
            this.url = str;
        }

        public String getUrl() {
            return this.url;
        }

        public void setFrom(String str) {
            this.from = str;
        }

        public void setLocation(String str) {
            this.location = str;
        }

        public String toString() {
            return "Url : " + this.url;
        }
    }

    public class CompleteProductDetails {
        String brand;
        String businessDays;
        String cashback;
        List<String> dates;
        String description;
        String discountedPrice;
        List<String> features;
        List<String> images;
        boolean inStock;
        boolean isliked;
        int likesCount;
        String name;
        OfferDetails offer;
        String price;
        HashMap<String, String> specifications;
        String vendor;

        class OfferDetails {
            int effective_price;
            String offer_text;
            String type;
            int value;

            OfferDetails() {
            }
        }

        public String getBrand() {
            return this.brand;
        }

        public String getBusinessDays() {
            return this.businessDays;
        }

        public String getCashback() {
            return this.cashback;
        }

        public List<String> getDates() {
            return this.dates;
        }

        public String getDescription() {
            return this.description;
        }

        public String getDiscountedPrice() {
            return this.discountedPrice;
        }

        public List<String> getFeatures() {
            return this.features;
        }

        public List<String> getImages() {
            return this.images;
        }

        public boolean getInStock() {
            return this.inStock;
        }

        public String getName() {
            return this.name;
        }

        public String getOfferText() {
            return this.offer == null ? null : this.offer.offer_text;
        }

        public String getOfferType() {
            return this.offer == null ? null : this.offer.type;
        }

        public int getOfferValue() {
            return this.offer == null ? 0 : this.offer.value;
        }

        public String getPrice() {
            return this.price;
        }

        public int getProductLikesCount() {
            return this.likesCount;
        }

        public HashMap<String, String> getSpecifications() {
            return this.specifications;
        }

        public String getVendor() {
            return this.vendor;
        }

        public boolean hasOffer() {
            return false;
        }

        public boolean isProductLiked() {
            return this.isliked;
        }

        public void setBrand(String str) {
            this.brand = str;
        }

        public void setproductLiked(boolean z) {
            this.isliked = z;
        }

        public void setproductLikesCount(int i) {
            this.likesCount = i;
        }
    }
}
