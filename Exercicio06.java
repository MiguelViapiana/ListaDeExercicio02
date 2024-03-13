public class Exercicio06 {
    public static void executar(){
        System.out.println("Digite 5 notas: ");
        double[] nota = new double[5];
        for(int i =0; i<5; i++){
            nota[i] = Prompt.lerDecimal();
        }

        System.out.println("Digite 5 pesos(Para a média ponderada)");
        int[] peso = new int[5];
        double notaSoma = 0;
        int pesoSoma=0;

        for(int i =0; i<5; i++){
            peso[i] = Prompt.lerInteiro();
        }

        for(int i=0; i <5; i++){
            notaSoma += (nota[i]*peso[i]);
            pesoSoma += peso[i];
        }
        System.out.printf("A média ponderada das notas é de: %.1f", notaSoma/pesoSoma);


    }
}
