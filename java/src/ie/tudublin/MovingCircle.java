package ie.tudublin;
import java.util.Random;

public class MovingCircle
{
    String[] Numbers = {"  ENGINE : 57%", "   GUNS : 81%", " BATTERY: 41%", "ALTITUDE: 11Kft", "   FUEL: 91G'S"};
    private int x = -1200;
    private int y = 507;
    private float dx = 1;
    UI ui;

    public MovingCircle(UI ui)
    {    
        this.ui = ui;
    }
    
    public void render()
    {
        ui.stroke(255);
        Random rand = new Random();
        int value1 = rand.nextInt(255);
        int value2 = rand.nextInt(255);
        int value3 = rand.nextInt(255);
        int value4 = rand.nextInt(255);

        int j = 0;
        int k = 0;
        for(int i =0;i<5;i++){
        ui.fill(value1,value2,value3,value4);
        ui.textSize(16);
        ui.rect(x + j, y, 150, 25);
        ui.fill(0,0,0);
        ui.text(Numbers[k], x + 10 + j ,y + 18);
        k = k + 1;
        j = j + 300;
        } 
    }

    public void update()
    {
        x += dx;
        if (x == 800)
        {
            x = x - 1800;
        }
    }
}
