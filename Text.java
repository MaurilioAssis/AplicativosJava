
package popcapitalize;

public class Text {
   private final String frase;

   
    public Text(String frase) {
        this.frase = frase.trim();
    }

    public String getFrase() {
        return frase;
    }
   
    /**
     * @return
     */
    public String pop() {
        String frasefinal = "";
        for ( int i=0; (i < this.getFrase().lastIndexOf(' ')); i++ ) {
            frasefinal += this.getFrase().charAt(i);
        }
        return frasefinal;
    }
    
    /**
     * @return
     */
    public String capitalize(){
       
            String frasefinal = "";
            String fraseComSplit[] = this.getFrase().split(" ");
            
             for (int i = 0; i < fraseComSplit.length; i++ ) {
               
               if (fraseComSplit[i].length() != 1) {
                    char[] ac = fraseComSplit[i].toCharArray();
                    ac[0] = Character.toUpperCase(ac[0]);
                    frasefinal += (new String(ac)+" ");
                } else {
                    frasefinal += (fraseComSplit[i]+" ");
               }
                 
            }       
                return (frasefinal.trim());       
             
        }
}
