package imposto;

public class PessoaJuridica extends Pessoa {
    private int Cnpj;

    public PessoaJuridica(String nome, double renda, Bairro bairro, int cnpj) {
        super(nome, renda, bairro);
        Cnpj = cnpj;
    }

    @Override
    public double calcImposto() {
        if (this.getRenda() <= 5000){
            this.setImposto(this.getRenda() * 5 / 100);
        } else if (this.getRenda() <= 25000) {
            this.setImposto(this.getRenda() * 12 / 100);
        } else if (this.getRenda() <= 50000) {
            this.setImposto(this.getRenda() * 17 / 100);
        } else {
            this.setImposto(this.getRenda() * 0.20);
        }

        return this.getImposto();
    }

}
