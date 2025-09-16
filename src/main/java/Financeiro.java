import java.util.ArrayList;
import java.util.List;
public class Financeiro {
    private List<Venda> vendas;

    public Financeiro() {
        this.vendas = new ArrayList<>();
    }

    public void registrarVenda(Venda v) {
        vendas.add(v);
    }


 public void exibirRelatorioFinal() {
        int totalIngressos = 0;
        int totalInteira = 0;
        int totalMeia = 0;
        int totalPromocional = 0;
        int totalGratis = 0;
        double totalArrecadado = 0.0;

        for (Venda v : vendas) {
            List<String> tipos = v.getTipos();
            totalIngressos += tipos.size();

            for (String tipo : tipos) {
                switch (tipo) {
                    case "inteira" -> totalInteira+= 1;
                    case "meia" -> totalMeia+= 1;
                    case "promocional" -> totalPromocional+= 1;
                    case "gratuito" -> totalGratis+= 1;
                }
}
totalArrecadado += v.getValorTotal;
}

    System.out.println("\n relatorio final");
    System.out.println("Total de ingressos vendidos "+ totalIngressos);
    System.out.println("inteira: " + totalInteira);
    System.out.println("meia:" + totalMeia);
    System.out.println("promoção "+ totalPromocional)
    System.out.println("gratuito"+ totalGratis)
    System.out.printf("Total arrecadado: R$ %.2f%n", totalArrecadado);
}
    }


