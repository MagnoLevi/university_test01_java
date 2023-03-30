package Classes;

import SubClasses.Pessoa;

public class Professor extends Pessoa {
    private String espec;

    public Professor(String nome, String espec) {
        super(nome);
        this.espec = espec;
    }

    public String getEspec() {
        return espec;
    }

    public void setEspec(String espec) {
        this.espec = espec;
    }

    @Override
    public String toString() {
        return "Professor: " +
                "espec = '" + espec + '\'' +
                ", nome = '" + nome;
    }
}
