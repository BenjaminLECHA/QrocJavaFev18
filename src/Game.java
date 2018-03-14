public class Game {

    private Player[] players;

    // 1) Crée un constructeur pour la classe Game, il doit pouvoir rendre le main sans erreur à la compilation
    public Game(int nbPlayers) {
        players = new Player[nbPlayers];
        for (int i=0; i < nbPlayers; i++) {
            players[i] = new Player(4);
        }
    }

    // 2) Redéfinir la méthode toString afin de pouvoir afficher les joueurs de votre partie
    // Vous ne pouvez pas toucher à la classe Player

    @Override
    public String toString() {
        String render;

        render = "";

        for (Player player : players) {
            render = render + player.toString() + '\n';
        }

        return render;
    }
}
