package Interface.Iphone;

import Interface.Iphone.Funcionalidades.AparelhoTelefonico;
import Interface.Iphone.Funcionalidades.NavegadorInternet;
import Interface.Iphone.Funcionalidades.ReprodutorMusical;

public class iPhone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

   //Reprodutor musical
   String musica;  
   public void tocar() {
        System.out.println("Iniciando Música");
   }
   public void pausar() {
        System.out.println("Pausa");
   }
   public void selecionarMusica(String musica) {
          this.musica = musica; 
        System.out.println("Selecionou: " + musica);
   }
    
   //Aparelho telefônico
   String numero;
   public void ligar(String numero) {
          this.numero = numero;
        System.out.println("Ligando");
          System.out.println(" ");
        System.out.println("Chamando " + numero);
   }
   public void atender() {
        System.out.println("Atendendo Chamada");
   }
   public void iniciarCorreioVoz() {
        System.out.println("Reproduzindo Correio de Voz");
   }

   //Navegador de Internet
   String url;
   public void exibirPagina(String url) {
           this.url = url;
         System.out.println("Exibindo Página Web: " + url); 
   }
   public void adicionarNovaAba() {
          System.out.println("Adicionando Nova Aba");
   }
   public void atualizarPagina() {
          System.out.println("Página Atualizada");
   }

}
