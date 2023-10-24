/**
 * @author Leandro
 */
public class PrimeiraClasse {
    public static void main(String args []){
        System.out.println("Começando o programa");
        Produto produto = new Produto();
        produto.setNome("Pedal");
        produto.setCodigo(3559);
        produto.setTipoembalagem("Caixa");
        produto.setDimensoes("12x15x10cm");
        String nomeProduto = produto.getNome();
        int codigoProduto = produto.getCodigo();
        String tipoEmbalagem = produto.getTipoembalagem();
        String dimensoesProduto = produto.getDimensoes();
        System.out.println("**************");
        System.out.println("Informações sobre o " + nomeProduto);
        System.out.println("Código do Produto: " + codigoProduto);
        System.out.println("Tipo de embalagem: " + tipoEmbalagem);
        System.out.println("Dimensões da embalagem " + dimensoesProduto);
        System.out.println("**************");
    }
}
