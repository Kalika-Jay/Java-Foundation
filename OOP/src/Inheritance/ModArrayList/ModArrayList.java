package Inheritance.ModArrayList;

public class ModArrayList {
    private String[] ArrayList;

    public String getUsingMod(int index){
        if(index<0){
            index = Math.abs(index);
        }
        if(index>= ArrayList.length){
            index = index % ArrayList.length;
        }
        return ArrayList[index];
    }
}
