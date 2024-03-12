public class Exercicio02 {
    public static void executar(){
        System.out.println("Digite quantos números vc quer escrever: ");
        int i = Prompt.lerInteiro();

        System.out.println("Digite os números desejados(positvos ou negativos)");
        double[] num = new double[i];
        for(i =0; i < num.length; i++){
            System.out.printf("%d° número: ", i+1);
            num[i] = Prompt.lerDecimal();
        }
        for(i = 0; i < num.length; i++){
            if(num[i] < 0){
                System.out.printf("\nO número na posição %d-(%.1f) é NEGATIVO", i, num[i]);
            }else if(num[i] > 0){
                System.out.printf("\nO número na posição %d-(%.1f) é POSITIVO", i, num[i]);
            }else{
                System.out.printf("\nO número na posição %d-(%.1f) é ZERO", i, num[i]);
            }
        }
    }
}
