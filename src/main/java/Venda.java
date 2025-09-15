import java.util.List;
import java.util.ArrayList;

public class Venda {
    private String formaPag;
    private List<String> tipos;
    private List<Integer> idades;

    public Venda(String formaPag, List<Integer> idades, List<String> tipos) {
        this.formaPag = formaPag;
        this.idades = new ArrayList<Integer>();
        this.tipos = new ArrayList<String>();

        if (idades.size() != tipos.size()){
            throw new IllegalArgumentException("a quantidade de idades e tipos de ingressos deve ser a mesma e devem ter o mesmo tamanho.");
        }
        for (Integer idade: idades){
            if (idade<0 || idade>120){
                throw new IllegalArgumentException("Idade não pode ser negativa nem maior que 120.");
            }
            this.idades.add(idade);
        }

        for (String tipo: tipos){
            if (!tipo.equals("inteira") && !tipo.equals("meia")){
                throw new IllegalArgumentException("Tipo de ingresso inválido.");
            }
            this.tipos.add(tipo);
        }
    }

    public List<String> tiposIng(List<Integer> idades){
        for (Integer idade: idades){
            if (idade<6){
                setTipos();
            }
        }
    }
    public double calcQuant(){
    }
    public double calcVal(){
    }

    public double getQuantIng() {
        return quantIng;
    }
    public double getValor() {
        return valor;
    }
    public String getFormaPag() {
        return formaPag;
    }
    public List<Integer> getIdades() {
        return idades;
    }
    public List<String> getTipos() {
        return tipos;
    }
    public void setQuant(double quant) {
        this.quantIng = quant;
    }
    public void setFormaPag(String formaPag) {
        this.formaPag = formaPag;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    public void setIdades(List<Integer> idades) {
        this.idades = idades;
    }
    public void setTipos(List<String> tipos) {
        this.tipos = tipos;
    }

    public static void main(String[] args) {
    }
}
