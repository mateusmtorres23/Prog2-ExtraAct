package Cinema_ticket;

import java.util.ArrayList;
import java.util.List;

public class Financeiro {

    private final List<Venda> vendas;

    public Financeiro() {
        this.vendas = new ArrayList<>();
    }

    public void registerSale(Venda venda) {
        if (venda != null) {
            this.vendas.add(venda);
        }
    }

    public void displayFinalReport() {
        int totalTicketsSold = 0;
        int totalFullPrice = 0;
        int totalHalfPrice = 0;
        int totalPromotional = 0;
        int totalFree = 0;
        double totalRevenue = 0.0;

        for (Venda venda : this.vendas) {
            List<String> ticketTypes = venda.getTipos();
            totalTicketsSold += ticketTypes.size();

            for (String type : ticketTypes) {
                switch (type) {
                    case "inteira" -> totalFullPrice++;
                    case "meia" -> totalHalfPrice++;
                    case "promocional" -> totalPromotional++;
                    case "gratuito" -> totalFree++;
                }
            }
            totalRevenue += venda.getValorTotal();
        }

        System.out.println("\n--- Final Financial Report ---");
        System.out.println("Total Tickets Sold: " + totalTicketsSold);
        System.out.println(" - Full Price ('inteira'): " + totalFullPrice);
        System.out.println(" - Half Price ('meia'): " + totalHalfPrice);
        System.out.println(" - Promotional ('promocional'): " + totalPromotional);
        System.out.println(" - Free ('gratuito'): " + totalFree);
        System.out.printf("Total Revenue: R$ %.2f%n", totalRevenue);
    }
}