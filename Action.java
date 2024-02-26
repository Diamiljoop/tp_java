public  abstract class Action{
    private String nom;
    private int cout;
    abstract void action(Royaume r, Fabrique f);
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getCout() {
        return cout;
    }
    public void setCout(int cout) {
        this.cout = cout;
    }

    
}