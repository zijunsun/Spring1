import service.Poem;
import service.impl.Juggler;

/**
 * Created by SUN on 2016/11/17.
 */
public class PoeticJuggler extends Juggler {
    private Poem poem;

    public PoeticJuggler(Poem poem){
        super();
        this.poem = poem;
    }

    public PoeticJuggler(int beanBags,Poem poem){
        super(beanBags);
        this.poem = poem;
    }
    public void perform() throws Exception{
        super.perform();
        System.out.println("  while reciting...");
        poem.recite();
    }

}
