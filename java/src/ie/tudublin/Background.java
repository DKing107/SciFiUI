package ie.tudublin;
import processing.core.PApplet;

public class Background extends PApplet{
    UI ui;

    public Background(UI ui){
        this.ui = ui;
    }

    public void render(){
      
        ui.colorMode(HSB);
    }
       
    



}