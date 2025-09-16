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

    totalIng += v.getQuantIng();
    for(String tipo : v.getTipos())
        switch(tipo){
        case "inteira": totalInteira += v.getQuantIng();
        case "meia": totalMeia += v.getQuantIng();
        case "promocional": totalPromo += v.getQuantIng();
        case "gratuito": totalGratis += v.getQuantIng();
}
    totalArrecadado += v.getValorTotal();
}
    public void exibirRelatorioFinal(){
        System.out.println("\n relatorio final");
        System.out.println("Total de ingressos vendidos "+ totalIng);
        System.out.println("inteira: " + totalInteira);
        System.out.println("meia:" + totalMeia);
        System.out.println("promoção "+ totalPromo);
        System.out.println("gratuito"+ totalGratis);
        System.out.printf("Total arrecadado: R$ %.2f%n", totalArrecadado);
}
    public double getPrecoBase() {
            return precoBase;
    }
}

