package Questao4;

public class Quadrado{ 
    private int lado;
    private static int erros = 0;
    
    public void setLado(int medidaDoLado){ 
        if (medidaDoLado > 0)
            lado = medidaDoLado;
        else
            erros++;
    } 
    public void exibeDados(){ 
        System.out.println("Lado: " + lado); 
    } 
    public static void msg(){
        System.out.println("Um quadrilátero");
    }
    public static void msg2(){
        System.out.println("Tentativas inválidas: "+erros);
    }
} 
