package br.com.fiap.bean;

import javax.swing.*;
import java.time.LocalDate;

// RM: 563558 | Nome: Olavo Porto Neves
// RM: 561940 | Nome: Pedro Henrique Dias França
// RM: 564495 | Nome: Luiz Gonçalves

public class Aluno {
    private int registroMatricula;
    private String nomeCompleto;
    private int anoDeNascimento;

    public Aluno() {

    }

    public Aluno(int registroMatricula, String nomeCompleto, int anoDeNascimento) {
        this.registroMatricula = registroMatricula;
        this.nomeCompleto = nomeCompleto;
        this.anoDeNascimento = anoDeNascimento;
    }

    public int calcularIdade(LocalDate dataAtual) {
        int ano = dataAtual.getYear();
        return ano - anoDeNascimento;
    }

    public int getRegistroMatricula() {
        return registroMatricula;
    }

    public Aluno setRegistroMatricula(int registroMatricula) {
        try {
            if (registroMatricula >= 80000 && registroMatricula <= 599999) {
                this.registroMatricula = registroMatricula;
            } else {
                JOptionPane.showMessageDialog(null, "Você digitou um registro inválido!", "Mensagem de erro!", JOptionPane.ERROR_MESSAGE);
                JOptionPane.showMessageDialog(null, "Programa Finalizado!", "ATENÇÃO", JOptionPane.INFORMATION_MESSAGE);
                throw new RuntimeException();
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        return this;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public Aluno setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
        return this;
    }

    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public Aluno setAnoDeNascimento(int anoDeNascimento) {
        try {
            if (anoDeNascimento >= 1945 && anoDeNascimento <= 2025) {
                this.anoDeNascimento = anoDeNascimento;
            } else {
                JOptionPane.showMessageDialog(null, "Você digitou um ano de nascimento muito antigo ou inexistente!", "Mensagem de erro!", JOptionPane.ERROR_MESSAGE);
                JOptionPane.showMessageDialog(null, "Programa Finalizado!", "ATENÇÃO", JOptionPane.INFORMATION_MESSAGE);
                throw new RuntimeException();
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        return this;
    }
}
