package testes;
import pessoa.Fornecedor;

public class TesteFornecedor {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("Elsa de Arendelle", "Palácio de Arendelle", "1234-5678", 10000, 2500);
        System.out.println("Nome: " + fornecedor.getNome());
        System.out.println("Saldo: " + fornecedor.obterSaldo());
    }
}
