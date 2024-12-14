package zavaletagustavo.poofinal;

import zavaletagustavo.poofinal.Menus.MenuAlmacenes;
import zavaletagustavo.poofinal.Menus.SubMenuUsuario;
import zavaletagustavo.poofinal.productos.*;
import zavaletagustavo.poofinal.Almacenes.Almacen;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear productos por defecto
        List<ProductoBase> productos = new ArrayList<>();
        productos.add(new Tragos("Vodka", "Smirnoff", 20, 15.99));
        productos.add(new Tragos("Whisky", "Jack Daniels", 10, 35.50));
        productos.add(new Tragos("Ron", "Bacardi", 30, 12.75));
        productos.add(new Lacteos("Leche", "Gloria", 50, 2.00));
        productos.add(new Lacteos("Queso", "Laive", 25, 8.50));
        productos.add(new Carnes("Pollo", "San Fernando", 40, 6.99));
        productos.add(new Carnes("Res", "Carnes del Sur", 15, 10.50));
        productos.add(new Cereales("Avena", "Quaker", 35, 4.00));
        productos.add(new Cereales("Cereal", "Kellogg's", 20, 5.50));
        productos.add(new Chucherias("Chips", "Lays", 50, 1.50));
        productos.add(new Chucherias("Chocolates", "Nestle", 40, 2.00));
        productos.add(new Complementos("Harina", "Blanca Flor", 25, 3.50));
        productos.add(new Complementos("Aceite", "Primor", 30, 6.00));

        // Crear almacenes por defecto
        List<Almacen> almacenes = new ArrayList<>();
        Almacen almacen1 = new Almacen("Almacen 1", "Congelables");
        almacen1.agregarProducto(productos.get(0));
        almacen1.agregarProducto(productos.get(1));
        almacen1.agregarProducto(productos.get(2));
        almacen1.agregarProducto(productos.get(5));
        almacen1.agregarProducto(productos.get(6));
        
        Almacen almacen2 = new Almacen("Almacen 2", "Perecibles");
        almacen2.agregarProducto(productos.get(3));
        almacen2.agregarProducto(productos.get(4));
        almacen2.agregarProducto(productos.get(5));
        almacen2.agregarProducto(productos.get(6));

        Almacen almacen3 = new Almacen("Almacen 3", "Enlatados");
        almacen3.agregarProducto(productos.get(0));
        almacen3.agregarProducto(productos.get(1));
        almacen3.agregarProducto(productos.get(7));
        almacen3.agregarProducto(productos.get(8));

        almacenes.add(almacen1);
        almacenes.add(almacen2);
        almacenes.add(almacen3);

        // Menús y lógica de usuario
        SubMenuUsuario menuUsuario = new SubMenuUsuario();
        MenuAlmacenes menuAlmacenes = new MenuAlmacenes(almacenes);

        // Seleccionar usuario
        String tipoUsuario = menuUsuario.seleccionarUsuario();

        // Mostrar menú de almacenes
        menuAlmacenes.mostrarAlmacenes(tipoUsuario);
    }
}
