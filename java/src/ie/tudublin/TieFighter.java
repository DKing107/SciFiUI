package ie.tudublin;
import processing.core.PApplet;

public class TieFighter{
    UI ui;
    private int x = 500;
    private int y = 575;

    public TieFighter(UI ui){
        this.ui = ui;
    }

    public void render(){


        ui.stroke(0,0,225);
        ui.line(x + 50, y, x + 200,y);
        ui.line(x + 50, y, x - 10,y + 100);
        ui.line(x + 200,y,x + 260,y + 100);

        ui.line(x + 50, y + 190, x + 200,y + 190);
        ui.line(x + 50, y + 190, x - 10,y + 100);
        ui.line(x + 200,y + 190,x + 260,y + 100);

        ui.line(x + 50, y, x + 200,y + 190);
        ui.line(x + 200,y, x + 50, y + 190);

        ui.stroke(176,196,222);
        ui.ellipse(x + 125, y + 95, 40,40);
        ui.ellipse(x + 125, y + 95, 80,80);
        ui.line(x + 125, y + 55, x + 125, y + 75);
        ui.line(x + 125, y + 115, x + 125, y + 135);
        ui.line(x + 85, y + 95, x + 105, y + 95);
        ui.line(x + 145, y + 95, x + 165, y + 95);
        ui.ellipse(x + 125, y + 95, 120,120);
        ui.rect(x + 15, y + 55, 25, 80);
        ui.rect(x + 210, y + 55, 25, 80);
        ui.line(x + 80, y + 54, x + 40, y + 70);
        ui.line(x + 170, y + 54, x + 210, y + 70);
        ui.line(x + 80, y + 134, x + 40, y + 120);
        ui.line(x + 170, y + 134, x + 210, y + 120);

        ui.rect(x - 5, y - 10 , 10, 210);
        ui.rect(x + 245, y - 10 , 10, 210);

        ui.line(x + 15, y + 60, x + 5, y);
        ui.line(x + 235, y + 60, x + 245, y);

        ui.line(x + 15, y + 130, x + 5, y + 185);
        ui.line(x + 235, y + 130, x + 245, y + 185);









    }


}