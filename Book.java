public abstract class Book {
    private int pages;
    private String title;
    
    public Book(int pages, String title) {
        this.pages = pages;
        this.title = title;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getPages() {
        return pages;
    }
    public String getTitle() {
        return title;
    }
}
