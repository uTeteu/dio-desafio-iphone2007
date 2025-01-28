import dispositivo.Iphone;

public class Program {
    public static void main(String[] args) throws Exception {

        Iphone iphone = new Iphone();

        // funções do AparelhoTelefonico
        iphone.ligar("(00) 00000-0000");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("------------");

        // funções de NavegadorInternet
        iphone.exibirPagina("https://www.dio.me/");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        System.out.println("------------");

        // funções do ReprodutorMusical
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Stromae, Pomme - Ma Meilleure Ennemie");
    }
}
