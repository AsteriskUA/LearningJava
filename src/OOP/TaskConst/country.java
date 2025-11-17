package OOP.TaskConst;

public class country {
    private long countPeaple;
    private String langvege;
    private String continente;

    public long getCountPeaple() {
        return countPeaple;
    }

    public String getLangvege() {
        return langvege;
    }

    public String getContinente() {
        return continente;
    }

    public country(long countPeaple, String langvege, String continente) {
        this.countPeaple = countPeaple;
        this.langvege = langvege;
        this.continente = continente;
    }
}

