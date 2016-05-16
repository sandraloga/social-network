import java.util.ArrayList;
/**
 * Write a description of class MessagePost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MessagePost extends Post
{

    private String message;
    

    /**
     * Constructor for objects of class MessagePost
     */
    public MessagePost(String author, String text)
    {
        super(author);
        message = text;

    }

    /**
     * Metodo que devuelve el mensaje del post
     */
    public String getText(){
        return message;
    }


    public void printShortSummary()
    {
        System.out.println ("Esto es un post creado por " + getUsername());
    }

}