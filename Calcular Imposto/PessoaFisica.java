package imposto;

public class PessoaFisica extends Pessoa{
    private int cpf;

    public PessoaFisica(String nome, double renda, Bairro bairro, int cpf) {
        super(nome, renda, bairro);
        this.cpf = cpf;
    }

    @Override
    public double calcImposto() {
        if (this.getRenda() <= 3000){
            this.setImposto(0);
        } else if (this.getRenda() <= 4000) {
            this.setImposto(this.getRenda() * 10 / 100);
        } else if (this.getRenda() <= 6000) {
            this.setImposto(this.getRenda() * 20 / 100);
        } else {
            this.setImposto(this.getRenda() * 0.30);
        }

       return this.getImposto();
    }
}
