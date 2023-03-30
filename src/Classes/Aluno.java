package Classes;

import SubClasses.Pessoa;

public class Aluno extends Pessoa {
    private String senha;

    public Aluno (String nome, String senha){
        super(nome);
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Aluno: " +
                "senha = '" + senha + '\'' +
                ", nome = '" + nome;
    }
}
