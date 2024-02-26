import java.util.ArrayList;
import java.util.List;

public class Village {
    // cette attribut prend une liste de personne 
    private String nom;

    private List<Roturier> habitants;
    public Village(){
        this.habitants=new ArrayList<>();
    }
     
    // fonction qui permet d'ajouter une personne dans une liste
    public void setHabitants(Roturier p){
        habitants.add(p);
    }
    public List<Roturier> getHabitants(){
        return habitants;
    }



    public void viellir(){

    }
    public void production(){

    }

    public void impot(){

    }

    
}
