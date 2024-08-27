package testes;
import pessoa.empregado.Administrador;

public class TesteAdministrador {
    public static void main(String[] args) {
        Administrador administrador = new Administrador("Ana de Arendelle", "Palácio de Arendelle", "5555-6666", 2, 3000, 10, 500);
        System.out.println("Nome: " + administrador.getNome());
        System.out.println("Salário: " + administrador.calcularSalario());
    }
}
