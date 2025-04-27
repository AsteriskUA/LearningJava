package OOP;

public class TaskBook {
    String BookName;
    String autor;
    int page;
    boolean isNotfiction;

    public TaskBook(String bookName, String autor, int page, boolean isNotfiction) {
        BookName = bookName;
        this.autor = autor;
        this.page = page;
        this.isNotfiction = isNotfiction;
    }

    public void printCountRows(){
        System.out.println("Кількість строк в книзі: " + this.page * 40);
    }

    public void printCountRows(int countRowsPage){
        System.out.println("Кількість строк в книзі: " + this.page * countRowsPage);
    }

    public void printInfo(){
        System.out.printf("%s out of %s - %s\n",this.BookName, this.autor,
                this.isNotfiction ? "Історична" : "Не історична");
            printCountRows();
    }




}
