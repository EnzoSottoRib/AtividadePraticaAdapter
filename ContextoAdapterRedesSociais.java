public class ContextoAdapterRedesSociais {

    private absAdapterRedesSociais contexto;

    ContextoAdapterRedesSociais(absAdapterRedesSociais contexto){
        this.setContexto(contexto);
    }

    public void setContexto(absAdapterRedesSociais contexto){
        this.contexto = contexto;
    }

    public void enviar(String a, String b){
        this.contexto.enviar(a, b);
    }
}
