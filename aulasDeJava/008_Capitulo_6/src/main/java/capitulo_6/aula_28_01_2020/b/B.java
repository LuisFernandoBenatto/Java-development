package capitulo_6.aula_28_01_2020.b;

// Como importar uma classe em JAVA
import capitulo_6.aula_28_01_2020.a.*;

class B {
    public static void main(String[] args) {
        // Maneira de declararmos as classes importadas
        A objeto_A = new A();
        capitulo_6.aula_28_01_2020.a.A obj_A = new capitulo_6.aula_28_01_2020.a.A();
        
        objeto_A.i = 99;
        objeto_A.metodoA();
        
        //objeto_A.j = 180;
        objeto_A.metodoA_2();
        
        objeto_A.chamarMetodoPrivado();
    }
  
}
