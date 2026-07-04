import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;


class JTreedemo extends JFrame
 {
    JTreedemo()
	{
        setLayout(new BorderLayout());

        DefaultMutableTreeNode top = new DefaultMutableTreeNode("A");
        DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("a1");
        DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("a2");

        DefaultMutableTreeNode B = new DefaultMutableTreeNode("B");
        DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("b1");
        DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("b2");

        top.add(a1);
        top.add(a2);
        top.add(B);  
        B.add(b1);
        B.add(b2);

        JTree tree = new JTree(top); 

        JScrollPane scrollPane = new JScrollPane(tree);
        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
        setSize(500, 500);
        setTitle("JTree Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        new JTreedemo();
    }
}
