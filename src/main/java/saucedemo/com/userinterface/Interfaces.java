package saucedemo.com.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Interfaces {
    public static final Target USER = Target.the("Ingreso usuario")
            .located(By.xpath("//input[@id='user-name']"));
    public static final Target PASSWORD = Target.the("Ingreso contraseña")
            .located(By.xpath("//input[@id='password']"));
    public static final Target ACCESS = Target.the("Btn para acceder al sitio web")
            .located(By.xpath("//input[@id='login-button']"));
    public static final Target FILTER = Target.the("Btn para insertar un filtro")
            .located(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[2]/div[1]/span[1]/select[1]"));
    public static final Target PRODUCT = Target.the("Producto a seleccionar")
            .located(By.xpath("//a[@id='item_5_img_link']"));
    public static final Target ADD_TO_CART = Target.the("Btn para agregar el producto al carrito")
            .located(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/button[1]"));
     public static final Target VIEW_CART = Target.the("Btn para visualizar el carrito")
            .located(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]"));
    public static final Target BTN_VALIDATION = Target.the("Btn de validacion final")
                .located(By.xpath("//button[@id='checkout']"));
    public static final Target TXT_VALIDATION = Target.the("Texto de validacion final")
                .located(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/a[1]/div[1]"));



}
