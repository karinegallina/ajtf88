public class TesteFuncionario {

    public static void main(String[] args) {

        // Criando o endereço para o funcionário f
        Endereco end1 = new Endereco("Rua das tulipas", 1200);

        // Criando o funcionário f
        Funcionario f = new Funcionario();

        //  atribuindo as características herdadas da classe Pessoa
        f.setNome("Pedro da Silva");
        f.setEndereco(end1);
        f.setRg("1234545");

        //  atribuindo as características específicas de funcionários
        f.setSalario(10000);
        f.setCarteiraProfissional(123434L);

        // Chamando um método definido na classe Pessoa que, por sua vez,
        // "conhece" apenas os atributos da classe Pessoa
        f.imprime();
    }
}
