package training;


public class Time {

    int ido;
    int kido;
    int ora;
    int kora;
    int perc;
    int kperc;
    int masodperc;
    boolean korabban;
    int elso;
    int masodik;

    public  int getInMinutes() {
        return ido / 60;
    }
    public  int getInSeconds() {
        return ido;
    }
    public String earlierThan() {
        return elso > masodik ? "Igaz" : "Hamis";
    }

    public int elso (int ora,int perc,int masodperc) {
        this.ora =  ora;
        this.perc = perc;
        this.masodperc = masodperc;
        return elso;
    }
    public int masodik (int ora,int perc,int masodperc) {
        this.ora =  ora;
        this.perc = perc;
        this.masodperc = masodperc;
        return elso;
    }
}
