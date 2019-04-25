package ie.tudublin;
import processing.core.PApplet;
import java.util.Random;

public class TargetAcquired extends PApplet{
    UI ui;
    private int x = 390;
    private int y = 25;
    private int radius;
    private int width = 350;
    private int height = 370;

    public TargetAcquired(UI ui){
        this.ui = ui;
    }

    public void render(){

        //Create Target Acquired Button
        ui.stroke(255,140,0);
        Random rand = new Random();
        int value1 = rand.nextInt(255);
        int value2 = rand.nextInt(255);
        int value3 = rand.nextInt(255);
        int value4 = rand.nextInt(255);
        ui.fill(value1,value2,value3,value4);
        ui.rect(x + 75 ,y + 380,200,40);
        String Text = "TARGET ACQUIRED";
        ui.textSize(18);
        ui.fill(255, 0, 0);
        ui.text(Text, x + 95 ,y + 407);

        //Create Target Aimer
        ui.noFill();
        ui.stroke(255,0,0);
        ui.ellipse(x + width / 2, y + height / 2, radius, radius);

        radius = radius + 1;
        if(radius>=150){
            radius *= -1;
        }
    }
}