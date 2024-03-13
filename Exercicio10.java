public class Exercicio10 {
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
        int[] aux = new int[5];
        for(int i =0; i < 5; i++){
            aux[i] = num[i];
        }
        int p=0;
        for(int i =4; i > -1; i--){
            num[i] = num2[p];
            p++;
        }
        p=0;
        for(int i =4; i > -1; i--){
            num2[i] = aux[p];
            p++;
        }
        System.out.println("\nLista B com os valores de A com a ordem invertida:");
        for(int i=0; i<5; i++){
            System.out.print(" "+num2[i]);
        }
    }
}
