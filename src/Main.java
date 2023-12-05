public class Main {
    public static void main(String[] args) throws Exception {
        int i;
        String [] cotxe = {"mercedes","BMW"};
        
        // crideu la vostra funció amb el vostre nom
        imp_NomAlumne("alumne principal");

        for(i=0; i < cotxe.length ; i++){
            System.out.println(cotxe[i]);
        }
    }

    /*
     * He de crear la vostra pròpia funció ex: imp_Pep(String alumne){...}
     * Entrada: un String amb el vostre nom
     * Sortida: impressió del vostre nom pel terminal
     */
    public static void imp_NomAlumne(String alumne){
        System.out.println("Els cotxes preferits de l'alumne " + alumne);
    }
}


