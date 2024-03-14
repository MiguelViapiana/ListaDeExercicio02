public class Exercicio13 {
    public static void executar(){
        System.out.println("--- SEQUÊNCIA DE FIBONACCI ---");
        System.out.println("Digite um número: ");
        int num = Prompt.lerInteiro();
        int i=0;
        int p=1;
        int temp;

        System.out.println(i );
        System.out.println(p );
        while ((temp = i +p) <= num) {
            System.out.println(temp);
            i =p;
            p =temp;  
        }
    }
}
