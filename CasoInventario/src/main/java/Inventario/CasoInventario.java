/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Inventario;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class CasoInventario {

    public static void main(String[] args) {
        // Datos de los productos
        String nom1, nom2, nom3, nom4, nom5, valor;  // Nombres de los productos
        int cant1, cant2, cant3, cant4, cant5;  // Cantidad en inventario
        double precio1, precio2, precio3, precio4, precio5;  // Precio unitario
        int cat1, cat2, cat3, cat4, cat5;  // Categoría de producto (1: Electrónica, 2: Alimentos, 3: Ropa)

        // Variables para almacenar el valor total y los descuentos
        double valorTot1, valorTot2, valorTot3, valorTot4, valorTot5;
        double desc1, desc2, desc3, desc4, desc5;

        // Cálculo final
        double valorFinal1, valorFinal2, valorFinal3, valorFinal4, valorFinal5;
        double totalinvent;

        //Creacion del metodo Scanner
        Scanner lector = new Scanner(System.in);

        //Entrada de Datos del producto 1        
        System.out.println("Ingrese el nombre del producto #1:");
        nom1 = lector.nextLine();
        System.out.println("Ingrese la cantidad en inventario del producto #1:");
        cant1 = lector.nextInt();
        lector.nextLine();
        System.out.println("Ingrese el precio unitario del producto #1:");
        precio1 = lector.nextDouble();
        lector.nextLine();
        System.out.println("Ingrese la categoria del producto #1 (1: Electronicos, 2: Alimentos, 3: Ropa):");
        cat1 = lector.nextInt();
        lector.nextLine();

        //Cálculo del Valor Total del Inventario
        valorTot1 = cant1 * precio1;

        // Aplicación del descuento
        if (cant1 > 100) {
            desc1 = 0.20;
        } else if (cant1 > 50) {
            desc1 = 0.10;
        } else {
            desc1 = 0;
        }
        
        if (desc1 == 0.20) {
            valor = "20% (Cantidad mayor a 100)";
        } else if (desc1 == 0.10) {
            valor = "10% (Cantidad mayor a 50)";
        }else {
            valor = "No hay descuento (Cantidad menor o igual a 50)";
        }
        
        // Calcular valor final después del descuento
        valorFinal1 = valorTot1 - (valorTot1 * desc1);

        // Mostrar mensaje adicional basado en la categoría del producto 1
        switch (cat1) {
            case 1 ->
                System.out.println(" Producto: " + nom1 + "\n Precio Unitario: " + precio1 + "\n Valor total antes de descuentos: "
                        + valorTot1 + "\n Descuento Aplicado: " + valor + "\n Valor Total despues del descuento: " + valorFinal1 + "\n Producto electronico. Revisar garantia.");
            case 2 ->
                System.out.println(" Producto: " + nom1 + "\n Precio Unitario: " + precio1 + "\n Valor total antes de descuentos: "
                        + valorTot1 + "\n Descuento Aplicado: " + valor + "\n Valor Total despues del descuento: " + valorFinal1 + "\n Producto alimenticio. Revisar fecha de caducidad.");
            case 3 ->
                System.out.println(" Producto: " + nom1 + "\n Precio Unitario: " + precio1 + "\n Valor total antes de descuentos: "
                        + valorTot1 + "\n Descuento Aplicado: " + valor + "\n Valor Total despues del descuento: " + valorFinal1 + "\n Producto de ropa. Revisar tallas disponibles.");
        }
        System.out.println("\n-------------");
        lector.nextLine();

        //Entrada de Datos del producto 2        
        System.out.println("Ingrese el nombre del producto #2:");
        nom2 = lector.nextLine();
        System.out.println("Ingrese la cantidad en inventario del producto #2:");
        cant2 = lector.nextInt();
        lector.nextLine();
        System.out.println("Ingrese el precio unitario del producto #2:");
        precio2 = lector.nextDouble();
        lector.nextLine();
        System.out.println("Ingrese la categoria del producto #2 (1: Electronicos, 2: Alimentos, 3: Ropa):");
        cat2 = lector.nextInt();
        lector.nextLine();

        //Cálculo del Valor Total del Inventario
        valorTot2 = cant2 * precio2;

        // Aplicación del descuento
        if (cant2 > 100) {
            desc2 = 0.20;
        } else if (cant2 > 50) {
            desc2 = 0.10;
        } else {
            desc2 = 0;
        }
        
        if (desc2 == 0.20) {
            valor = "20% (Cantidad mayor a 100)";
        } else if (desc2 == 0.10) {
            valor = "10% (Cantidad mayor a 50)";
        }else {
            valor = "No hay descuento (Cantidad menor o igual a 50)";
        }
        
        // Calcular valor final después del descuento
        valorFinal2 = valorTot2 - (valorTot2 * desc2);

        // Mostrar mensaje adicional basado en la categoría del producto 2
        switch (cat2) {
            case 1 ->
                System.out.println(" Producto: " + nom2 + "\n Precio Unitario: " + precio2 + "\n Valor total antes de descuentos: "
                        + valorTot2 + "\n Descuento Aplicado: " + valor + "\n Valor Total despues del descuento: " + valorFinal2 + "\n Producto electronico. Revisar garantia.");
            case 2 ->
                System.out.println(" Producto: " + nom2 + "\n Precio Unitario: " + precio2 + "\n Valor total antes de descuentos: "
                        + valorTot2 + "\n Descuento Aplicado: " + valor + "\n Valor Total despues del descuento: " + valorFinal2 + "\n Producto alimenticio. Revisar fecha de caducidad.");
            case 3 ->
                System.out.println(" Producto: " + nom2 + "\n Precio Unitario: " + precio2 + "\n Valor total antes de descuentos: "
                        + valorTot2 + "\n Descuento Aplicado: " + valor + "\n Valor Total despues del descuento: " + valorFinal2 + "\n Producto de ropa. Revisar tallas disponibles.");
        }
        System.out.println("\n-------------");
        lector.nextLine();

        //Entrada de Datos del producto 3      
        System.out.println("Ingrese el nombre del producto #3:");
        nom3 = lector.nextLine();
        System.out.println("Ingrese la cantidad en inventario del producto #3:");
        cant3 = lector.nextInt();
        lector.nextLine();
        System.out.println("Ingrese el precio unitario del producto #3:");
        precio3 = lector.nextDouble();
        lector.nextLine();
        System.out.println("Ingrese la categoria del producto #3 (1: Electronicos, 2: Alimentos, 3: Ropa):");
        cat3 = lector.nextInt();
        lector.nextLine();

        //Cálculo del Valor Total del Inventario
        valorTot3 = cant3 * precio3;

        // Aplicación del descuento
        if (cant3 > 100) {
            desc3 = 0.20;
        } else if (cant3 > 50) {
            desc3 = 0.10;
        } else {
            desc3 = 0;
        }

        if (desc3 == 0.20) {
            valor = "20% (Cantidad mayor a 100)";
        } else if (desc3 == 0.10) {
            valor = "10% (Cantidad mayor a 50)";
        }else {
            valor = "No hay descuento (Cantidad menor o igual a 50)";
        }

        // Calcular valor final después del descuento
        valorFinal3 = valorTot3 - (valorTot3 * desc3);

        // Mostrar mensaje adicional basado en la categoría del producto 3
        switch (cat3) {
            case 1 ->
                System.out.println(" Producto: " + nom3 + "\n Precio Unitario: " + precio3 + "\n Valor total antes de descuentos: "
                        + valorTot3 + "\n Descuento Aplicado: " + valor + "\n Valor Total despues del descuento: " + valorFinal3 + "\n Producto electronico. Revisar garantia.");
            case 2 ->
                System.out.println(" Producto: " + nom3 + "\n Precio Unitario: " + precio3 + "\n Valor total antes de descuentos: "
                        + valorTot3 + "\n Descuento Aplicado: " + valor + "\n Valor Total despues del descuento: " + valorFinal3 + "\n Producto alimenticio. Revisar fecha de caducidad.");
            case 3 ->
                System.out.println(" Producto: " + nom3 + "\n Precio Unitario: " + precio3 + "\n Valor total antes de descuentos: "
                        + valorTot3 + "\n Descuento Aplicado: " + valor + "\n Valor Total despues del descuento: " + valorFinal3 + "\n Producto de ropa. Revisar tallas disponibles.");
        }
        System.out.println("\n-------------");
        lector.nextLine();

        //Entrada de Datos del producto 4
        System.out.println("Ingrese el nombre del producto #4:");
        nom4 = lector.nextLine();
        System.out.println("Ingrese la cantidad en inventario del producto #4:");
        cant4 = lector.nextInt();
        lector.nextLine();
        System.out.println("Ingrese el precio unitario del producto #4:");
        precio4 = lector.nextDouble();
        lector.nextLine();
        System.out.println("Ingrese la categoria del producto #4 (1: Electronicos, 2: Alimentos, 3: Ropa):");
        cat4 = lector.nextInt();
        lector.nextLine();

        //Cálculo del Valor Total del Inventario
        valorTot4 = cant4 * precio4;

        // Aplicación del descuento
        if (cant4 > 100) {
            desc4 = 0.20;
        } else if (cant4 > 50) {
            desc4 = 0.10;
        } else {
            desc4 = 0;
        }

        if (desc4 == 0.20) {
            valor = "20% (Cantidad mayor a 100)";
        } else if (desc4 == 0.10) {
            valor = "10% (Cantidad mayor a 50)";
        }else {
            valor = "No hay descuento (Cantidad menor o igual a 50)";
        }
        
        // Calcular valor final después del descuento
        valorFinal4 = valorTot4 - (valorTot4 * desc4);
        // Mostrar mensaje adicional basado en la categoría del producto 4
        switch (cat4) {
            case 1 ->
                System.out.println(" Producto: " + nom4 + "\n Precio Unitario: " + precio4 + "\n Valor total antes de descuentos: "
                        + valorTot4 + "\n Descuento Aplicado: " + valor + "\n Valor Total despues del descuento: " + valorFinal4 + "\n Producto electronico. Revisar garantia.");
            case 2 ->
                System.out.println(" Producto: " + nom4 + "\n Precio Unitario: " + precio4 + "\n Valor total antes de descuentos: "
                        + valorTot4 + "\n Descuento Aplicado: " + valor + "\n Valor Total despues del descuento: " + valorFinal4 + "\n Producto alimenticio. Revisar fecha de caducidad.");
            case 3 ->
                System.out.println(" Producto: " + nom4 + "\n Precio Unitario: " + precio4 + "\n Valor total antes de descuentos: "
                        + valorTot4 + "\n Descuento Aplicado: " + valor + "\n Valor Total despues del descuento: " + valorFinal4 + "\n Producto de ropa. Revisar tallas disponibles.");
        }
        System.out.println("\n-------------");
        lector.nextLine();

        //Entrada de Datos del producto 5
        System.out.println("Ingrese el nombre del producto #5:");
        nom5 = lector.nextLine();
        System.out.println("Ingrese la cantidad en inventario del producto #5:");
        cant5 = lector.nextInt();
        lector.nextLine();
        System.out.println("Ingrese el precio unitario del producto #5:");
        precio5 = lector.nextDouble();
        lector.nextLine();
        System.out.println("Ingrese la categoria del producto #5 (1: Electronicos, 2: Alimentos, 3: Ropa):");
        cat5 = lector.nextInt();
        lector.nextLine();

        //Cálculo del Valor Total del Inventario
        valorTot5 = cant5 * precio5;

        // Aplicación del descuento
        if (cant5 > 100) {
            desc5 = 0.20;
        } else if (cant5 > 50) {
            desc5 = 0.10;
        } else {
            desc5 = 0;
        }

        if (desc5 == 0.20) {
            valor = "20% (Cantidad mayor a 100)";
        } else if (desc5 == 0.10) {
            valor = "10% (Cantidad mayor a 50)";
        }else {
            valor = "No hay descuento (Cantidad menor o igual a 50)";
        }
        
        // Calcular valor final después del descuento
        valorFinal5 = valorTot5 - (valorTot5 * desc5);

        // Mostrar mensaje adicional basado en la categoría del producto 5
        switch (cat5) {
            case 1 ->
                System.out.println(" Producto: " + nom5 + "\n Precio Unitario: " + precio5 + "\n Valor total antes de descuentos: "
                        + valorTot5 + "\n Descuento Aplicado: " + valor + "\n Valor Total despues del descuento: " + valorFinal5 + "\n Producto electronico. Revisar garantia.");
            case 2 ->
                System.out.println(" Producto: " + nom5 + "\n Precio Unitario: " + precio5 + "\n Valor total antes de descuentos: "
                        + valorTot5 + "\n Descuento Aplicado: " + valor + "\n Valor Total despues del descuento: " + valorFinal5 + "\n Producto alimenticio. Revisar fecha de caducidad.");
            case 3 ->
                System.out.println(" Producto: " + nom5 + "\n Precio Unitario: " + precio5 + "\n Valor total antes de descuentos: "
                        + valorTot5 + "\n Descuento Aplicado: " + valor + "\n Valor Total despues del descuento: " + valorFinal5 + "\n Producto de ropa. Revisar tallas disponibles.");
        }
        System.out.println("\n-------------");
        lector.nextLine();
        
        // Calcular el precio total de los productos
        totalinvent = valorFinal1 + valorFinal2 + valorFinal3 + valorFinal4 + valorFinal5;
        
        // Mostrar menu en texto multilinea 
        String mensaje = """
                  ************************************************************
                  Resumen del inventario
                  1.%S - Valor total despues de descuentos: %.1f
                  2.%S - Valor total despues de descuentos: %.1f
                  3.%S - Valor total despues de descuentos: %.1f
                  4.%S - Valor total despues de descuentos: %.1f
                  5.%S - Valor total despues de descuentos: %.1f
                  
                  El valor total del inventario es: %.1f soles
                  *************************************************************
                  """;
        
        System.out.printf(mensaje, nom1, valorFinal1, nom2, valorFinal2, nom3, valorFinal3, nom4, valorFinal4, nom5, valorFinal5, totalinvent);
        
        //Evaluacion del valor total del producto
        if (totalinvent > 500) {
            System.out.println("Atencion: Se recomienda reducir el inventario ya que el valor total supera los 500 soles.");
        }
    }
}