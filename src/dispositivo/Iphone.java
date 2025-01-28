package dispositivo;

import Funcionalidades.AparelhoTelefonico;
import Funcionalidades.NavegadorInternet;
import Funcionalidades.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    // funções AparelhoTelefonico
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    public void atender() {
        System.out.println("Atendendo chamada");
        ;
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    // funções NavegadorInternet
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página da url: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    // funções ReprodutorMusical
    public void tocar() {
        System.out.println("Tocando áudio");
    }

    public void pausar() {
        System.out.println("Áudio pausado");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }
}
