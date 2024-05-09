public class Usuario {
    
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        
        System.out.println("Tv ligada?"+smartTv.ligada);
        System.out.println("canal atual : "+smartTv.canal);
        System.out.println("volume atual : "+smartTv.volume);

        smartTv.ligar();
        System.out.println("novo status - Tv ligada?"+smartTv.ligada);

    }
}
