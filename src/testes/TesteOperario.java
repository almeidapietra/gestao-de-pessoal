package testes;
import pessoa.empregado.Operario;

public class TesteOperario {
    public static void main(String[] args) {
        Operario operario = new Operario("Hans", "Ilhas do Sul", "4444-7777", 3, 1500, 5, 10000, 10);
        System.out.println("Nome: " + operario.getNome());
        System.out.println("Salário: " + operario.calcularSalario());
    }
}
