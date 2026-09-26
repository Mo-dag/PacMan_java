//Idean här att skapa en klass som ärver JPanel klass
//Denna klass är en version av JPanel fast vi kan addera mer egenskaper


import javax.swing.*;
import java.awt.*;

/*
   javax.swing
   └── JPanel
         ↑
         │ ärvs av
       PacMan
    * */
public class PacMan extends JPanel {
    private int row = 21;
    private int column = 19;
    private int tileSize = 32;
    private int boardHeight = row * tileSize;
    private int boardWidth = column * tileSize;


    // För the images vi kommer att skapa variabler för att lagra images.
    private Image wallImage;
    private Image blueGhostImage;
    private Image orangeGhostImage;
    private Image redGhostImage;
    private Image pinkGhostImage;


    //PacMan image, den har fyra olika
    private Image pacmanUpImage;
    private Image pacmanDownImage;
    private Image pacmanRightImage;
    private Image pacmanLeftImage;



    PacMan(){
        setPreferredSize(new Dimension(boardWidth,boardHeight));
        setBackground(Color.BLACK);
        //(x, y) = var ritningen börjar
        //width  = hur långt åt höger
        //height = hur långt ned
        
        //klass = mall/struktur

        //GameObject
        //├── x
        //├── y
        //├── width
        //├── height
        //└── image
        // När vi skapar en klass är det ungefär som att skapa en struct. 
        // Nästa steg är att skapa många obj från den. Vi slipper seperera variabler för varje obj.

        class block{
         int x;
         int y;
         int width;
         int height;
         Image image;
        }
     
        //Ladda Images :
        wallImage = new ImageIcon(getClass().getResource("./wall.png")).getImage();
        blueGhostImage = new ImageIcon(getClass().getResource("./blueGhost.png")).getImage();
        redGhostImage = new ImageIcon(getClass().getResource("./redGhost.png")).getImage();
        orangeGhostImage = new ImageIcon(getClass().getResource("./orangeGhost.png")).getImage();
        pinkGhostImage = new ImageIcon(getClass().getResource("./pinkGhost.png")).getImage();

        pacmanUpImage = new ImageIcon(getClass().getResource("./pacmanUp.png")).getImage();
        pacmanDownImage = new ImageIcon(getClass().getResource("./pacmanDown.png")).getImage();
        pacmanRightImage=new ImageIcon(getClass().getResource("./pacmanRight.png")).getImage();
        pacmanLeftImage=new ImageIcon(getClass().getResource("./pacmanLeft.png")).getImage();

        String[][] tileMap = new String[row][column];
    }


}
