package saucedemo.com.enums;

public enum TxtProduct {
    TXT_PRODUCT("Sauce Labs Fleece Jacket");
    private final String mensaje;

    TxtProduct(String mensaje){
        this.mensaje = mensaje;
    }
    public String getMesaje (){return mensaje;}
}
