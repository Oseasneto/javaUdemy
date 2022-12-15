public class ProvaCWI {

    public static void main(String[] args) {
            double s = 1095.30;
            double contribuicaoINSSMensal = 0;
                if (s <= 1045){
                    contribuicaoINSSMensal = s*(7.5/100);
                } else if (s >1045 && s <= 2089.60) {
                    contribuicaoINSSMensal = s * (9 / 100);
                } else if ( s> 2089.60 && s <= 3134.40){
                    contribuicaoINSSMensal = s*(12/100);
                } else if (s> 3134.40 ) {
                    contribuicaoINSSMensal = s*(14/100);
                }

            double contribuicaoINSSAnual = contribuicaoINSSMensal*13.3;
                double quantidadePessoasNecessarias = s/contribuicaoINSSMensal;

        System.out.println(contribuicaoINSSMensal +"," +contribuicaoINSSAnual+ "," +quantidadePessoasNecessarias );
            }
        }


