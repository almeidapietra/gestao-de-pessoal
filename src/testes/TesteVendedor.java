package testes;

import pessoa.empregado.Vendedor;

public class TesteVendedor {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Kristoff", "Alto das Montanhas de Arendelle", "9999-8888", 4, 2500, 8, 50000, 5);
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Salário: " + vendedor.calcularSalario());
    }
}
