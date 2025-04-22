package br.com.fiap.main;

import br.com.fiap.bean.Aluno;

import javax.swing.*;
import java.time.LocalDate;

// RM: 563558 | Nome: Olavo Porto Neves
// RM: 561940 | Nome: Pedro Henrique Dias França
// RM: 564495 | Nome: Luiz Gonçalves

public class MainAluno {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno(563558, "Olavo Porto Neves", 2007);
        Aluno aluno02 = new Aluno(561940, "Pedro Henrique Dias França", 2006);
        Aluno aluno03 = new Aluno();
        Aluno aluno04 = new Aluno();

        try {
            LocalDate dataAtual = LocalDate.now();

            int registroMatricula = Integer.parseInt(JOptionPane.showInputDialog(null, "1- Digite o seu registro da matricula: "));
            String nomeCompleto = JOptionPane.showInputDialog(null, "2- Digite o seu nome completo: ");
            int anoDeNascimento = Integer.parseInt(JOptionPane.showInputDialog(null, "3- Digite o seu ano de nascimento: "));

            aluno03.setRegistroMatricula(registroMatricula);
            aluno03.setNomeCompleto(nomeCompleto);
            aluno03.setAnoDeNascimento(anoDeNascimento);

            registroMatricula = Integer.parseInt(JOptionPane.showInputDialog(null, "1- Digite o seu registro da matricula: "));
            nomeCompleto = JOptionPane.showInputDialog(null, "2- Digite o seu nome completo: ");
            anoDeNascimento = Integer.parseInt(JOptionPane.showInputDialog(null, "3- Digite o seu ano de nascimento: "));

            aluno04.setRegistroMatricula(registroMatricula);
            aluno04.setNomeCompleto(nomeCompleto);
            aluno04.setAnoDeNascimento(anoDeNascimento);

            JOptionPane.showMessageDialog(null, String.format("==========================================================\n RM  |  Nome  |  Idade \n ==========================================================\n RM: %d  | Nome: %s  | Idade: %d \n-----------------------------------------------------------------------------------------------------\nRM: %d  | Nome: %s  | Idade: %d \n-----------------------------------------------------------------------------------------------------\n RM: %d  | Nome: %s  | Idade: %d \n-----------------------------------------------------------------------------------------------------\n RM: %d  | Nome: %s  | Idade: %d \n==========================================================", aluno01.getRegistroMatricula(), aluno01.getNomeCompleto(), aluno01.calcularIdade(dataAtual), aluno02.getRegistroMatricula(), aluno02.getNomeCompleto(), aluno02.calcularIdade(dataAtual), aluno03.getRegistroMatricula(), aluno03.getNomeCompleto(), aluno03.calcularIdade(dataAtual), aluno04.getRegistroMatricula(), aluno04.getNomeCompleto(), aluno04.calcularIdade(dataAtual)));
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
