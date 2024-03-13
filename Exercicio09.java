public class Exercicio09 {
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
        int[] num3 = new int[10];

        System.out.println("A lista de números intercalada é: ");
        int p=0;
        int x=0;
        for(int i =0; i<10;){
            if (i % 2==0) {
                num3[i] = num[p];
                p++;
            }else{
                num3[i] = num2[x];
                x++;
            }
            i++;
        }
        for(int i=0; i <10; i++){
            System.out.print(" "+ num3[i]);
        }
    }
}
