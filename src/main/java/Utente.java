public class Utente {
    public static void main(String[] args) {

        SmartTV smartTV = new SmartTV();

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumenterVolume();

        smartTV.mudarCanal(14);
        System.out.println("Canal atual: " + smartTV.canal);
        

        System.out.println("volume atual? :" + smartTV.volume);

        System.out.println("Tv Ligada ? :" + smartTV.ligada);
        System.out.println("Canal atual ? :" +smartTV.canal);
        System.out.println("Volume atual? :" +smartTV.volume);

        smartTV.ligar();
        System.out.println("Novo status -Tv Ligada ? :" + smartTV.ligada);

        smartTV.desligar();
        System.out.println("Novo status -Tv Ligada ? :" + smartTV.ligada);
    }
}
