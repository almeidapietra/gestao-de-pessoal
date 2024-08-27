package testes;
import pessoa.empregado.Empregado;

public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("Olaf", "Alameda da neve", "9876-5432", 1, 2000, 15);
        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Salário: " + empregado.calcularSalario());
    }
}
