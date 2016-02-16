package foo.bar;

/**
 * Created by etc on 20.03.2015.
 */
public class Poem {

    public Poem(String textPoem) {
        this.textPoem = textPoem;
    }

    private String textPoem;

    public void recite(){
        System.out.println(textPoem);
    }

}
