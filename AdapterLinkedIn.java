public class AdapterLinkedIn extends absAdapterRedesSociais{

    public final APILinkedIn apiLinkedIn;

    public AdapterLinkedIn(APILinkedIn apiLinkedIn){
        this.apiLinkedIn = apiLinkedIn;
    }

    public void enviar(String texto, String imagem){
        apiLinkedIn.submit(texto, imagem);
    }

}
