
package sortingMethods;
//import static java.lang.Math.floor;
public class method {
        //metodos de sortagem de arrays 
   public static void mergeSort(int[]array, int start, int end){
       
        if(start<end){
            int meio = (start+end)/2;
            mergeSort(array,start,meio);
            mergeSort(array,meio+1,end);
            Intercala(array,start,meio,end);
            
        }
        
    }

    static void Intercala(int[] vetor, int inicio, int meio, int fim) {
        int [] vAux = new int[vetor.length];
        int i, j;
        for (i = inicio; i <= meio; i++ ){
           vAux[i] = vetor[i];  
        }
        for (j = meio + 1; j <= fim; j++ ){
            vAux[fim+meio+1-j] = vetor[j];
        }
        i = inicio;
        j = fim;
        for (int k = inicio; k <= fim; k++ ){
            if (vAux[i] <= vAux[j]){
                vetor[k] = vAux[i];
                i++;
            }else{
                vetor[k] = vAux[j];
                j--;
            }
        }
    }
    public static void insertionSort(int [] array){
        int n = array.length;
        for(int i = 1;i<= n-1;i++){
            int j=i;
            while(j>0 && array[j-1] > array[j]){
                    int aux = array[j-1];
                    array[j-1] = array[j];
                    array[j] = aux;
                    j--;
            }
        }
    }
    public static void bubbleSort(int [] array){
        int n = array.length;
        do{
            int x = 0;
            for(int i = 1;i<=n-1;i++){
                if(array[i-1]>array[i]){
                    int aux = array[i-1];
                    array[i-1] = array[i];
                    array[i] = aux;
                    x = i;
                }
            }
            n = x;
        }while(n > 0);
    }
    public static void selectionSort(int array[]){
        int min, aux;
        for(int i = 0;i<array.length;i++){
            min = i;
            for(int j = i+1;j<array.length;j++){
                if(array[j] > array[min]){
                    min = j;
                }
            }
            aux = array[i];
            array[i] = array[min];
            array[min] = aux;
        }
    }
    static void heapSort(int[] array, int tamanho){
        criaHeap(array, tamanho);
        int fim = tamanho-1;
        while(fim>0){
            int aux = array[fim];
            array[fim] = array[0];
            array[0] = aux;
            fim--;
            arrumaHeap(array,0,fim);
        }
        
    }

    private static void criaHeap(int[] array, int tamanho) {
        int start = (tamanho-2)/2;//(int) floor((tamanho-2)/2);
        while(start>=0){
            arrumaHeap(array,start,tamanho-1);
            start--;
        }
    }

    private static void arrumaHeap(int[] array, int start, int fim) {
        int pai = start;
        while(start*2+1<=fim){
            int filho = pai*2+1;
            int swap = pai;
            if(array[swap]<array[filho]){
                swap = filho;
            }
            if(filho+1<=fim && array[swap]<array[filho+1]){
                swap = filho+1;
            }
            if(swap == pai){
                break;
            }else{
                int aux = array[pai];
                array[pai] = array[swap];
                array[swap] = aux;
            }
        }
    }
}
