public class Exercicio14 {
    public static void executar(){
        System.out.println("Digite 5 valores para A: ");
        int[] num =new int[5];
        int aux;
        for(int i =0; i<5; i++){
            num[i] = Prompt.lerInteiro();
        }
        for(int i=0; i<num.length-1; i++){
            if (num[i]> num[i+1]) {
                aux = num[i];
                num[i] = num[i+1];
                num[i+1]= aux;
                
            }
        }
        System.out.println("\nVetor com o maior número na última casa:\n");
        for(int i=0; i< 5; i++){
            System.out.println(num[i]);
        }
    }
}
