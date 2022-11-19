public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume da TV: " + smartTv.volume);
        smartTv.mudarCanal(18);
        System.out.println("Canal da TV: " + smartTv.canal);
    }
}
