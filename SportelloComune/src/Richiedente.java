public class Richiedente extends Thread{
    private SportelloRisorsa sp;

    public Richiedente(String nome, SportelloRisorsa sp){
        super(nome);
        this.sp = sp;
    }

    @Override
    public void run(){
        String name = Thread.currentThread().getName();
        long num = (int) (Math.random() * 5000) + 1;
        sp.rilascia();
        try{
            Thread.sleep(num);
        }catch(InterruptedException e){}
        System.out.println(name + " RICHIEDE la stampa della carta d'identità");
        sp.stampa();
        System.out.println(name + " HA TERMINATO");
    }
}