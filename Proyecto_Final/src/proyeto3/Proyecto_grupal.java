/*

Enunciado de proyecto.
Se solicita un sistema computacional, el cual permita llevar un control de los
gastos, realizadas a domicilios ABC1, las cuales comprenden: jardinería, 
mantención y seguridad, por cada casa habitación de un condominio, este sistema
llevará el control por 3 meses y entregará el total de los gastos, la persona 
que tendrá el control de este sistema (administrador), será quien ingresará 
los datos.

Integrantes:

Juan Chávez
Luis Alarcón
Mauricio Campos
Pablo Mella


* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyeto3;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Proyeto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);
    
    double suma_jardin = 0;        //Iniciamos los acumuladores a usar
    double suma_mantencion = 0;
    double suma_seguridad = 0;
    
    double jardin;               //Generando variables
    double mantencion;
    double seguridad;
    char letra;
    String nombre;
    
    int opcion = 0;
    
                                      // Inicializamos los contadores a utilizar
    int contador_jardin = 1;
    int contador_seguridad = 1;
    int contador_default = 0;
                        
    do{                     //Generamos un Do-While para mantener el menú
    
    System.out.println();
    System.out.println("Quiere Generar gastos Comunes (3 Meses)"); //Acá ingresamos si el usuario quiere usar el programa
                                                                   //  O sea "S" SI o "N" NO             
    System.out.print("Ingrese si (S) o no (N): ");
    letra = sc.next().charAt(0);
      
    if(letra == 'S'){
    
    System.out.println();
    sc.nextLine();                             //Se nos hizo difícil averiguar por que no funcionaba el sc.NextLine()
                                               //y buscando en internet, era porque teníamos que limpiar el Buffer
                                               // y lo limpiamos agregando sc.nextLine(); 
    
    System.out.print("Ingrese el nombre del Residente: ");  //Ingresamos el nombre del Residente
    nombre = sc.nextLine();         
    System.out.println();
    
    
    

    System.out.println("Elija suma de 3 meses de gastos comunes: "); // Menú de opciones de la estructura CASE
    System.out.println("1 = Jardin 3 meses ");
    System.out.println("2 = Mantencion 3 meses ");
    System.out.println("3 = Seguridad 3 meses ");
    System.out.println("4 = Resetear");
    
    
    opcion = sc.nextInt();
    
        switch (opcion){      //Inicia la estructura CASE
        
        case 1 : do {          // Usamos una Estrucutura Do-While para la primera opción
                
                System.out.print("Costo de Jardín mes "+contador_jardin+" :");   
                jardin = sc.nextDouble();
                
                suma_jardin = suma_jardin + jardin;
                
                contador_jardin = contador_jardin + 1;
                contador_default = 0;                      
                } while (contador_jardin < 4);
                              
        
        
        case 2 : for(int n = 1; n < 4; n++ ){     // Usamos una Estrucutra For para la Segunda opción
                
                System.out.print("Costo de Mantención mes "+n +" :");    
                mantencion = sc.nextDouble();
                
                suma_mantencion = suma_mantencion + mantencion;
                contador_default = 0;                 
                }
        
            
                
        case 3 : while(contador_seguridad < 4){     // Usamos una Estrucutura While para la 3era opción
                 
                 System.out.print("Costos de Seguridad mes: "+contador_seguridad+" :");    
                 seguridad = sc.nextDouble();
                  
                 suma_seguridad = suma_seguridad + seguridad;
                 
                 contador_seguridad = contador_seguridad + 1;    
                 contador_default = 0;        
        }
        break;
       
          
        case 4 :{                                   // La 4ta opción del CASE es para resetear los valores
            suma_jardin = 0;                       // Acumuladores y Contadores
            suma_mantencion = 0;
            suma_seguridad = 0;
            
            contador_jardin = 1;
            contador_seguridad = 1;
            contador_default = 0;
            nombre = "No Name";
            
        break;
        }
        default : {
            System.out.println();                     // Dejamos lo que pasaría si escribimos
            System.out.println("Digito no Valido");   // Mal una opción de la estrucutura CASE
            contador_default = 1;
        break;
        }
        }
        
        if (contador_default == 0 ){ 
        System.out.println();                 //  Generamos los datos de salida a modo de informe
        System.out.println("La Boletea semestral es: ");
        System.out.println();
        System.out.println("Sr. Recidente: "+nombre);
        System.out.println("Costos Jardin: "+suma_jardin);
        System.out.println("Costos Mantencion: "+suma_mantencion); 
        System.out.println("Costos Seguridad: "+suma_seguridad);
        System.out.println();
        
        contador_default = 0; 
        suma_jardin = 0;                       // Reseteamos acumuladores y contadores para
        suma_mantencion = 0;                   // reutilizar el programa
        suma_seguridad = 0;
            
        contador_jardin = 1;
        contador_seguridad = 1;
       
                
        nombre = "No Name";
        }
    
    }
    if (letra == 'N'){     //Condición que pasa si el usurio eligió "NO"
        System.out.println();
        System.out.println("Gracias por Operar con Nosotros");
        System.out.println();
    }
    
    if(letra != 'N' && letra !='S'){  //Condición ¿que pasa si no elegió "No" (N) o "Si" (S)?
        System.out.println();
        System.out.println("Digito no Valido");
        System.out.println();
    }
        
    
  
    } while (letra != 'S' || letra != 'N'); //Estructura de Do-While mientras se cumpla la condición
    }
    }       
    

    
