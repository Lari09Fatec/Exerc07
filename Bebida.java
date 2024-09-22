public class Bebida implements IProduto {
    private String descricao;
    private double preco;
    private int ml;
 
    public Bebida(String descricao, double preco, int ml){
        this.descricao = descricao;
        this.preco = preco;
        this.ml = ml;
    }
    public String getDescricao(){
        return descricao;
    }
    public double getPreco(){
        return preco;
    } 
    public int getMl(){
        return ml;
    }
}