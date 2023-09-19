public class ExemplosBasicos {
    public static void main(String[] args) {
        //indent (identação)
        //for, while e do/while
        //System.out.println(1);
        //System.out.println(2);
        //repetição controlada por contador
        //declarar o contador
        // int cont = 1;
        // while (cont <= 3) {//booleana
            // System.out.println(cont) ;
            // cont = cont + 1;
            for (int cont = 4;cont <= 3; cont = cont +1){
                System.out.println(cont);
            }
            int cont = 1;
            do{
                System.out.printf("valor da vez: %d\n", cont);
                cont += 1; //cont = cont + 1;
            }while (cont <=3);
        }
    }
