class Book{
    private int id;
    private String title;
    private String author;
    private int pagesCount;

    public Book(){
        this.id = 0;
        this.title = null;
        this.author = null;
        this.pagesCount = 0;
    }

    public Book(int id, String title, String author, int pagesCount){
        this.id = id;
        this.title = title;
        this.author = author;
        this.pagesCount = pagesCount;
    }

    public Book setId(int id){
        this.id = id;
        return this;
    }

    public int getId(){
        return this.id;
    }

    public Book setTitle(String title){
        this.title = title;
        return this;
    }

    public String getTitle(){
        return this.title;
    }
    
    public Book setAuthor(String author){
        this.author = author;
        return this;
    }

    public String getAuthor(){
        return this.author;
    }

    public Book setPagesCount(int pagesCount){
        this.pagesCount = pagesCount;
        return this;
    }

    public int getPagesCount(){
        return this.pagesCount;
    }

    public void print(){
        System.out.println(this.title);
    }
}

    public class ClassVSObjectSetGet{
    public static void main(String[] args) {
       Book myBook = new Book();
       myBook.setId(5).setAuthor("AAA").setTitle("java").setPagesCount(100).print();
    }

}
