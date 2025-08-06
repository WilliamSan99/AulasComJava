import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GeradorSenha gerador = new GeradorSenha();

        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da senha:"));

        boolean maiusculas = JOptionPane.showConfirmDialog(null, "Incluir letras maiúsculas?", "Opções", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        boolean minusculas = JOptionPane.showConfirmDialog(null, "Incluir letras minúsculas?", "Opções", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        boolean numeros    = JOptionPane.showConfirmDialog(null, "Incluir números?", "Opções", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        boolean simbolos   = JOptionPane.showConfirmDialog(null, "Incluir símbolos?", "Opções", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;

        try {
            String senha = gerador.gerarSenha(tamanho, maiusculas, minusculas, numeros, simbolos);
            JOptionPane.showMessageDialog(null, "Senha gerada:\n" + senha);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
}