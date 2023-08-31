public class Comentarios {
    public static void main(String[] args) {
        // Olá, eu sou um comentário em uma única linha.

        /* Olá,
         * Eu sou um comentário
         * que posso ser mais detalhado
         * quando necessário.
         */

         public void metodo(){
            /**
             * Estas 2 estrela acima 
             * é para identificar que você
             * pretende elaborar um comentário 
             * a nível de documentação.
             */
         }

         //TODA A SITUAÇÃO ABAIXO NÃO DEVE SER NUNCA UTILIZADA.

         /*
          * Este método foi elaborado as pressas
          por isso eu abreviei o nome das variaveis
          mas olha, ele tem a finalidade somar ou multiplicar.
          dois números.
          */
         public int somaMultiplica (int n, int x, String m){
            int r = 0; //r é igual ao resultado
            if (m == "M"){ //M = multiplicação
                r= n * x;
            }else{
                // se não soma mesmo
                r = n + x;
            }
            return r;
    }
}
