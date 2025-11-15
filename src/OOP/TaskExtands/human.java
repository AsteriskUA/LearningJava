package OOP.TaskExtands;

public abstract class human {

    private boolean isMan;

    public human(boolean isMan){
        this.isMan = isMan;
    }

    public boolean isMan(){
        return isMan;
    }

    public abstract void getSalery();

}

