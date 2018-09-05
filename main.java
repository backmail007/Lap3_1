
import javax.swing.*;

public class main {
    public static void main(String[] args) {
        int ans = JOptionPane.showConfirmDialog(null,"รักหรือเปล่า",
                "ถามเธอ",JOptionPane.YES_NO_OPTION);

        if(ans == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"Love You");
        }
        else{
            JOptionPane.showMessageDialog(null,"What The Fuck","",JOptionPane.ERROR_MESSAGE);
        }
    }
}
