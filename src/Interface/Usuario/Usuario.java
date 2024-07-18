package Interface.Usuario;


import java.util.Scanner;

import Interface.Iphone.iPhone;

public class Usuario extends iPhone {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        iPhone Sis = new iPhone();
        
        System.out.println("Qual função deseja selecionar?");
            System.out.println(" ");
            System.out.println("1-Musicas " + "2-Ligações " + "3-Nevegador");

        while (true) {

        int escolhaUsuario = scan.nextInt();
        switch (escolhaUsuario) {
            case 1:
                    Sis.selecionarMusica("Californication");
                    Sis.tocar();
                    Sis.pausar();
                break;
            case 2:
                    Sis.ligar("8199780235");
                    Sis.atender();
                    Sis.iniciarCorreioVoz();
                break;
            case 3:
                    Sis.adicionarNovaAba();
                    Sis.atualizarPagina();
                    Sis.exibirPagina("www.google.com");
                    break;
            default:
                    scan.close();
                break;
            }
        }
        
    }
}
