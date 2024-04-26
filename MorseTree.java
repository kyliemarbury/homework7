// kylie marbury-savage 
// tree homework to create morse code

public class MorseTree {
    public TreeNode<String> root = new TreeNode<String>("_");
    
    public MorseTree(){
       // this.root = null; literally breaks code 
    }
    public String preorder(){
        return root.preorder();
    }
    public String postorder(){
        return root.postorder();
    }
    public String english(String morseInput){
        TreeNode<String> current_node = this.root;
        String out = "";
        for (int i = 0; i < morseInput.length(); i++){
           System.out.println(current_node.getElement());
            if (morseInput.charAt(i)== 'o'){
                System.out.println("left");
                current_node = current_node.getLeft();
            } else if (morseInput.charAt(i) == '-'){
                System.out.println("right");
                current_node = current_node.getRight();
            } else if (morseInput.charAt(i) ==  '|'){
                System.out.println("done");
                out += current_node.getElement();
                current_node = this.root;
            }
            
        }
        return out;
    }
    public String morse(String englishInput){
        TreeNode<String> current_node = this.root;
        String out = "";
        int i = 0;
        while(i < englishInput.length()){
            System.out.println(englishInput.charAt(i) + "//" + current_node.getElement());
            if (String.valueOf(englishInput.charAt(i)).equals(current_node.getElement())){
                out += "|";
                i++;
                current_node = this.root;
            } else if (current_node.getLeft().isIn(String.valueOf(englishInput.charAt(i)))){
                out += "o";
                current_node = current_node.getLeft();
            } else if (current_node.getRight().isIn(String.valueOf(englishInput.charAt(i)))){
                out += "-";
                current_node = current_node.getRight();
            }
        }
        return out;
    }
}