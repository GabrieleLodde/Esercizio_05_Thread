public class SportelloRisorsa {
    private boolean richiesto = false;

    public synchronized void rilascia(){
        String name = Thread.currentThread().getName();
        System.out.println(name + " RICHIEDE il modulo");
        System.out.println(name + " HA PRESO il modulo");
    }

    public synchronized void stampa(){
        try{
            String name = Thread.currentThread().getName();
            while(richiesto){
                System.out.println(name + " IN ATTESA della carta d'identita'");
                wait();
            }
        

        richiesto = true;
        long num = (int) (Math.random() * 3000) + 1;
        try{
            Thread.sleep(num);
        }catch(Exception e){}
        System.out.println(name + " HA RICEVUTO la carta d'identità");
        richiesto = false;
        notifyAll();
        }catch(Exception e){}
    }
}