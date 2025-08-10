package Objects;

import java.awt.*;

public class Tree {
    double height;
    double trunkDiameter;
    TreeType treetype;
    static Color TrunkColor = new Color(85, 40, 40);

    Tree(double heigh,double trunkDiameter,TreeType treetype){
        this.height = heigh;
        this.trunkDiameter = trunkDiameter;
        this.treetype = treetype;
    }
    void grow() {
        this.height = this.height + 10;
        this.trunkDiameter = this.trunkDiameter + 1;
    }
    static void announceTree(){
        System.out.println("Look out for that tree!"+TrunkColor);
    }

    void annouceTallTree(){
        if(this.height>20){
            System.out.println(this.treetype+" tree is too big");
        }
    }
}
