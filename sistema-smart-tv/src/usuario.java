public class usuario {
    public static void main(String[] args) throws Exception {
        
        smartTv smartTv = new smartTv();

        System.out.println("Tv ligada? "+smartTv.ligada);
        System.out.println("Canal: "+smartTv.canal);
        System.out.println("Volume inicial: "+smartTv.volume);

        smartTv.ligar ();
        
        System.out.println("Novo status: "+smartTv.ligada);
        
        smartTv.desligar ();
        
        System.out.println("Novo status: "+smartTv.ligada);

        smartTv.aumentarVolume ();

        System.out.println("Volume: "+smartTv.volume);

        smartTv.diminuirVolume ();

        System.out.println("Volume: "+smartTv.volume);

        smartTv.diminuirVolume ();

        System.out.println("Volume: "+smartTv.volume);

        smartTv.diminuirVolume ();

        System.out.println("Volume: "+smartTv.volume);



    }
}
