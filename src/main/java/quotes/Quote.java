package quotes;

public class Quote {
    String[] tags;
    String author;
    String likes;
    String text;

    public Quote(String[] tags, String author, String likes, String text){
        this.tags = tags;
        this.author = author;
        this.likes = likes;
        this.text = text;
    }

    public Quote(String text){
        this.text = text;
        this.author = "Ron Swanson";
    }

    public String toString(){
        return String.format("%s - %s", text, author);
    }
}
