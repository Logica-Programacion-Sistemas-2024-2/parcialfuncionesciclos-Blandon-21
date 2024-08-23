package parcial1g2;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        // Logica de solución
        Scanner sc = new Scanner(System.in);

        int cantidadVehiculos = 0;
        int modeloVehiculos = 0;
        int avaluoVehiculos = 0;
        int impuestosRodamiento = 0;
        int tasadeseguro = 0;
        int tasaderodamiento = 0;

        do{
            System.out.println("Cuantos vehiculos desea calcular: ");

            cantidadVehiculos = sc.nextInt();

            System.out.println("Ingrese la decada del modelo del vehiculo?\n----Modelo-----\n1)90  \n2)00 \n3)10  \n4)20 ");
            
            modeloVehiculos = sc.nextInt();

            System.out.println("Ingrese el avaluo del vehiculo");
            
            avaluoVehiculos = sc.nextInt();
        }
    

        


    }

    /*  Implemente una funcion llamada calcularTotalImpuestos que cumpla con las siguientes caracteristicas
        * Recibe: 
            - Una cadena de caracteres que representa la decada (70, 80, 90, 00, 10, 20, Otra)
            - Un entero que representa avaluo del vehiculo
        * Retorna:
            - Un entero representando el valor total a pagar de los impuestos
        * Controlar errores retornando -1
    */
    //------------------------------------------------------------------
    
public static int cantidadVehiculos (int impuestosRodamiento, int avaluoVehiculos){

    try{
        
        int impuestosRodamiento = 0;

            impuestosRodamiento = avaluoVehiculos * 4.09;

            return impuestosRodamiento;

        } catch (Exception e){
            return -1;
        }
    }
    switch (impuestosRodamiento) {
        case 1:

            impuestosRodamiento = avaluoVehiculos * tasaderodamiento;
            
            break
    }
}

    //------------------------------------------------------------------

}
