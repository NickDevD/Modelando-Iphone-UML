package ClasseAbstrata.Aparelho.Funcionalidades;

import ClasseAbstrata.Aparelho.Iphone;

public class funcinalidadesIphone extends Iphone {

    //APARELHO TELEFÔNICO
    String numero;
    public void ligar(String numero) {
            this.numero = numero;
        System.out.println("Ligando" + numero);
    }
    public void atender() {
        System.out.println("Atendendo Chamada");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Correio de Voz Iniciado");
    }

    //REPRODUTOR DE MÚSICA
    String musica;
    public void tocar() {
        System.out.println("Tocando");
    }
    public void pausar() {
        System.out.println("Pausa");
    }
    public void selecionarMusica(String musica) {
            this.musica = musica;
        System.out.println("Tocando: " + musica);
    }

    //NAVEGADOR DE INTERNET
    String url;
    public void exibirPagina(String url) {
        paginaAtual();
        this.url = url;
        System.out.println("Página atual: " + url);
    }
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }
    private void paginaAtual() {
        System.out.println("Página em branco, digite o endereço url");
    }

    public void iniciarAparelho() {
        carregarCongurações();
        iniciarApps();
        System.out.println("Iphone Ligado");

    }

    private void carregarCongurações() {
        System.out.println("Configurações Carregadas");
    }
    private void iniciarApps() {
        System.out.println("Aplicativos Iniciados");
    }
}
