import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Partie {
    private static ArrayList<Question> questions = new ArrayList<>();
    private static ArrayList<Reponse> reponses = new ArrayList<>();
    private static int points;
    private static Level level = new Level(0);

    public static ArrayList<Question> getQuestions() {
        return questions;
    }

    public static void setQuestions(ArrayList<Question> questions) {
        Partie.questions = questions;
    }

    public static ArrayList<Reponse> getReponses() {
        return reponses;
    }

    public static int getPoints() {
        return points;
    }

    public static void setPoints(int points) {
        Partie.points = points;
    }

    public static Level getLevel() {
        return level;
    }
    public static int getLevelNum() {
        return level.getNum();
    }

    public static void setLevel(Level level) {
        Partie.level = level;
    }
    public static void setLevelNum(int num) {
        Partie.level.setNum(num);
    }

    public static ArrayList<Reponse> getReponse() {
        return reponses;
    }

    public static void setReponses(ArrayList<Reponse> reponse) {
        Partie.reponses = reponse;
    }

    public static void init(int numLvl) throws Exception{

        File file = new File("Lvl"+numLvl+".txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line = "";
        Boolean isQ = true;
        while((line = bufferedReader.readLine())!=null){
            if(isQ){
                questions.add(new Question(line));
                isQ=false;
            }
            else{
                Reponse rep = new Reponse(line);
                reponses.add((rep));
                questions.get(questions.size()-1).setAssocie(rep);
                isQ=true;
            }

        }
    }
    public static int analyse(String reponseU,Reponse reponse){
        if(filtered(reponseU)==filtered(reponse.getContenu())){
            points+=calculPoints(getLevelNum(),getLevel().getCoeff());
            return 0;
        }
        else if(Integer.valueOf(reponseU)>0 && Integer.valueOf(reponseU)<21) {
        	return 0;
        }return -1;
    }
    public static int filtered(String reponse){
        return Integer.valueOf(reponse);
    }
    public static int calculPoints(int lvl, int coeff){
        return lvl*2*coeff;
    }
    public static void startGame(int nbLvl) throws Exception{
        for(int a=1;a<=nbLvl;a++) {
            Partie.init(a);
            Partie.getLevel().nextLvl();
            System.out.println("################ Niveau "+a+" ################");
            
            for (int i = 0; i < 5; i++) {
                String reponseUser = "";
                Scanner sc = new Scanner(System.in);
                Random rand = new Random();
                Question question = Partie.getQuestions().get(rand.nextInt(Partie.getQuestions().size() - 1));
                System.out.println(question.getContenu());
                reponseUser = sc.nextLine();
                while(Partie.analyse(reponseUser, question.getAssocie())==-1) {
                	System.out.println("Veuillez retaper un chiffre entre 1 et 20");
                	reponseUser = sc.nextLine();
                };
                System.out.println("Votre score actuel :"+Partie.getPoints());
            }
        }
        endMessage();
    }
    public static void endMessage(){
        int points = Partie.points;
        int etoiles = 0;
        boolean estimation=true;
        if(points>=50){
            etoiles+=1;
        }
        if(points>=100){
            etoiles+=1;
        }
        if(points>=250){
            etoiles+=1;
        }
        if(points>=450){
            etoiles+=1;
        }
        if(points>=600){
            etoiles+=1;
        }
        if(points>=700){
            etoiles+=1;
        }
        System.out.println("####### Votre score est de : "+etoiles+" sur 5 #######");
    }
}
