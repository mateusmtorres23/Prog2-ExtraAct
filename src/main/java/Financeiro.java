public class Financeiro {
private double precoBase;
private int totalIng;
private int totalInteira;
private int totalMeia;
private int totalPromo;
private int totalGratis;
private double totalArrecadado;

public Financeiro(double precoBase) {
    this.precoBase = precoBase;
}
public void registrarVenda(int quantidade, string tipoIngresso, double idadeCliente){
    venda v = new Venda(quantidade, tipoIngresso, idadeCliente, precoBase)

totalIng += v.getQuantidade;
switch(v.getTipoingresso()){
    case "inteira": totalInteira += v.getQuantidade();break;
    case "meia": totalMeia += v.getQuantidade();break;
    case "promocional": totalPromo += v.getQuantidade();break;
    case "gratuito": totalGratis += v.getQuantidade();break;
}
totalArrecadado += v.getValorTotal;
}
public void exibirRelatorioFinal(){
    System.out.println("\n relatorio final");
    System.out.println("Total de ingressos vendidos "+ totalIng);
    System.out.println("inteira: " + totalInteira);
    System.out.println("meia:" + totalMeia);
    System.out.println("promoção "+ totalPromo)
    System.out.println("gratuito"+ totalGratis)
    System.out.printf("Total arrecadado: R$ %.2f%n", totalArrecadado);
}
public double getPrecoBase() {
        return precoBase;
    }
}

