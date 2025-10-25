public class AdapterInsta extends absAdapterRedesSociais{

    public final APIInsta apiInsta;

    public AdapterInsta(APIInsta apiInsta){
        this.apiInsta = apiInsta;
    }

    public void enviar(String imagem, String subtitle){
        apiInsta.send(imagem, subtitle);
    }

}
