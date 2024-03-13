public class Exercicio07 {
    public static void executar(){
        System.out.println("Digite 5 números: ");
        int[] num = new int[5];
        int[] num2 = new int[5];
        for(int i=0; i<5; i++){
            num[i] = Prompt.lerInteiro();
        }
        System.out.println("Digite novamente 5 números");
        for(int i =0; i< 5; i++){
            num2[i] = Prompt.lerInteiro();
        }
        int cont =0;
        for(int i=0; i<5; i++){
            if(num[i] == num2[i]){
                cont++;
            }
        }
        if(cont == 5){
            System.out.println("As duas listas de números são IGUAIS!!");
        }else{
            System.out.println("As duas listas de números são DIFERENTES");
        }
    }
}
