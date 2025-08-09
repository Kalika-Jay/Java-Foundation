package Objects;

public class Tree {
    double height;
    double trunkDiameter;
    TreeType treetype;

    void grow() {
        this.height = this.height + 10;
        this.trunkDiameter = this.trunkDiameter + 1;
    }
}
