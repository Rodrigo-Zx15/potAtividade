/*

Implemente os algoritmos Bubblesort, Insertionsort, Selectionsort e Mergesort utilizando 
as estruturas lista ligada dinâmica ou lista duplamente ligada  dinâmica (verificar quando necessário implementar uma ou outra) vistas durante a disciplina de estrutura de dados.

Você deverá comparar os algoritmos implementados utilizando lista com os algoritmos implementados em aula 
utilizando vetores, para isso deverão ser gerados 10 vetores e listas de inteiros aleatórios (entre 0 e 1000), cada um dos seguintes tamanhos: 100, 1000 10000, 100000. 
Cada lista deve conter os mesmos valores que os vetores.

Em seguida, ordenar todos os vetores e listas através de cada um dos métodos de ordenação propostos e contar o tempo de processamento em cada ordenação realizada

A comparação deve utilizar como referência o tempo em nanosegundos.
*/

/**
 *
 * @author Zx
 */

import sortingMethods.method;
import java.util.Random;
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] tamanhos = {100,1000,10000,100000};
        int [] teste = {4,2,1,5,9};
        Random random = new Random();
        method.selectionSort(teste);
        for(int i = 0;i<teste.length;i++){
            System.out.println(teste[i]);   
        }
        
        //loopa entre a array tamanhos
        /*for(int i = 0; i < tamanhos.length;i++){;;
            long execTime, execTimeLista;
            //cria 10 arrays baseadas no valor encontrado em tamanhos[i]
            for(int j = 0;j<10;j++){
                System.out.println("Vetor(" + tamanhos[i] +") Nº"+j+1);
                int[] array = new int[tamanhos[i]];
                int aleatorio;
                //popula a array com numeros aleatorios
                for(int r = 0;r<array.length;r++){
                    aleatorio = random.nextInt(1000);
                    array[r] = aleatorio;
                }
                //pega o tempo de execucao dos metodos.
                //eu nao faço ideia de como automatizar isso, namoral mesmo 
                long start = System.nanoTime();
                method.insertionSort(array);
                long end = System.nanoTime();
                execTime = end - start;
                System.out.println("Método InsertionSort: Execution time(array): " + execTime + "ns"+ 
                        "\nExecution Time(lista): "+execTimeLista+"ns");
                //prox metodo
                
                start = System.nanoTime();
                method.bubbleSort(array);
                end = System.nanoTime();
                execTime = end - start;
                //...
                System.out.println("Método bubbleSort: Execution time(array): " + execTime + "ns"+ 
                        "\nExecution Time(lista): "+execTimeLista+"ns");
                //prox metodo
                
                
                start = System.nanoTime();
                method.selectionSort(array);
                end = System.nanoTime();
                execTime = end - start;
                //...
                System.out.println("Método selectionSort: Execution time(array): " + execTime + "ns"+ 
                        "\nExecution Time(lista): "+execTimeLista+"ns");
                //prox metodo
                
                
                start = System.nanoTime();
                method.mergeSort(array,0,array.length-1);
                end = System.nanoTime();
                execTime = end - start;
                System.out.println("Método mergeSort: Execution time(array): " + execTime + "ns"+ 
                        "\nExecution Time(lista): "+execTimeLista+"ns");
                
                //System.out.println("Execution time: " + execTime +"ns");
            }
        }*/

        //calcula a media de tempo de execucao do metodo xxxxSort
        //media = soma/10;
        //System.out.println("Avg processing time: " + media);
        
        
        //method.mergeSort(test,0,test.length-1);//funfa
        //method.bubbleSort(test);//funfa
        //insertionSort(test);// funfa
        //method.selectionSort(test);//tbm funfa mlk 
        /*for(int i = 0;i<test.length;i++){
            System.out.println("test["+i+"]:"+test[i]);
        }*/
        
    }

    

}
