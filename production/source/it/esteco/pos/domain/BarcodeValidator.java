package it.esteco.pos.domain;

public class BarcodeValidator {
    private Display display;

    public BarcodeValidator(Display display) {
        this.display = display;
    }

    public boolean isValidBarcode(String barcodeAsText) {
        if (barcodeAsText.isEmpty()) {
            display.displayEmptyBarcodeError();
            return false;
        }
        return true;
    }
}
