package ClasseAbstrata.Usuario;

import ClasseAbstrata.Aparelho.Iphone;
import ClasseAbstrata.Aparelho.Funcionalidades.AparelhoTelefonico;
import ClasseAbstrata.Aparelho.Funcionalidades.NavegadorInternet;
import ClasseAbstrata.Aparelho.Funcionalidades.ReprodutorMusical;

public class Usuario {
    
    public static void main(String[] args) {
         
       
       AparelhoTelefonico fun = new AparelhoTelefonico();
        fun.iniciarAparelho();
        fun.atender();
        fun.ligar(" 8199214251");
        fun.iniciarCorreioVoz();
        
       NavegadorInternet fun2 = new NavegadorInternet();
        fun2.adicionarNovaAba();
        fun2.atualizarPagina();
        fun2.exibirPagina(" www.google.com");

       ReprodutorMusical fun3 = new ReprodutorMusical();
       fun3.tocar();
       fun3.pausar();
       fun3.selecionarMusica(" Californication");

    


        
    
    }

}
