

package SnakeGame;

import java.awt.Image;
import javax.swing.ImageIcon;


public class gameImages {

    private Image menuImage, diedImage, backgroundImage, titleImage;

    public gameImages() {

        titleImage = new ImageIcon(getClass().getResource("Assets/snaketitle.png")).getImage();
        menuImage = new ImageIcon(getClass().getResource("Assets/menuscreen2.png")).getImage();
        diedImage = new ImageIcon(getClass().getResource("Assets/diedscreen.png")).getImage();
        backgroundImage = new ImageIcon(getClass().getResource("Assets/background1.jpg")).getImage();

    }

    public Image getMenuImage() {
        return menuImage;
    }


    public Image getDiedImage() {
        return diedImage;
    }


    public Image getBackgroundImage() {
        return backgroundImage;
    }


    public Image getTitleImage() {
        return titleImage;
    }


    
}
