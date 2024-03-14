public class Exercicio11 {
    public static void executar(){
        System.out.println("Digite 5 valores para A: ");
        int[] num =new int[5];
        int[] num2 =new int[5];
        for(int i =0; i<5; i++){
            num[i] = Prompt.lerInteiro();
        }
        System.out.println("Digite outros 5 números para B: ");
        for(int i=0; i<5; i++){
            num2[i] = Prompt.lerInteiro();
        }
        System.out.println("O produto escalar entre os dois vetores é de: ");
        double somaNum =0;
        for(int i =0; i< 5; i++){
            somaNum += num[i] * num2[i];
        }
        System.out.println(somaNum);
    }
}
