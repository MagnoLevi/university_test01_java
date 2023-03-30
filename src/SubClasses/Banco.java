package SubClasses;

public class Banco {
    private Double valor;

    public Banco() {
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor, int flag_saque_deposito) {
        if (flag_saque_deposito == 1){
            if (this.valor == null){
                this.valor = valor;
            } else {
                this.valor += valor;
            }

        } else {
            if (this.valor == null || this.valor - valor < 0){
                System.out.println("Saldo insuficiente");
            } else {
                this.valor -= valor;
            }
        }
    }

    @Override
    public String toString() {
        return "Banco: " +
                "valor = " + valor;
    }
}
