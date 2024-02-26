import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Royaume {
    private String nom;
    
   
    private List<Village> village;

    public Royaume(){
        this.village=new ArrayList<>();

    }

    public void viellir(){

    }
    public void production(){

    }

    public void impot(){

    }
    public boolean ajouteHabitat(Roturier r){
      if(village.isEmpty()){
        return false;
      }
      else{
        int index_village=new Random().nextInt(village.size());
        Village unvillage=village.get(index_village);
        unvillage.setHabitants(r);
        return true;
        
      }
      
    }
    @Override
    public String toString() {
        return "Royaume [villages=" + village + "]";
    }
    

    
    
}
