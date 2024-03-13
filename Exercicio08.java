public class Exercicio08 {
    public static void  executar(){
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
        int[] num3 = new int[10];

        for(int i=0; i<5; i++){
            num3[i] = num[i];
        }
        for(int i=5; i<10; i++){
            num3[i] = num2[i-5];
        }
        System.out.println("A lista de números de A e B concatenados é: ");
        for(int i=0; i<10; i++){
            System.out.print(" "+ num3[i]);
        }

    }
}
