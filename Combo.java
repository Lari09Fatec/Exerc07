public class Combo {
    private IProduto burguer;
    private IProduto bebida;
    private IProduto sobremesa;

    public void CriarCombo (int escolha){
        if (escolha == 1){
            this.burguer = new Burguer("Classico", 18.00, 100);
            this.bebida = new Bebida("Refri", 6.00, 350);
            this.sobremesa = new Sobremesa("Torta", 3.00, "normal");
        } 
        else if (escolha == 2){
            this.burguer = new Burguer("Especial", 25.00, 200);
            this.bebida = new Bebida("Refri refil", 12.00, 700);
            this.sobremesa = new Sobremesa("Torta", 5.00, "grande");
        
        
    }
}
public String toString() {
    double total = burger.getPreco() + bebida.getPreco() + sobremesa.getPreco();
    return "Combo \n" +
            "Burguer: " + burger.getDescricao() + " - R$" + burger.getPreco() + "\n" +
            "Bebida: " + bebida.getDescricao() + " - R$" + bebida.getPreco() + "\n" +
            "Sobremesa: " + sobremesa.getDescricao() + " - R$" + sobremesa.getPreco() + "\n" +
            "Total da compra: R$" + total;
    }
}