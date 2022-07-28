package articles_02;

public class Article {
    //характеристики
    private String title;
    private String content;
    private String author;
    //конструктор
    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
    //функционалности
    public void edit(String newContent) {
        this.content = newContent;
    }

    public void changeAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public void rename(String newTitle) {
        this.title = newTitle;
    }

    @Override //искам да пренапиша някакъв метод
    public String toString() {
        return this.title + " - " + this.content + ": " + this.author;
    }
}