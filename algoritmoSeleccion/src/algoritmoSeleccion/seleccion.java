package algoritmoSeleccion;

public class seleccion {

    void sort(int array[]) 
    { 
        int numero = array.length; 
  
        for (int i = 0; i < numero-1; i++) 
        { 
            int minimo = i; 
            for (int j = i+1; j < numero; j++) 
                if (array[j] < array[minimo]) 
                    minimo = j; 
  
            int temporal = array[minimo]; 
            array[minimo] = array[i]; 
            array[i] = temporal; 
        } 
    } 
  
    void printArray(int array[]) 
    { 
        int numero = array.length; 
        for (int i=0; i<numero; ++i) 
            System.out.print(array[i]+" "); 
        System.out.println();
    } 
  
   
    public static void main(String args[]) 
    { 
    	seleccion srt = new seleccion(); 
        int array[] = {6,25,12,22,11,15,54,88,8,1,55,4,124,78,9}; 
        srt.sort(array); 
        System.out.println("Array ordenado"); 
        srt.printArray(array); 
    } 
}
