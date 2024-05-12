package imposto;

public abstract class Pessoa {
    protected String nome;
    protected double renda, imposto;
    protected Bairro bairro;

    public Pessoa(String nome, double renda, Bairro bairro) {
        this.nome = nome;
        this.renda = renda;
        this.bairro = bairro;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract double calcImposto();
}
