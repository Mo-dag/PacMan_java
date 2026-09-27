//Idean här att skapa en klass som ärver JPanel klass
//Denna klass är en version av JPanel fast vi kan addera mer egenskaper

//PacMan-klassen = spelmotorn/spelområdet
//        ├── karta
//        ├── väggar hashset
//        ├── mat    hashset
//        ├── spöken hashset
//        └── Pac-Man

import javax.swing.*;
import java.awt.*;
import java.util.HashSet;

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

    // Vi kommer att skapa hash set för att kolla vad PacMan träffar i reeltid.

    PacMan(){
        setPreferredSize(new Dimension(boardWidth,boardHeight));
        setBackground(Color.BLACK);


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
    //(x, y) = var ritningen börjar
    //width  = hur långt åt höger
    //height = hur långt ned

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
    class block {
        int x;
        int y;
        int width;
        int height;
        Image image;
        // När spelet igång, x,y kommer att ändras. Därför skulle vi spara de start punkter.
        int startX;
        int startY;

        block(Image image, int x, int y, int width, int height) {
            this.image = image;
            this.height = height;
            this.width = width;
            this.x = x;
            this.y = y;
            // När någon skapar ett objekt med konstruktorn och skickar in värden,
            // sparas de värdena i objektets instansvariabler.
            // Objektet får de variabler som klassen definierar.
        }
    }
    HashSet <block> walls;
    HashSet<block> food;
    HashSet<block> ghosts;
    block pacman;
    //HashSet : samling
    //block   : vilken typ objekt skulle den innehålla
    //walls   : namnet på samlingen
    String [] tileMap = {
        "XXXXXXXXXXXXXXXXXXX",
        "X        X        X",
        "X XX XXX X XXX XX X",
        "X                 X",
        "X XX X XXXXX X XX X",
        "X    X       X    X",
        "XXXX XXXX XXXX XXXX",
        "OOOX X       X XOOO",
        "XXXX X XXrXX X XXXX",
        "O       bpo       O",
        "XXXX X XXXXX X XXXX",
        "OOOX X       X XOOO",
        "XXXX X XXXXX X XXXX",
        "X        X        X",
        "X XX XXX X XXX XX X",
        "X  X     P     X  X",
        "XX X X XXXXX X X XX",
        "X    X   X   X    X",
        "X XXXXXX X XXXXXX X",
        "X                 X",
        "XXXXXXXXXXXXXXXXXXX" 
    };
   //Vi kommer att hantera element : Y»» vilken rad , X»» vilken kolumn
   //DvS : tilaMap[y].charAt(x);
   

}
