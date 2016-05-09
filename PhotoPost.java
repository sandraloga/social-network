import java.util.ArrayList;
/**
 * Write a description of class PhotoPost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhotoPost
{
    // instance variables - replace the example below with your own
    private String username;
    private String filename;
    private String caption;
    private int likes;
    private long timeStamp;
    private ArrayList<String> comments;

    /**
     * Constructor for objects of class PhotoPost
     */
    public PhotoPost(String autor , String filname , String caption)
    {
        username = autor;
        this.filename = filename;
        this.caption = caption;
        likes = 0;
        timeStamp = System.currentTimeMillis();
        comments = new ArrayList<>();
    }

    /**
     * contador de "Me gusta"
     */
    public void like()
    {
        likes++;
    }

    /**
     * contador de "no me gusta"
     */
    public void unlike()
    {
        likes--;
    }

    /**
     * añade un comentario al arraylist
     */
    public void addCommnet(String text)
    {
        comments.add(text);
    }

    /**
     * devuelve el nombre del archivo
     */
    public String getImageFile()
    {
        return filename;
    }

    /**
     * devuelve la cabecera de la foto
     * 
     */
    public String getCaption()
    {
        return caption;
    }

    /**
     * tiempo trascurido desde 1970
     */
    public long getTimeStamp()
    {
        return (System.currentTimeMillis()- timeStamp)/1000;
    }

    /**
     * mustra todos los datos de la foto
     */
    public void display()
    {
        System.out.println("DATOS DEL MENSAJE");
        System.out.println("==================");
        System.out.println("Autor: " + username);
        System.out.println("Nombre foto: " + filename);
        System.out.println ("Nº likes: " + likes);
        System.out.println ( "Cabecera: " +  caption);

    }

    /**
     * texto del tiempo transcurrido
     */
    public String timeString(long time)
    {
        long minutos = (getTimeStamp() /60);
        long segundos = (getTimeStamp() %60);
        String timeString = "Segundos: " + segundos + " mMnutos: " + minutos;
        return timeString;
    }
}
