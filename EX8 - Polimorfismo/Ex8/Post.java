package Ex8;
import java.util.Date;

public class Post {
    private String title;
    private Date date;
    private String content;
    private int likes;
    private int dislikes;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDate() {
        this.date = new Date();
    }

    public Date getDate() {
        return date;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void like() {
        this.likes++;
    }

    public int getLikes() {
        return likes;
    }

    public void dislike() {
        this.dislikes++;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void show() {
        System.out.println("Título: " + title);
        System.out.println("Data: " + date);
        System.out.println("Conteúdo: " + content);
        System.out.println("Likes: " + likes);
        System.out.println("Dislikes: " + dislikes);
    }
}
