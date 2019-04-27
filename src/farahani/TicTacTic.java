package farahani;

import javax.swing.*;

public class TicTacTic extends JFrame {
    static Boolean result;
    static int countX;
    static int countO;
    static boolean flag;
    JButton[] jbArray;
    JButton[] jbArrayResult;

    /**
     * Creates new form TicTacTic
     */
    public TicTacTic() {
        setfuture();

        initComponents();
        this.jbArray = new JButton[]{jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8,
                jButton9};
        this.jbArrayResult = new JButton[]{jButton12, jButton13, jButton14, jButton15, jButton16, jButton17,
                jButton18, jButton19, jButton20};

        resetGame();
    }
}
