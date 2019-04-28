package ie.tudublin;
import processing.core.PApplet;
import java.util.Random;

public class Buttons extends PApplet{
    private int x = 400;
    private int y = 400;
    private int w = 30;
    private int h = 30;
    private int number = 0;
    private float dx = 1;
    UI ui;

    public Buttons(UI ui)
    {    
        this.ui = ui;
    }

    public void render(){
        Random rand = new Random();
        int value1 = rand.nextInt(255);
        int value2 = rand.nextInt(255);
        int value3 = rand.nextInt(255);
        ui.stroke(0,0,0,0);
        ui.fill(value1,value2,value3,50);
        ui.textSize(24);
        ui.rect(x -30,y + 15,w,h);
        ui.rect(x- 30,y + 15,w * 2,h);
        ui.rect(x - 30,y + 15,w,h * 2);
        ui.rect(x - 30,y + 15,w * 2,h *2);
        ui.fill(169,169,169);
        ui.text(value1,x - 20 ,y + 55);

        int value4 = rand.nextInt(255);
        int value5 = rand.nextInt(255);
        int value6 = rand.nextInt(255);
        ui.stroke(0,0,0,0);
        ui.fill(value4,value5,value6,50);
        ui.textSize(24);
        ui.rect(x + 300,y + 15,w,h);
        ui.rect(x + 300,y + 15,w * 2,h);
        ui.rect(x + 300,y + 15,w,h * 2);
        ui.rect(x + 300,y + 15,w * 2,h *2);
        ui.fill(169,169,169);
        ui.text(value1,x + 310 ,y + 55);

        ui.stroke(255,140,0);
        ui.fill(value4,value5,value6,50);
        ui.rect(x  + 65,y + 50,w + 170,h + 5);
        ui.fill(255, 0, 0);
        ui.text(number, x + 140, y + 77);
    }

    public void update(){
        number += dx;
    }

}