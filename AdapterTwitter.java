public class AdapterTwitter extends absAdapterRedesSociais{

    public final APITwitter apiTwitter;

    public AdapterTwitter(APITwitter apiTwitter){
        this.apiTwitter = apiTwitter;
    }

    public void enviar(String texto, String imagem){
        apiTwitter.submit(texto, imagem);
    }

}
