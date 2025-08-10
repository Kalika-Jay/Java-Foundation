package Objects;

public class Main {
    public static void main(String[] args) {
        Tree oakTree = new Tree(25,5,TreeType.OAK);
        Tree mapleTree = new Tree(30,6,TreeType.MAPLE);

        if(oakTree.height>20){
            System.out.println(oakTree.treetype+" tree is too big");
        }
        if(mapleTree.height>20){
            System.out.println(mapleTree.treetype+" tree is too big");
        }

        oakTree.annouceTallTree();

        System.out.println(Tree.TrunkColor);
        Tree.announceTree();
    }
}
