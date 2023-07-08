import astra.core.Module;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class ListHelper {
    public List<String> list = new ArrayList();
    public String toAdd = "";
    public ListHelper(){
    }
    public void addToList(){
        list.add(toAdd);
        toAdd = "";
    }

    public void randomize(){
        Collections.shuffle(list);
        int randomNum = ThreadLocalRandom.current().nextInt(2, list.size() + 1);
        list  = list.subList(0, randomNum);
    }

    public void clear(){
        list = new ArrayList();
    }
}
