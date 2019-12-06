public class Question extends QA{
    private Reponse associe;
    public Question(String contenu) {
        super(contenu);
    }
    public Question(String contenu, Reponse associe) {
        super( contenu);
        this.associe = associe;
    }
        public Reponse getAssocie() {
        return associe;
    }

    public void setAssocie(Reponse associe) {
        this.associe = associe;
    }
}
