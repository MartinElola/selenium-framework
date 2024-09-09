package pages.screen;

import org.openqa.selenium.By;

public class InventoryPageScreen {

    // Utilizo camelCase para los nombres de las variables.

    public static By lblTituloProductos = By.xpath("//span[@data-test='title']");
    public static By lstProductos = By.className("inventory_list");
    public static By btnAgregarCarrito = By.xpath("//button[text()='Add to cart']");
    public static By btnQuitarCarrito(int indice) { return By.xpath("(//button[text()='Remove'])["+indice+"]"); }
    public static By lblCantidadProductosCarrito = By.className("shopping_cart_badge");

    /* Por conveniencia, armo un xpath generico para el boton de agregar al carrito... para luego poder
    *  agregar al carrito por cantidades cualquier producto sin importar cuál... */
}
