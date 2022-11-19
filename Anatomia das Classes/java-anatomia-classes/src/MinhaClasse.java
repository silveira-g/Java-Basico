public class MinhaClasse {
    public static void main(String[] args) {
  //      System.out.println("Meu primeiro input");
        String primeiroNome = "Guilherme";
        String segundoNome = "Silveira";
        System.out.println(nomeCompleto(primeiroNome, segundoNome));
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
