public class Exercicio04 {
    public static void executar(){
        System.out.println("Digite 5 números: ");
        double[] num = new double[5];

        for(int i =0; i < 5; i ++){
            System.out.printf("%d° número: ", i+1);
            num[i] = Prompt.lerDecimal();

        }
        System.out.println("Digite um número qualquer");
        int n = Prompt.lerInteiro();
        System.out.printf("Indices com números inferiores a %d", n);
        for(int i =0; i < 5; i++){
            if (num[i] < n) {
                System.out.printf("\nÍndice %d", i);
            }
        }
    }
}
