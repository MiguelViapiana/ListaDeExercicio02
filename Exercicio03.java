public class Exercicio03 {
    public static void executar(){
        System.out.println("Digite quantos números vc quer escrever: ");
        int i = Prompt.lerInteiro();

        System.out.println("Digite os números desejados(positvos ou negativos)");
        double[] num = new double[i];
        double[] numDobro = new double[i];
        for(i =0; i < num.length; i++){
            System.out.printf("%d° número: ", i+1);
            num[i] = Prompt.lerDecimal();
            numDobro[i] = num[i] * 2;
        }
        for(i = 0; i < num.length; i++){
            System.out.printf("\nO dobro do número %.1f é %.1f", num[i], numDobro[i]);
        }
    }
}
