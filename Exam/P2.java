class Book{
    private String Title;
    
    public void DisplayBookTitle(String Title){
        this.Title=Title;
    }

    public void show(){
        System.err.println(this.Title);
    }
    
}

class Novel extends Book{
    private String Authorname;
    Novel(String Authorname){
        this.Authorname=Authorname;
    }

    public void showBook(){
        System.out.println(this.Authorname);
    }
}
class Comic extends Book{
    private String Authorname;
    Comic(String Authorname){
        this.Authorname=Authorname;
    }
    public void showBook(){
        System.out.println(this.Authorname);
    }
    
}

public class P2 {
    // book class
    public static void main(String[] args) {
        Book b;
        Novel n=new Novel("v");
        Comic c=new Comic("vandan");
        b=n;
        b=c;
        c.DisplayBookTitle("hands on ml");
        n.DisplayBookTitle("Deep");
        c.show();
        n.show();
        c.showBook();
        n.showBook();
    }

    
}
