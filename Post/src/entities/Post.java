package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private String title;
    private String content;
    private int likes;

    private List<Comment> commentList = new ArrayList<>();

    public Post(Date moment, String title, String content, int likes) {
        this.moment = moment;
        this.title = title;
        this.likes = likes;
        this.content = content;
    }

    public void removeComment(Comment comment){
        commentList.remove(comment);
    }

    public void AddComment(Comment comment){
        commentList.add(comment);
    }
    public Date getMoment() {
        return moment;
    }

    public String getTitle() {
        return title;
    }

    public int getLikes() {
        return likes;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title+"\n");
        sb.append(likes);
        sb.append( "Likes - ");
        sb.append(sdf.format(moment)+"\n");
        sb.append(content+"\n");
        sb.append("Comments: \n");
        for(Comment c: commentList){
            sb.append(c.getText()+"\n");
        }

        return sb.toString();
    }

}
