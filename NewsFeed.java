import java.util.ArrayList;
/**
 * Write a description of class NewsFeed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NewsFeed
{
    // instance variables - replace the example below with your own
    private ArrayList<MessagePost> messages;
    private ArrayList<PhotoPost> photos;

    /**
     * Constructor for objects of class NewsFeed
     */
    public NewsFeed()
    {
        // initialise instance variables
       messages = new ArrayList<>();
       photos = new ArrayList<>();
    }

    /**
     * 
     * añade un mensaje al array de mensajes
     */
    public void addMessagePost(MessagePost message)
    {
        messages.add(message);
        
    }
    /**
     * añade una foto al array de fotos
     */
    public void addPhotoPost(PhotoPost photo)
    {
        photos.add(photo);
    }
    /**
     * 
     */
    public void show()
    {
        for(int i = 0; i < messages.size(); i++){
            System.out.println(messages.get(i));
        }
        
        for(int i = 0; i < photos.size(); i++){
            System.out.println(photos.get(i));
        }
    }
}
