public class Cardapio {

    static String[] nomesDoCardapio = {
            "Hambúrguer",
            "Pizza",
            "Sopa",
            "Salada",
            "Massa"
    };

    static double[] precosDoCardapio = {
            10.99,
            8.49,
            4.99,
            6.99,
            9.99
    };

    public static void exibirCardapio() {
        System.out.println("Cardápio:");

        for (int i = 0; i < nomesDoCardapio.length; i++) {
            System.out.println((i + 1) + ". " + nomesDoCardapio[i] + " - R$" + precosDoCardapio[i]);
        }
    }
}

