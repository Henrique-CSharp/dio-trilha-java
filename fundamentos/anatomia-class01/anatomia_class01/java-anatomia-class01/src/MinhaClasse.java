public class MinhaClasse {

    public static void main (String [] args) {
        String primeiroNome = "Henrique";
        String segundoNome = "Diniz";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
