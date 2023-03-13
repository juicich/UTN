/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

import javax.swing.JOptionPane;
 
/**
 *
 * @author Javier
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
        /*Utilizando la sentencia while, imprima todos los números entre 2 variables “a”
            y “b”. Su código puede arrancar (por ejemplo):
            int numeroInicio = 5;
            int numeroFin = 14;
            // Se deberían mostrar los números:
            5,6,7,8,9,10,11,12,13,14
                                        */
        
        int numeroInicio;
        int numeroFin;
        String nn;
        
        
        
            nn=JOptionPane.showInputDialog("Ingrese numero de inicio");
                
            numeroInicio = Integer.parseInt(nn);
          
            nn=JOptionPane.showInputDialog("Ingrese numero de fin");
            
            numeroFin=Integer.parseInt(nn);
            
        while (numeroInicio <= numeroFin){
            System.out.println(numeroInicio);
            numeroInicio++;
        }
        
     //b        //. A lo anterior, solo muestre los números pares
     
            nn=JOptionPane.showInputDialog("Ingrese numero de inicio");
                
            numeroInicio = Integer.parseInt(nn);
          
            nn=JOptionPane.showInputDialog("Ingrese numero de fin");
            
            numeroFin=Integer.parseInt(nn);
     
        System.out.println("Ejercicio 1B");
        
        if ((numeroInicio%2) !=0){
            numeroInicio++;
        }
        while (numeroInicio <= numeroFin){
            System.out.println(numeroInicio);
            numeroInicio=numeroInicio+2;
        }
        
                /*c. A lo anterior, con una variable extra, elija si se deben mostrar los números
                pares o impares*/
        
        System.out.println("Ejercicio 1C");
        
            nn=JOptionPane.showInputDialog("Ingrese numero de inicio");
            numeroInicio = Integer.parseInt(nn);
            nn=JOptionPane.showInputDialog("Ingrese numero de fin");
            numeroFin=Integer.parseInt(nn);
        
            System.out.println("Indicar como mostrar: 0=Pares   1=Impares");        
       int  lista =Integer.parseInt(JOptionPane.showInputDialog( "Ingrese Par o Impar" ));
       
       if(lista==0){
            if ((numeroInicio%2) !=0){
                numeroInicio++;
            
                while (numeroInicio <= numeroFin){
                    System.out.println(numeroInicio);
                    numeroInicio=numeroInicio+2;
                    }
                }
            else {
                    
                while (numeroInicio <= numeroFin){
                System.out.println(numeroInicio);
                numeroInicio=numeroInicio+2;
                    }
                }
        }
            else {
                    if ((numeroInicio%2)!=0){
                        numeroInicio=numeroInicio;
            
                    while (numeroInicio <= numeroFin){
                        System.out.println(numeroInicio);
                        numeroInicio=numeroInicio+2;
                        }
                    }
                    else {
                    numeroInicio=numeroInicio+1;
                    while (numeroInicio <= numeroFin){
                    System.out.println(numeroInicio);
                    numeroInicio=numeroInicio+2;
                        }
                    }
                 }
                                                    */
            //d. Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden
           
            System.out.println("Ejercicio 1D");
        
            nn=JOptionPane.showInputDialog("Ingrese numero de inicio");
            numeroInicio = Integer.parseInt(nn);
            nn=JOptionPane.showInputDialog("Ingrese numero de fin");
            numeroFin=Integer.parseInt(nn);
            
            
            if ((numeroFin%2)!=0){
                numeroFin--;
            }
            for(int i=numeroFin; i>=numeroInicio; i=i-2){
                System.out.println(i);
            }

            
            /*d. Finalmente, vea si puede resolver el problema utilizando código Java. Por
            ejemplo si estuviésemos intentando resolver el ejemplo de monotributo
            tendríamos el código que se muestra más abajo, y cambiando las variables
            
            ●Ingresos mensuales totales del hogar equivalentes o superiores a $489.083
                (3,5 canastas básicas para un hogar tipo 2 según el INDEC).
            ● Tener 3 o más vehículos con una antigüedad menor a 5 años.
            ● Tener 3 o más inmuebles.
            ● Poseer una embarcación, una aeronave de lujo o ser titular de activos
                societarios que demuestren capacidad económica plena.”*/
            
            
                float ingresos = Float.parseFloat(JOptionPane.showInputDialog("Ingresos Brutos anuales"));
                int vehiculos = Integer.parseInt(JOptionPane.showInputDialog("Centidad de vehiculos que posee de menos de 5 años"));
                int inmuebles=Integer.parseInt(JOptionPane.showInputDialog("Cantidad de inmuebles que posee"));
                int embarcacion=Integer.parseInt(JOptionPane.showInputDialog("cantidad de embarcaciones , aeronaves o activos socientarios"));
                int superficie = Integer.parseInt(JOptionPane.showInputDialog("Superficie Afectada a la actividad"));
                int energia = Integer.parseInt(JOptionPane.showInputDialog("Energia Electrica consumida anualmente"));
                /*********************************************************************************************************************************/
                
                if ((ingresos>=489083) || (vehiculos>=3) || (inmuebles>=3) || (embarcacion >=1)){
                    System.out.println("Ud. pertenece al segmento de INGRESOS ALTOS");
                }
                if ( (ingresos <= 748382.07) &&
                ( superficie <= 30) &&
                (energia <= 3330) ) {
                System.out.println("Categoría A");
                } 
                else if((ingresos <= 1112459.83) &&
                (superficie <= 45) &&
                (energia <= 5000) ) {
                System.out.println("Categoría B");
                }
                else if((ingresos <=  1557443.7) &&
                (superficie <= 60) &&
                (energia <= 6700) ) {
                System.out.println("Categoría C");
                }
                else if((ingresos <= 1934273.04) &&
                (superficie <= 85) &&
                (energia <= 10000) ) {
                System.out.println("Categoría D");
                }
                else if((ingresos <=  2277684.56) &&
                (superficie <= 130) &&
                (energia <= 13000) ) {
                System.out.println("Categoría E");
                }
                else if((ingresos <= 2847105.7) &&
                (superficie <= 150) &&
                (energia <= 16500) ) {
                System.out.println("Categoría F");
                }
                else if((ingresos <=  3416526.83) &&
                (superficie <= 200) &&
                (energia <= 20000) ) {
                System.out.println("Categoría G");
                }
                else if((ingresos <= 4229985.6) &&
                (superficie <= 200) &&
                (energia <= 20000) ) {
                System.out.println("Categoría H");
                }
                else if((ingresos <=  4734330.03) &&
                (superficie <= 200) &&
                (energia <= 20000) ) {
                System.out.println("Categoría I");
                }
                else if((ingresos <= 6019584.89) &&
                (superficie <= 200) &&
                (energia <= 20000) ) {
                System.out.println("Categoría J");
                }
                else if((ingresos <= 2847105.7) &&
                (superficie <= 150) &&
                (energia <= 16500) ) {
                System.out.println("Categoría K");
                }
          }
            
       }
       
    
    
        
    

