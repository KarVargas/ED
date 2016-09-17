/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDLosBeatersP1;

import java.util.Arrays;

/**
 * 
 * @author Los beaters
 * "Una vez programador, siempre programador"
 * Mariana Villegas
 * Josue Ramirez
 * Carlos Vargas 
 * Yesus Becerril 
 * Irving Rocha
 */
public class Binaria extends Busquedas implements MOrdenamiento {

   @Override //Sirve para sobreescribir
    public int Busqueda(int[] vector, int n) {
   int ini, fin, centro, valorCentro; //Declaramos variables.
        ini = 0;
        fin = vector.length; //Fin tendrá la ultima posicion del arreglo.
        while (ini <= fin) { //Iniciamos un ciclo en el que nuestra condicion es que mientras la posicion inicia es menor a la final haremos lo siguiente:
            centro = ((ini + fin) / 2); //Para sacara la posicion central sumaremos la inicial con la final y la dividiremos entre 2 
            valorCentro = vector[centro]; //En esta variable quedara guardada la posicion de centro previamente obtenida
            if (valorCentro == n) { //Si valorCentro es igual al número que queremos encontrar imprimiremos lo siguiente:
                 return centro; //Regresamos la posicion en la que se encuentra el valor buscado
            } else //Si no se cumple lo del if pasaremos a lo siguiente
            if (n < valorCentro) {/*si el número que buscamos es menor que la posicion del centro sacado, la variable fin va a ser
                igual al valor de centro menos 1*/
                fin = centro - 1;
            } else { //Si no es menor, la variable ini va a ser igual a la posicion del centro + 1;
                ini = centro + 1;
            } //Fin del else //Fin del primer else
            //El ciclo vuelve a comenzar
        }

        return -1; //regresamos -1 si no se encontro       
    }
    
    @Override //Sirve para sobreescribir
    public void MSeleccion(int vector[]) { //Método de ordenamiento por selección
        int i, j, menor, posición, aux; //Declaramos variables a utilizar
        for (i = 0; i < vector.length - 1; i++) { // inicio del ciclo for 
            menor = vector[i]; // le damos el valor de la posicion 0 a la varibale menor
            posición = i; // guardamos su posición
            for (j = i + 1; j < vector.length; j++) { // Inciamos otro for dentro del anterior
                if (vector[j] < menor) { // del array algún elemento
                    menor = vector[j]; // menor que el actual
                    posición = j;
                }
            }
            if (posición != i) { // si hay alguno menor se intercambia
                aux = vector[i];
                vector[i] = vector[posición];
                vector[posición] = aux;
            }
        }
    }

    @Override //Sirve para sobreescribir
    public void MBurbuja(int vector[]) { //Método de ordenamiento Burbuja
        int i, j, aux;//Declaración de variables
        for (i = 0; i < vector.length - 1; i++)//Inicia el primer ciclo for para recorrer el vector
        {
            for (j = 0; j < vector.length - i - 1; j++)//Se inicia el segundo ciclo para ordenar el vector
            {
                if (vector[j + 1] < vector[j]) {//Condición que establece que si el valor de la posicion j+1 es mayor que la posicion j pasara lo siguiente:
                    aux = vector[j + 1];//en la variable aux guardaremos el valor de j+1
                    vector[j + 1] = vector[j]; // en j+1  guardamos el valor de j
                    vector[j] = aux;//y en j guardamos el valor previamente guardado en la variable aux
                }
            }
        }
    }

    @Override //Sirve para sobreescribir
    public int[] MMSort(int vector[]) { //Este método tiene un parametro, recibira un arreglo,
        int i, j, k; //Se declaran las variables que se usaran en el método.
        if (vector.length > 1){ //Revisamos si el arreglo tiene mas de un elemento.
            int nElementosI = vector.length/2; //Dividimos el arreglo a la mitad y guardamos la cantidad de lementos del arreglo izq en una variable.
            int nElementosD = vector.length-nElementosI; //Guardamos la otra cantidad de elementos del arreglo la guardamos en otra variable.
            int arrI[] = new int[nElementosI]; //Creamos el arreglo de la derecha y la izquierda con el número de elementos que corresponde a cada uno.
            int arrD[] = new int[nElementosD];
            
            for (i = 0; i < nElementosI; i++) { //Desde 0 hasta la cantidad de elementos para el arreglo Izquierdo, copia elemento por elemento.
                arrI[i] = vector[i];
            }
            
            for (i = nElementosI;i < vector.length;i++){ //Desde el número de elementos de izq, hasta el tamaño total del arreglo original, copiamos elemento por elemento.
                arrD[i - nElementosI]=vector[i];
            }
            
            //Aquí llamamos a la recursividad.
            arrI = MMSort(arrI);
            arrD = MMSort(arrD);
            
            i = 0; j = 0; k = 0; //Se igualan las variables i, j y k a 0.
            
            while(arrI.length != j && arrD.length != k){//Mientras cualquier arreglo, izq o der, no sea de un solo elemento.
                if(arrI[j] < arrD[k]){ //Se va recorriendo el arreglo haciendo una comparación si el tamaño del arreglo de la izquierda es menor que el de la derecha.
                    vector[i] = arrI[j]; //Se guarda el valor del arreglo de la Izquierda en el arreglo i.
                    i++; //Se suma i + 1.
                    j++; //Se suma i + 1.
                    System.out.println("Arreglo Izquierdo " + Arrays.toString(arrI));
                    System.out.println("Arreglo Derecho " + Arrays.toString(arrD));
                    System.out.println("Arreglo Final " + Arrays.toString(vector) + "\n");
                }else{
                    vector[i] = arrD[k]; //Se guarda el valor del arreglo de la Derecha en el arreglo i.
                    i++; //Se suma i + 1.
                    k++; //Se suma k + 1.
                    System.out.println("Arreglo Izquierdo " + Arrays.toString(arrI));
                    System.out.println("Arreglo Derecho " + Arrays.toString(arrD));
                    System.out.println("Arreglo Final " + Arrays.toString(vector) + "\n");
                }
            }
            //Arreglo Final
            while (arrI.length != j){
                vector[i] = arrI[j];
                i++; //Se suma i + 1.
                j++; //Se suma k + 1.
                System.out.println(Arrays.toString(vector)); //Se despliega el vector
            }
            while (arrD.length != k){
                vector[i] = arrD[k];
                i++; //Se suma i + 1.
                k++; //Se suma k + 1.
                System.out.println(Arrays.toString(vector)); //Se despliega el vector.
            } 
        }
        return (vector);//Se regresa el vector ya ordenado
    }

    @Override //Sirve para sobreescribir
    public void MQSort(int vector[], int inicio, int fin) { //Método QuickSort que contiene 3 parametros, el vector, inicio y fin.
        int i = inicio; //Se inicializan las variables que se usaran.
        int j = fin; 
        int pivote, t;
        pivote = vector[(inicio + fin) / 2]; //Se usa un apuntador pivote que toma la posición del inicio mas el fin entre 2, la posición de en medio.
        do{
            while(vector[i] < pivote){ //Se verifica si el valor en la posición i es menor al pivote.
                i++; //De ser así, la posición i se mueve a la derecha en 1.
            } while(vector[j] > pivote){ //Se verifica si el valor en la posición j es menor al pivote.
                j--; //De ser así, la posición i se mueve a la izquierda en 1.
            } if(i <= j){ //Se realiza una comparación entre el número en la posición i y en la posición j.
                //verificando si i es menor o igual a j
                t = vector[i]; //Se usa una variable auxiliar para guardar el número en la posición i.
                vector[i] = vector[j]; //Se guarda el número de la posición j en i.
                vector[j] = t; //El número que se guardo en la variable auxiliar se añade a la posición j.
                i++; //Se mueve i en una posición a la derecha.
                j--; //Se mueve j en una posición a la izquierda.
            }
        }while(i <= j); //Se realiza todo el ciclo mientras i sea menor a j.
        if(inicio < j){
            MQSort(vector,inicio,j);
        }
        if(i < fin){
            MQSort(vector,i,fin);
        }
    }
   
}
