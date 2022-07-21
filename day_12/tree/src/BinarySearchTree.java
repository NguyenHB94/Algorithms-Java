public class BinarySearchTree {
    //Duyệt pre-order
    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        //Duyệt gốc
        System.out.print(root.value + "\t");

        //Duyệt trái
        preOrder(root.left);

        //Duyệt phải
        preOrder(root.right);
    }

    //Duyệt in-order
    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        //Duyệt trái
        inOrder(root.left);
        //Duyệt gốc
        System.out.print(root.value + "\t");
        //Duyệt phải
        inOrder(root.right);
    }

    //Duyệt post-order
    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        //Duyệt trái
        postOrder(root.left);
        //Duyệt phải
        postOrder(root.right);
        //Duyệt gốc
        System.out.print(root.value + "\t");
    }

    public TreeNode insert(TreeNode root, int value) {
        TreeNode newNode = new TreeNode(value);
        if (root == null) {
            root = newNode;
        } else {
            TreeNode temp = root;
            while (true) {
                if (value > temp.value) {
                    if (temp.right == null) {
                        temp.right = newNode;
                        break;
                    } else {
                        temp = temp.right;
                    }
                }else {
                    if (temp.left == null) {
                        temp.left = newNode;
                        break;
                    } else {
                        temp = temp.left;
                    }
                }
            }
        }

        return root;

    }

    public TreeNode remove(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        //Tìm node cần xoá
        if (key < root.value) {// key nằm bên trái node gốc
            root.left = remove(root.left, key);
        } else if (key > root.value) {//key nằm ở phía bên phải của node gốc
            root.right = remove(root.right, key);
        } else {// key = root.value
            //TH1 node cần xoá là node lá
            if (root.left == null && root.right == null) {
                return null;
            }

            //TH2 node cần xoá có 1 node con
            if (root.left != null && root.right == null) {//node con nằm bên trái
                return root.left;
            }
            if (root.left == null && root.right != null) {//node con nằm phía bên phải
                return root.right;
            }

            //TH3 node cần xoá có 2 node con
            TreeNode leftNode = finLeftNode(root.right);
            root.value = leftNode.value;
            root.right = remove(root.right, leftNode.value);
        }

        return root;
    }

    public TreeNode finLeftNode(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode leftNode = root;
        while (leftNode.left != null) {
            leftNode = leftNode.left;
        }
        return leftNode;
    }
}
