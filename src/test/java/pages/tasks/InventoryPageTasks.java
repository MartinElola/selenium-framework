package pages.tasks;

import io.cucumber.java.es.*;
import org.testng.Assert;
import pages.actions.InventoryPageActions;

public class InventoryPageTasks extends InventoryPageActions {

    @Dada("la pagina de inventario de productos")
    public void validarPaginaInventario() {
        validarUrlInventario();
        validarCargaTituloProductos();
        validarCargaListadoProductos();
    }

    @Cuando("el usuario agrega {int} productos al carrito")
    public void agregarProductosAlCarrito(int cantidad) {
        clickearAgregarCarrito(cantidad);
        validarCantidadProductosCarrito(cantidad);
    }

    @Y("el usuario elimina {int} productos del carrito")
    public void eliminarProductosDelCarrito(int cantidad) {
        clickearBotonQuitarCarrito(cantidad);
    }

    @Entonces("el usuario debe tener {int} productos en el carrito")
    public void validarCantProductosCarrito(int cantidad) {
        validarCantidadProductosCarrito(cantidad);
    }

}
