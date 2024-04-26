public class MorseTester {
    public static void main(String[] args){
        MorseTree root = new MorseTree();
        root.root.setLeft(new TreeNode<String>("e"));
        root.root.setRight(new TreeNode<String>("t"));
        root.root.getLeft().setLeft(new TreeNode<String>("i"));
        root.root.getLeft().setRight(new TreeNode<String>("a"));
        root.root.getRight().setLeft(new TreeNode<String>("n"));
        root.root.getRight().setRight(new TreeNode<String>("m"));
        root.root.getLeft().getLeft().setLeft(new TreeNode<String>("s"));
        root.root.getLeft().getLeft().setRight(new TreeNode<String>("u"));
        root.root.getLeft().getRight().setLeft(new TreeNode<String>("r"));
        root.root.getLeft().getRight().setRight(new TreeNode<String>("w"));
        root.root.getRight().getLeft().setLeft(new TreeNode<String>("d"));
        root.root.getRight().getLeft().setRight(new TreeNode<String>("k"));
        root.root.getRight().getRight().setLeft(new TreeNode<String>("g"));
        root.root.getRight().getRight().setRight(new TreeNode<String>("o"));
        root.root.getLeft().getLeft().getLeft().setLeft(new TreeNode<String>("h"));
        root.root.getLeft().getLeft().getLeft().setRight(new TreeNode<String>("v"));
        root.root.getLeft().getLeft().getRight().setLeft(new TreeNode<String>("f"));
        root.root.getLeft().getRight().getLeft().setLeft(new TreeNode<String>("l"));
        root.root.getLeft().getRight().getRight().setLeft(new TreeNode<String>("p"));
        root.root.getLeft().getRight().getRight().setRight(new TreeNode<String>("j"));
        root.root.getRight().getLeft().getLeft().setLeft(new TreeNode<String>("b"));
        root.root.getRight().getLeft().getLeft().setRight(new TreeNode<String>("x"));
        root.root.getRight().getLeft().getRight().setLeft(new TreeNode<String>("c"));
        root.root.getRight().getLeft().getRight().setRight(new TreeNode<String>("y"));
        root.root.getRight().getRight().getLeft().setLeft(new TreeNode<String>("z"));
        root.root.getRight().getRight().getLeft().setRight(new TreeNode<String>("q"));


        System.out.println(root.preorder());
        System.out.println(root.postorder());

        String stuff = "what the sigma";
        System.out.println(stuff);
        stuff = root.morse(stuff);
        System.out.println(stuff);
        stuff = root.english(stuff);
        System.out.println(stuff);
    }
}