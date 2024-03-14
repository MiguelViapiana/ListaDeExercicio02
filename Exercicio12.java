public class Exercicio12 {
    public static void executar(){
        System.out.println("Digite 12 valores: ");
        int[] num =new int[12];
        int[] pos = new int[12];
        for(int i =0; i<12; i++){
            num[i] = Prompt.lerInteiro();
        }
        for(int i =0; i<12; i++){
            if(num[i] % 2==0 && num[i] > 0){
                pos[i] = num[i];
    
            }else{
                pos[i] = 1;
            }
        }
        int resMult=1;
        for(int i =0; i < pos.length; i++){
            resMult *= pos[i];
        }
        System.out.println("O produto entre os números pares positivos é de: "+ resMult);
        
    }
}
