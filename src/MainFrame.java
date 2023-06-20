import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MainFrame {
    public static void main(String[] args)  {
        JFrame obj = new JFrame( );
        Gameplay gameplay = new Gameplay();
        ImageIcon icon = new ImageIcon("C:\\Users\\katar\\OneDrive\\Desktop\\BrickBacker\\BrickBacker\\images.jpeg");
        obj.setIconImage(icon.getImage());
        obj.setBounds(10, 10, 700, 600);
        obj.setTitle("Breakout Ball");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gameplay);
    }
}
