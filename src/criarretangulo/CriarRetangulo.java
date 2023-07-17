
package criarretangulo;


public class CriarRetangulo {

    
    public static void main(String[] args) {
       Retangulo a = new Retangulo (2.0,1.0,4.0,5.0);
        System.out.println("A base do retângulo é : " + a.base() ); //indicação da base
        System.out.println("A altura do retângulo é : " + a.altura() ); // indicação da altura 
        System.out.println("O perimetro do retângulo é : " + a.perimetro() ); //indicação do perimetro
        System.out.println("A área do retângulo é  : " + a.area() ); //indicação da área
    }    
}
