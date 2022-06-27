/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.IntStream;
/**
 *
 * @author JENG-PC
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Los ArrayList es una clase que permite adicionar, eliminar, consultar y modificar datos en un solo tipo de dato dinamico (sin tamaño como los arreglos Arrays)
        // la forma de la declaración de un ArrayList es la siguiente
        ArrayList<String> mitexto; //declaracion sin datos del ArrayList denominada mitexto de tipo String
        ArrayList<Integer> misenteros; //Declaracion sin datos del ArrayList denominada misenteros de tipo Entero
        ArrayList<Float> misflotantes; //Declaracion sin datos del ArrayList denominado misflotantes de tipo Float
        ArrayList<Boolean> miBooleanos; //Declaracion sin datos del ArrayList denominado miBooleanos de tipo Booleano
        
        //Esta es la declaracion de un arreglo de nombre [nombres] y se le ha asignado el valor de "Jhon" como primer valor
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Jhon");
        System.out.println("contenido del ArraList nombres: " + nombres);//impresion del contenido del ArrayList
        
     //Ejemplo 1
     /*Este algoritmo define tres objetos de nombre elmejor, el peor y nunez, donde se crean de acuerdo a un modelo 
     presentado en la clase Estudiante.java, aqui cada uno de estos objetos son adicionados
     a un ArrayList de tipo Estudiante(la clase Estudiante,java) mediante el metodo add.
     
     En la linea 44 se establece la adicion in el indice 
     En la linea 45 se establece la adicion con el inidice 1
     En la linea 46 se adiciona el objeto nunez sin indice*/
        Estudiante elmejor = new Estudiante(123456789,"Juan","Perez",5);        
        Estudiante elpeor = new Estudiante(123789456,"Dario","Perez",1);
        Estudiante nunez = new Estudiante(14235689,"Juan","Nunez",4);
        ArrayList<Estudiante> ListaEstudiante = new ArrayList<>();
        ListaEstudiante.add(elmejor); //adiciona el objeto denominado "elmejor" de la Clase Estudiante;
        ListaEstudiante.add(1,elpeor);//Adiciona el objeto denominado "elpeor" de la clase estudiante el la posicion 2 del ArrayList
        ListaEstudiante.add(nunez);
      //En esta apartado se obtienen el tamaño del ArrayList denominado ListaEstudiante
        int tam = ListaEstudiante.size();//Obtiene el tamaño del ArrayList;
      //Se imprime el tamaño del ArrayList ListaEstudiante  
        System.err.println("tamaño de ArrayList es: " + tam);  
       //Se obtiene del ArrayList ListaEstudiante el nombre del objeto que esta en el indice 1 del Array
        System.out.println("El resultado de la posicion 1 es: "+ListaEstudiante.get(1).getNombre());
       //Fin ejemplo 1 
      
     //Ejemplo 2   
    //Ejemplo del uso de adicion de elementos de un ArrayList asi:
    /*El algoritmo define un array list de nombre Lista al cual solo ingresan numeros enteros positivos y pares, para ello 
    El algoritmo presenta la opcion de adicionar los numeros sean pares o no, mas sin embargo si el define que si se adicionó
    algun numero impar lo retira, adicional a esto presenta un menu el cual permite parar o continuar la insercion infinita de estos
    numeros
    */
        ArrayList<Integer> Lista = new ArrayList<>();
        Scanner leer = new Scanner(System.in);
        int opc=0;
        int cont=0;
        do{
                System.out.print("digite el numero entero positivo enla posicion:  " + cont+ " : ");
                Lista.add(leer.nextInt()); 
            if(Lista.get(cont)%2 ==0){
                System.out.println("El numero es par");
                System.out.println("Hasta el momento se ha adicionado los sigueintes valores:  " + Lista);
            }else{
                System.out.println("El numero es impar");                
                Lista.remove(cont);
                cont--;              
                System.out.println("Hasta el momento se ha adicionado los sigueintes valores:  " + Lista);                    
            }        
                cont++;
                System.out.println("Desea continuar adicionando valores 1.SI/Otro numero.No");
                opc = leer.nextInt();        
       }while(opc == 1);
       System.out.println("El arrayLista contiene los sigueintes valores" + Lista); 
        
     //Fin del ejemplo 2 
     
     //Inicio Ejemplo 3
     
     
     ArrayList<Dispositivo> dispo = new ArrayList<>();
        int contador = 0;
        String opcion;
        Scanner captura = new Scanner(System.in);
        //Random id_aleatorio = new Random();
       do{
           
          // int id_dis = Integer.valueOf(String.valueOf(id_aleatorio.nextInt())+String.valueOf(contador));
           int id_dis = contador;
           System.out.print("Digite el nombre del dispositivo");
           String nom_dis = captura.next();
           System.out.println("Digite el tipo de dispositivo");
           String tipo_dis = captura.next();
           System.out.println("Digite el estado del dispositivo");
           String est_dis = captura.next();        
           
           Dispositivo nuevodis = new Dispositivo();
           nuevodis.setId_dis(id_dis);
           nuevodis.setNom_dis(nom_dis);
           nuevodis.setTipo_dis(tipo_dis);
           nuevodis.setEst_dis(est_dis);
           
           dispo.add(contador, nuevodis);
           System.out.println("El ArrayList de nombre dispo contiene los siguientes valores: " + "Estado: "+ dispo.get(contador).getEst_dis() + " Nombre: " + dispo.get(contador).getNom_dis() + " Tipo: " + dispo.get(contador).getTipo_dis());
           contador++;
           System.out.println("Si desea adicionar mas dispositivos seleccione digite 's' de lo contrario oprima cualquier tecla");
           opcion = captura.next();           
           
       }while(opcion.equals("s"));
        dispo.forEach((e) -> {//Recorrido mediante un foreach para dispo(ArrayList) de manera que muestre el nombre de todos los objetos del arrayList  
           
                System.out.println("Elemento"+ e + " " + e.getNom_dis());
           });
         
    }
   
    
}
