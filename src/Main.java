import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int opcion = 0;
        int opcionVendedor = 0;
        Scanner entrada = new Scanner(System.in);
        //falta array de vendedors


/* DEJO ESTE CODIGO INCOMPLETO, YA QUE ES UNA FORMA MAS COMPLETA DE HACER EL PROGRAMA

        do {
            System.out.println("Hola, bienvenido a la aplicacion de la compra de mercaderias." +
                    "\nIntroduzca la opcion deseada: " +
                    "\n1. Crear vendedor" +
                    "\n2. Añadir un item al inventario de un vendedor" +
                    "\n3. Consultar los items de un vendedor" +
                    "\n4. Consultar los items de un vendedor" +
                    "\n5. Realizar la venta de un item" +
                    "\n6. Salir");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Que tipo de vendedor desea crear:" +
                            "\n1. Campesino" +
                            "\n2. Ladron" +
                            "\n3. Mercader.");
                    opcionVendedor = entrada.nextInt();
                    if (opcionVendedor == 1) {
                        //crear Vendedor Campesino
                    } else if (opcionVendedor == 2) {
                        //crear Vendedor Ladron
                    } else if (opcionVendedor == 3) {
                        //crear Mercader
                    } else {
                        System.out.println("Opcion incorrecta");
                    }
                    break;
                case 2:
                    System.out.println("A que vendedor desea añadir el item: ");

            }


        } while (opcion != 6);*/


        // 1. Crear un vendedor
        Campesino vendedor1 = new Campesino("Barcelona");

        // 2. Añadir un item al inventario
        Item item = new Item("Espada laser", "Espada", 220.5);
        vendedor1.agregarItem(item);

        // 3. Consultar los items del vendedor
        vendedor1.mostrarInventario();

        // 4. Realizar la venta de un item
        Item itemVendido = vendedor1.venderItem(item);
        System.out.println("Item vendido: " + itemVendido.toString());

    }

}
