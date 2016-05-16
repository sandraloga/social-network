import java.util. ArrayList;
/**
 * Write a description of class CommentPost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CommentPost
{
    // instance variables - replace the example below with your own
    private ArrayList<String> comments;

    /**
     * Constructor for objects of class CommentPost
     */
    public CommentPost()
    {
        // initialise instance variables
        comments = new ArrayList<>();
    }

    /**
     * Metodo para añadir un comentario al post
     */
    public void addComment(String text){
        comments.add(text);
    }
}
