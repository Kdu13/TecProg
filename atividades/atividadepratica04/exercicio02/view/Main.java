package atividades.atividadepratica04.exercicio02.view;

import atividades.atividadepratica04.exercicio02.model.Aplicativo;
import atividades.atividadepratica04.exercicio02.model.Arquivo;
import atividades.atividadepratica04.exercicio02.model.Aula;
import atividades.atividadepratica04.exercicio02.model.Avaliacao;
import atividades.atividadepratica04.exercicio02.model.BancoDados;
import atividades.atividadepratica04.exercicio02.model.Cliente;
import atividades.atividadepratica04.exercicio02.model.ContaBancaria;
import atividades.atividadepratica04.exercicio02.model.Curso;
import atividades.atividadepratica04.exercicio02.model.Jogo;
import atividades.atividadepratica04.exercicio02.model.Mensagem;
import atividades.atividadepratica04.exercicio02.model.Pedido;
import atividades.atividadepratica04.exercicio02.model.Produto;
import atividades.atividadepratica04.exercicio02.model.Projeto;
import atividades.atividadepratica04.exercicio02.model.RedeSocial;
import atividades.atividadepratica04.exercicio02.model.Relatorio;
import atividades.atividadepratica04.exercicio02.model.Senha;
import atividades.atividadepratica04.exercicio02.model.SistemaOperacional;
import atividades.atividadepratica04.exercicio02.model.Site;
import atividades.atividadepratica04.exercicio02.model.Tarefa;
import atividades.atividadepratica04.exercicio02.model.Usuario;

public class Main {
    public static void main(String[] args) {
        
        Aplicativo whats = new Aplicativo();
        whats.nome = "WhatsApp";

        whats.instalar();

        Aplicativo face = new Aplicativo();
        face.nome = "Facebook";

        face.instalar();

        Arquivo arquivoTexto = new Arquivo();
        arquivoTexto.tipoArquivo = "txt";

        arquivoTexto.iniciarTarefa();

        Arquivo arquivoPdf = new Arquivo();
        arquivoPdf.tipoArquivo = "pdf";

        arquivoPdf.iniciarTarefa();

        Aula matematica = new Aula();
        matematica.professor = "Caio";

        matematica.aplicarProva();

        Aula portugues = new Aula();
        portugues.professor = "João";

        portugues.aplicarProva();

        Avaliacao avaliacaoMatematica = new Avaliacao();
        avaliacaoMatematica.gabarito = "Prova de Matemática";

        avaliacaoMatematica.escrever();

        Avaliacao avaliacaoPortuguês = new Avaliacao();
        avaliacaoPortuguês.gabarito = "Prova de Português";

        avaliacaoPortuguês.escrever();

        BancoDados mysql = new BancoDados();
        mysql.nomeBanco = "MySQL";

        mysql.consultarDados();

        BancoDados oracle = new BancoDados();
        oracle.nomeBanco = "Oracle";

        oracle.consultarDados();

        Cliente maiorIdade = new Cliente();
        maiorIdade.idade = 20;

        maiorIdade.pagar();

        Cliente menorIdade = new Cliente();
        menorIdade.idade = 16;
        
        menorIdade.pagar();

        ContaBancaria nubank = new ContaBancaria();
        nubank.nomeCliente = "Carlos";
        nubank.saldo = 1000;

        nubank.exibirSaldo();

        ContaBancaria caixa = new ContaBancaria();
        caixa.nomeCliente = "Caio";
        caixa.saldo = 10000;

        caixa.exibirSaldo();

        Curso java = new Curso();
        java.nomeAluno =  "Carlos";
        java.matricula = 12345;

        java.fazerMatricula();

        Curso python = new Curso();
        python.nomeAluno = "Bruna";
        python.matricula = 67890;

        python.fazerMatricula();

        Jogo jogoRPG = new Jogo();
        jogoRPG.nome = "Elden Ring";

        jogoRPG.salvarProgresso();

        Jogo jogoArcade = new Jogo();
        jogoArcade.nome = "Super Mario";

        jogoArcade.salvarProgresso();

        Mensagem mensagemTexto = new Mensagem();
        mensagemTexto.conteudo = "Salve";

        mensagemTexto.enviarMensagem();

        Mensagem mensagemImagem = new Mensagem();
        mensagemImagem.conteudo = "Partiu estudar!";

        mensagemImagem.enviarMensagem();
    }
}