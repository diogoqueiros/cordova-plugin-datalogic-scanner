package com.itr.dlaxist;

/**
 * Simple class for holding barcode data
 */
public class BarcodeScan {
    public String LabelType;
    public String Barcode;
    public BarcodeScan (String label, String code){
        this.LabelType = label;
        this.Barcode = code;
    }
}