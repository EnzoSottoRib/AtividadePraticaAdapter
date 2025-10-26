public class Client {
    public static void main(String[] args) {
        ContextoAdapterRedesSociais contexto = new ContextoAdapterRedesSociais(new AdapterInsta(new APIInsta()));

        contexto.enviar("String primeira", "String segunda");

        contexto.setContexto(new AdapterTikTok(new APITikTok()));

        contexto.enviar("String terceira", "String quarta");

        contexto.setContexto(new AdapterTwitter(new APITwitter()));

        contexto.enviar("String quinta", "String sexta");

        contexto.setContexto(new AdapterLinkedIn(new APILinkedIn()));

        contexto.enviar("String sétima", "String oitava");
    }
}
