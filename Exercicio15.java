public class Exercicio15 {
    public static void executar() {
        System.out.println("Digite 5 valores(obs: o próximo número a ser digitado tem que ser maior que o anterior): ");
        int[] num = new int[5];
        int cont = 0;
        boolean entradaValida = true;
        for (int i = 0; i < 5; i++) {
            num[i] = Prompt.lerInteiro();
            if (cont >= 1) {
                if (num[i] <= num[i - 1]) {
                    System.out.println("Número inserido inferior ou igual ao número anterior!!, Digite novamente");
                    entradaValida = false;
                    break;
                }
            }
            cont++;
        }
        if (entradaValida) {
            System.out.println("Resultado do vetor:\n");
            for (int i = 0; i < 5; i++) {
                System.out.print(num[i] + " ");
            }
        }
    }
}
