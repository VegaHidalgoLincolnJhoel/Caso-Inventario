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
        String nom1, nom2, nom3, nom4, nom5, Datos = "";  // Nombres de los productos
        int cant1, cant2, cant3, cant4, cant5;  // Cantidad en inventario
        double precio1, precio2, precio3, precio4, precio5;  // Precio unitario
        int cat1, cat2, cat3, cat4, cat5;  // Categoría de producto (1: Electrónica, 2: Alimentos, 3: Ropa)

        // Variables para almacenar el valor total y los descuentos
        double valorTot1, valorTot2, valorTot3, valorTot4, valorTot5;
        double desc1, desc2, desc3, desc4, desc5;

        // Cálculo final
        double valorFinal1, valorFinal2, valorFinal3, valorFinal4, valorFinal5;

        //Creacion del metodo Scanner
        Scanner lector = new Scanner(System.in);

        //Entrada de Datos del producto 1        
        System.out.println("Ingrese el nombre del producto #1:");
        nom1 = lector.nextLine();
        lector.nextLine();
        System.out.println("Ingrese la cantidad en inventario del producto #1:");
        cant1 = lector.nextInt();
        lector.nextLine();
        System.out.println("Ingrese el precio unitario del producto #1:");
        precio1 = lector.nextDouble();
        lector.nextLine();
        System.out.println("Ingrese la categoría del producto #1 (1: Electrónicos, 2: Alimentos, 3: Ropa):");
        cat1 = lector.nextInt();
        lector.nextLine();

        //Cálculo del Valor Total del Inventario
        valorTot1 = cant1 * precio1;

        //Entrada de Datos del producto 2        
        System.out.println("Ingrese el nombre del producto #2:");
        nom2 = lector.nextLine();
        lector.nextLine();
        System.out.println("Ingrese la cantidad en inventario del producto #2:");
        cant2 = lector.nextInt();
        lector.nextLine();
        System.out.println("Ingrese el precio unitario del producto #2:");
        precio2 = lector.nextDouble();
        lector.nextLine();
        System.out.println("Ingrese la categoría del producto #2 (1: Electrónicos, 2: Alimentos, 3: Ropa):");
        cat2 = lector.nextInt();
        lector.nextLine();

        //Cálculo del Valor Total del Inventario
        valorTot2 = cant2 * precio2;

        //Entrada de Datos del producto 3      
        System.out.println("Ingrese el nombre del producto #3:");
        nom3 = lector.nextLine();
        lector.nextLine();
        System.out.println("Ingrese la cantidad en inventario del producto #3:");
        cant3 = lector.nextInt();
        lector.nextLine();
        System.out.println("Ingrese el precio unitario del producto #3:");
        precio3 = lector.nextDouble();
        lector.nextLine();
        System.out.println("Ingrese la categoría del producto #3 (1: Electrónicos, 2: Alimentos, 3: Ropa):");
        cat3 = lector.nextInt();
        lector.nextLine();

        //Cálculo del Valor Total del Inventario
        valorTot3 = cant3 * precio3;

        //Entrada de Datos del producto 4
        System.out.println("Ingrese el nombre del producto #4:");
        nom4 = lector.nextLine();
        lector.nextLine();
        System.out.println("Ingrese la cantidad en inventario del producto #4:");
        cant4 = lector.nextInt();
        lector.nextLine();
        System.out.println("Ingrese el precio unitario del producto #4:");
        precio4 = lector.nextDouble();
        lector.nextLine();
        System.out.println("Ingrese la categoría del producto #4 (1: Electrónicos, 2: Alimentos, 3: Ropa):");
        cat4 = lector.nextInt();
        lector.nextLine();

        //Cálculo del Valor Total del Inventario
        valorTot4 = cant4 * precio4;

        //Entrada de Datos del producto 5
        System.out.println("Ingrese el nombre del producto #5:");
        nom5 = lector.nextLine();
        lector.nextLine();
        System.out.println("Ingrese la cantidad en inventario del producto #5:");
        cant5 = lector.nextInt();
        lector.nextLine();
        System.out.println("Ingrese el precio unitario del producto #5:");
        precio5 = lector.nextDouble();
        lector.nextLine();
        System.out.println("Ingrese la categoría del producto #5 (1: Electrónicos, 2: Alimentos, 3: Ropa):");
        cat5 = lector.nextInt();
        lector.nextLine();

        //Cálculo del Valor Total del Inventario
        valorTot5 = cant5 * precio5;

    }
}
