public interface ProcessadorPagamento {

    boolean validarCartao(String numeroCartao);
    void ProcessadorPagamento(double valor);
    
}