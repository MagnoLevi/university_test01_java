package App;

import Classes.Aluno;
import Classes.Professor;
import SubClasses.Banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // EXERCICIO 3
        System.out.println("-------------- EXERCÍCIO 3 --------------");

        Professor p1 = new Professor("José", "Programação");

        Aluno a1 = new Aluno("João", "123");

        int flag_aluno = 0;
        while(flag_aluno > 3 || flag_aluno < 1){
            System.out.print("\nDigite 1 para exibir os dados do aluno, 2 para exibir os dados do professor ou 3 para exibir os dois dados: ");
            flag_aluno = sc.nextInt();

            if (flag_aluno > 3 || flag_aluno < 1){
                System.out.println("Digite um número valido");
            }
        }

        if (flag_aluno == 1) {
            System.out.println(a1);
        } else if(flag_aluno == 2){
            System.out.println(p1);
        } else {
            System.out.println(a1 + "\n" + p1);
        }


        // EXERCICIO 4
        System.out.println("\n-------------- EXERCÍCIO 4 --------------");

        Banco b1 = new Banco();
        String flag_loop = "S";

        while(flag_loop.toUpperCase().equals("S")){
            int flag_saque_deposito = 0;
            while(flag_saque_deposito > 2 || flag_saque_deposito < 1){
                System.out.print("\nDigite 1 para depositar um valor no banco, ou 2 para sacar: ");
                flag_saque_deposito = sc.nextInt();

                if (flag_saque_deposito > 2 || flag_saque_deposito < 1){
                    System.out.println("Digite um número valido");
                }
            }


            if (flag_saque_deposito == 1){
                System.out.print("Digite o valor que deseja depositar: ");
            } else {
                System.out.print("Digite o valor que deseja sacar: ");
            }

            Double valor = sc.nextDouble();
            b1.setValor(valor, flag_saque_deposito);

            System.out.print("Digite S para continuar a operação ou N para encerrar: ");
            flag_loop = sc.next();
        }

        System.out.println("\n" + b1);
    }
}