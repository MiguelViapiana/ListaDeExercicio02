public class Exercicio01 {
    public static void executar(){
        System.out.println("Digite 5 números quaisquer:");
        double[] num = new double[5];
        double SomaNum =0;
        for(int i = 0; i < 5; i++){
            System.out.printf("%d° número: ", i+1);
            num[i]= Prompt.lerDecimal();
            SomaNum += num[i];
        }
        double media = SomaNum/5;
        System.out.println("Valor da média: "+ media);
        for(int i=0; i < 5; i ++){
            if (num[i] < media) {
                System.out.printf("\nO valor %.1f é MENOR que a média.", num[i]);
            }
            if (num[i] > media) {
                System.out.printf("\nO valor %.1f é MAIOR que a média.", num[i]);
            }
        }
    }
}
