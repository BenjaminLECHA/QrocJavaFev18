public class Player {

    private String name;
    private int nbCard;

    public static int i = 0;

    public Player(int n) {
        name = "Player" + i++;
        nbCard = n;
    }

    @Override
    public String toString() {
        return "Le joueur : " + name + " participe à cette partie.";
    }
}
