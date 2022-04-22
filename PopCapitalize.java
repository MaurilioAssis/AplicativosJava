
package popcapitalize;


public class PopCapitalize {

   
    public static void main(String[] args) {
        Text t1 = new Text("Teste de classe que coloca a primeira letra de cada palavra em caixa alta e remove a ultima palavra");
        System.out.println("Teste de classe que coloca a primeira letra de cada palavra em caixa alta e remove a ultima palavra");
       
        System.out.println("Teste capitalize() --> " + t1.capitalize());
        System.out.println("Teste pop() --> " + t1.pop());
    }
    
}