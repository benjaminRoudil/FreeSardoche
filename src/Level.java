public class Level {
    private int coeff=1;
    private int num;

    public Level(int coeff, int num) {
        this.coeff = coeff;
        this.num = num;
    }
    public Level(int num) {
        this.num = num;
    }
    public int getCoeff() {
        return coeff;
    }

    public void setCoeff(int coeff) {
        this.coeff = coeff;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    public void nextLvl(){
        this.num+=1;
        this.coeff+=1;

    }
}
