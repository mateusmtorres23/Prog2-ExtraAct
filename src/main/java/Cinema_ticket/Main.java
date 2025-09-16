package Cinema_ticket;

import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);

    public void mainLoop(){
        System.out.println("Bem-vindo ao sistema de vendas de ingressos!");
        System.out.print("Quantos ingressos deseja comprar? ");
        int quantidade = sc.nextInt();
        sc.nextLine();
        System.out.print("Quais os tipos de ingresso (inteira, meia, promocional)? ");

    }
}
