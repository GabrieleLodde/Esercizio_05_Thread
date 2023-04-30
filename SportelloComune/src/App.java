import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        SportelloRisorsa sp = new SportelloRisorsa();
        List<Richiedente> elencoPersone = new ArrayList<>();

        elencoPersone.add( new Richiedente("Mario", sp) );
        elencoPersone.add( new Richiedente("Luca", sp) );
        elencoPersone.add( new Richiedente("Sara", sp) );
        elencoPersone.add( new Richiedente("Mattia", sp) );
        elencoPersone.add( new Richiedente("Giulio", sp) );
        
        for(Richiedente r: elencoPersone){
            r.start();
        }
    }
}