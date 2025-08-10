package Objects;

import java.awt.*;

public class Tree {
    private double height;
    private double trunkDiameter;
    private TreeType treetype;
    protected static Color TrunkColor = new Color(85, 40, 40);

    public Tree(double heigh,double trunkDiameter,TreeType treetype){
        this.height = heigh;
        this.trunkDiameter = trunkDiameter;
        this.treetype = treetype;
    }
    public void grow() {
        this.height = this.height + 10;
        this.trunkDiameter = this.trunkDiameter + 1;
    }
    static void announceTree(){
        System.out.println("Look out for that tree!"+TrunkColor);
    }

    public void annouceTallTree(){
        if(this.height>20){
            System.out.println(this.treetype+" tree is too big");
        }
    }
    public double getHeight() {
        return height;
    }
    public double getTrunkDiameter() {
        return trunkDiameter;
    }
    public void setTrunkDiameter(double trunkDiameter) {
        this.trunkDiameter = trunkDiameter;
    }
    public TreeType getTreetype() {
        return treetype;
    }
}
