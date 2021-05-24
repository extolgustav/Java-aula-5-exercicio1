package exerc1;

public class Pessoa implements Precedente<Pessoa> {

    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public int precedeA(Pessoa p) {
        return this.cpf.compareTo(p.cpf);
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return cpf;
    }

    @Override
    public String toString() {
        return nome + ", " + cpf;
    }
}
