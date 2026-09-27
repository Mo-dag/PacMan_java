import javax.swing.*;

public class App {
    public static void main(String[] args)throws Exception{


        JFrame frame = new JFrame("Pac Man");
        //frame.setSize(boardWidth,boardHeight); »» frame.pack(); löser detta genom att importera den från PacMan»»setPreferredSize.

        frame.setResizable(false);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PacMan pacman = new PacMan();
        frame.add(pacman);
        frame.pack(); // Gör att JFrame anpassa sig efter panelens storlek.
        // Swing ritar bilder på pixel positioner så : tile posit(x,y) »» pixelX = x*32, pixelY = y*32
        frame.setLocationRelativeTo(null);//Bättre vara efter frame.pack();
        frame.setVisible(true);//Bättre vara efter frame.pack()/setLocationRelatedTo();



    }

}
