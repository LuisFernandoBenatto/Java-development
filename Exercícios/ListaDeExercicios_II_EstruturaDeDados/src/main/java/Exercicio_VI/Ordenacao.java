package Exercicio_VI;

public class Ordenacao {
   No[] vetObj;
   
   public Ordenacao(No[] vetObj) {
       this.vetObj = vetObj;
   }
   
   private No[] swap(No[] vetObj, int index, int index_2) {
       No temp = vetObj[index];
       vetObj[index] = vetObj[index_2];
       vetObj[index_2] = temp;
       return vetObj;
   }
   public No[] bubbleSort() {
       System.out.println("Bubble Sort");
       int tamanho = this.vetObj.length;
       for (int j = (tamanho-1); j > 0; j--) {
           for (int i = 0; i < j; i++) {
               if(this.vetObj[i].getChave()>this.vetObj[i+1].getChave()){
                   this.vetObj = swap(this.vetObj, i, (i+1));
               }
           }
       }
       return this.vetObj;
   }
   public No[] insertionSort() { 
       System.out.println("Insertion Sort");
       for (int j = 1; j < this.vetObj.length; j++) {
           for (int i = j; i > 0; i--) {
               if(this.vetObj[i].getChave() < this.vetObj[i-1].getChave()) {
                   this.vetObj = swap(this.vetObj, i, (i-1));
                } else {
                   break;
                }
            }
        }
       return this.vetObj;
    }
   public No[] selectionSort() {
       System.out.println("Selection Sort");
       for (int j = 0; j < this.vetObj.length; j++) {
           for (int i = j; i < this.vetObj.length; i++) {
               if(this.vetObj[i].getChave() < this.vetObj[j].getChave()) {
                   int valor;
                   int temp = this.vetObj[j].getChave();
                   this.vetObj[j].setChave(this.vetObj[i].getChave());
                   this.vetObj[i].setChave(temp);
                }
            }
        }
       return this.vetObj;
    }
}
