package Ex8;
public class News extends Post{
    private String source;

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return source;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("News Source: " + source);
    }
}
