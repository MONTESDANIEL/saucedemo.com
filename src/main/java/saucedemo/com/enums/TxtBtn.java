package saucedemo.com.enums;

public enum TxtBtn {
    TXT_BTN("Checkout");
    private final String mensaje;

    TxtBtn(String mensaje){
        this.mensaje = mensaje;
    }
    public String getMesaje (){return mensaje;}
}
