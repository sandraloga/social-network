import java.util.ArrayList;
/**
 * Write a description of class MessagePost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MessagePost
{
    // instance variables - replace the example below with your own
    private String username;
    private String message;
    private long timestamp;
    private int likes;
    private ArrayList<String> comments;

    /**
     * Constructor for objects of class MessagePost
     */
    public MessagePost(String author , String text)
    {
        username = author;
        message= text;
        likes = 0;
        comments = new ArrayList<>();
        timestamp = System.currentTimeMillis();
        // initialise instance variables

    }

    /**
     * contador de "Me gusta"
     */
    public void like()
    {
        likes++;
    }

    /**
     * contador de "No me gusta"
     */
    public void unlike()
    {
        likes--;
    }

    /**
     * añade comentario al arraylist
     */
    public void addComment(String text)
    {
        comments.add(text);
    }

    /**
     * devuekve el mensaje
     */
    public String getText()
    {
        return message;
    }

    /**
     * devuelve el tiempo transcurrido desde 1970
     */
    public long getTimeStamp()
    {
        return (System.currentTimeMillis()-timestamp)/1000;
    }

    /**
     * mmustra todos los datos
     */
    public void display()
    {
        System.out.println("DATOS DEL MENSAJE");
        System.out.println("==================");
        System.out.println("Autor: " + username);
        System.out.println("Mensaje: " + message);
        System.out.println ("Nº likes: " + likes);
        System.out.println ( "Duracion del mensaje: " 
            + getTimeStamp()/60 + " minutos " + getTimeStamp()%60 + " segundos");
        if (comments.size() == 0) {
            System.out.println("Este mensaje no tiene comentarios");
        }
        else {
            System.out.println("Comentarios: ");
            for (int i = 0; i < comments.size(); i++) {
                System.out.println(comments.get(i));
            }

        }
    }

    /**
     * muestra por pantalla tiempo trascurrido desde 1970 hasta ahora
     */
    public String timeString(long time)
    {
        long minutos = (getTimeStamp() /60);
        long segundos = (getTimeStamp() %60);
        String timeString = "Segundos: " + segundos + " Minutos: " + minutos;
        return timeString;
    }
}
