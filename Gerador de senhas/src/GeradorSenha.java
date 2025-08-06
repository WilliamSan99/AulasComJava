import java.security.SecureRandom;

public class GeradorSenha {

    private static final String MAIUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMEROS = "0123456789";
    private static final String SIMBOLOS = "!@#$%&*()_+-=[]{}|;:,.<>?";

    private SecureRandom random = new SecureRandom();

    public String gerarSenha(int tamanho, boolean usarMaiusculas, boolean usarMinusculas, boolean usarNumeros, boolean usarSimbolos) {
        StringBuilder pool = new StringBuilder();

        if (usarMaiusculas) pool.append(MAIUSCULAS);
        if (usarMinusculas) pool.append(MINUSCULAS);
        if (usarNumeros)    pool.append(NUMEROS);
        if (usarSimbolos)   pool.append(SIMBOLOS);

        if (pool.length() == 0) throw new IllegalArgumentException("Você precisa selecionar pelo menos um tipo de caractere.");

        StringBuilder senha = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            int index = random.nextInt(pool.length());
            senha.append(pool.charAt(index));
        }

        return senha.toString();
    }
}
