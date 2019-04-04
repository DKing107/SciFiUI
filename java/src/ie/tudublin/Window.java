package ie.tudublin;
import processing.core.PApplet;

public class Window{
    UI ui;
    private int x = 390;
    private int y = 25;
    private int width = 350;
    private int height = 370;

    public Window(UI ui){
        this.ui = ui;
    }

    public void render()
    {

      //draw walls  
      ui.stroke(255,255,0);
      ui.noFill();
      ui.rect(x, y, width, height);

      //draw horizontal wall lines
      ui.line((x + width / 2) + 20,(height  / 2 + y) + 42,(x + width / 2) + 20,(height / 2 + y) - 42);
      ui.line((x + width / 2) + 40,(height  / 2 + y) + 82,(x + width / 2) + 40,(height / 2 + y) - 82);
      ui.line((x + width / 2) + 80,(height  / 2 + y) + 168,(x + width / 2) + 80,(height / 2 + y) - 168);
      ui.line((x + width / 2) + 140,height + y,(x + width / 2) + 140,y);
      ui.line((x + width / 2) - 20,(height  / 2 + y) + 42,(x + width / 2) - 20,(height / 2 + y) - 42);
      ui.line((x + width / 2) - 40,(height  / 2 + y) + 82,(x + width / 2) - 40,(height / 2 + y) - 82);
      ui.line((x + width / 2) - 80,(height  / 2 + y) + 168,(x + width / 2) - 80,(height / 2 + y) - 168);
      ui.line((x + width / 2) - 140,height + y,(x + width / 2) - 140,y);

      //draw floor lines
      ui.line(x + width / 4 + 8,y + height - 16,x + width - width / 4 - 8,y + height - 16);
      ui.line(x + width / 2 + 40,y + height - 102,x + width - width / 2 - 40,y + height - 102);
      ui.line(x + width / 2 + 20,y + height - 142,x + width - width / 2 - 20,y + height - 142);
      
      //draw vertical wall lines
      ui.line(x + width / 4, y, x + width / 2, height  / 2 + y);
      ui.line(x + width / 16, y, x + width / 2, height  / 2 + y);
      ui.line(x, y + height / 4, x + width / 2, height  / 2 + y);
      ui.line(x, y + height - height / 4, x + width / 2, height  / 2 + y);
      ui.line(x, y + height - height / 4, x + width / 2, height  / 2 + y);
      ui.line(x + width / 16, y + height, x + width / 2, height  / 2 + y);
      ui.line(x + width / 4, y + height, x + width / 2, height  / 2 + y);
      ui.line(x + width - width / 4, y, x + width / 2, height  / 2 + y);
      ui.line(x + width  - width / 16, y, x + width / 2, height  / 2 + y);
      ui.line(x + width, y + height / 4, x + width / 2, height  / 2 + y);
      ui.line(x + width - width / 4,y + height , x + width / 2, height  / 2 + y);
      ui.line(x + width - width / 16,y + height , x + width / 2, height  / 2 + y);
      ui.line(x + width, y + height - height / 4, x + width / 2, height  / 2 + y);
   
    }


}