
/**
 * Write a description of class JoinGroupPost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class  JoinGroupPost extends Post
{
    // instance variables - replace the example below with your own
    private String  grupo;

    /**
     * Constructor for objects of class JoinGroupPost
     */
    public JoinGroupPost(String autor , String grupo)
    {
        super(autor);
        this.grupo = grupo;

    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getGrupo()
    {
        // put your code here
        return grupo;
    }

}
