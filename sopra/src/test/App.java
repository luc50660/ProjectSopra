package test;

import context.Singleton;
import model.Admin;
import model.Compte;
import model.PlanetSeed;
import model.Utilisateur;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {

    static Singleton single = Singleton.getInstance();
    static Random rand = new Random();


    public static void startGame() {
        Compte compte;

        String login = single.inputString("Login:");
        String password = single.inputString("Password:");
        compte = service.CompteDB.connect(login, password);

        switch (compte) {
            case null -> {
                System.out.println("Identifiants invalides");
                String register = single.inputString("Voulez vous vous inscrire ? y/n");
                if (register.equals("y")){
                    String name = single.inputString("Donner votre nom:");
                    compte = new Utilisateur(login,password,name);
                }
                else {
                    startGame();
                }
            }
            case Utilisateur utilisateur -> {
            }
            case Admin admin -> {
            }
            default -> {
                System.out.println("Identifiants invalides");
                //unknown need to create an account or get back to the login and password

                String name = single.inputString("Donner votre nom:");
                Utilisateur user = new Utilisateur(login,password,name);
                startGame();
            }
        }

        initializePlanetarySystem();

    }

    public static void initializePlanetarySystem(){
        int numberPlanet = rand.nextInt(8,15);
        System.out.println(numberPlanet);

        List<PlanetSeed> pnatetarySystem = new ArrayList<>();
        for (int i = 0; i < numberPlanet; i++) {
            //TODO add the random choice of the planets
            pnatetarySystem.add(new PlanetSeed(0,0,30,));
        }

    }

    public static void Game() {


    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        startGame();

    }

}
