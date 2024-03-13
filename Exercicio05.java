public class Exercicio05 {
    public static void executar(){
        System.out.println("Digite 5 números: ");
        double[] num = new double[5];

        for(int i =0; i < 5; i ++){
            System.out.printf("%d° número: ", i+1);
            num[i] = Prompt.lerDecimal();

        }
        int n= Prompt.lerInteiro("Digite um número");
        int cont=0;
        for(int i =0; i < 5; i++){
            if (num[i] == n){
                cont++;
            }
        }
        System.out.printf("O número %d apareceu %d vezes dentro do vetor!", n, cont);
    }
}
