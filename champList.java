import java.util.*;

public class champList {
    
    private HashMap<String, Champion> list;    

    public champList(int size) {
        this.list = new HashMap<String, Champion>();
    }

    public Champion getChamp(String name) {
        return list.get(name);
    }

    public void addChamp(String name, Champion champ) {
        list.add(name, champ);
    }
}
