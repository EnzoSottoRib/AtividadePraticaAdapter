public class AdapterTikTok extends absAdapterRedesSociais{

    public final APITikTok apiTikTok;

    public AdapterTikTok(APITikTok apiTikTok){
        this.apiTikTok = apiTikTok;
    }

    public void enviar(String texto, String imagem){
        apiTikTok.post(texto, imagem);
    }

}
