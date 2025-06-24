package com.walmarttech;

public class Main {
    public static void main(String[] args) {
        // Tu código comienza aquí
        System.out.println("Solución del reto: Carrito sin control");
    }
}
public class Main {
    public static void main(String[] args) {
        // Reto para el desarrollador:
        // 1. Implementar la clase Producto y Carrito.
        // 2. Agregar la funcionalidad para agregar productos al carrito.
        // 3. Implementar la lógica para aplicar promociones 2x1 en una categoría específica.
        // 4. Implementar la lógica para aplicar descuentos por categoría.
        // 5. Calcular el total del carrito después de aplicar las promociones.
        // 6. Crear pruebas unitarias para verificar la correcta aplicación de las promociones y el cálculo del total.

        // Ejemplo de uso (debe funcionar una vez implementadas las clases y métodos):
        Producto producto1 = new Producto("Camiseta", 20.0, "Ropa");
        Producto producto2 = new Producto("Pantalón", 50.0, "Ropa");
        Producto producto3 = new Producto("Zapatos", 80.0, "Calzado");
        Producto producto4 = new Producto("Calcetines", 10.0, "Ropa");
        Producto producto5 = new Producto("Camiseta", 20.0, "Ropa"); // Repetido para el 2x1

        Carrito carrito = new Carrito();
        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);
        carrito.agregarProducto(producto3);
        carrito.agregarProducto(producto4);
        carrito.agregarProducto(producto5);

        carrito.aplicarPromocion2x1("Ropa");
        carrito.aplicarDescuentoCategoria("Calzado", 0.10);

        System.out.println("Total del carrito: " + carrito.calcularTotal());
    }
}

// Implementar las clases Producto y Carrito aquí
// class Producto { ... }
// class Carrito { ... }