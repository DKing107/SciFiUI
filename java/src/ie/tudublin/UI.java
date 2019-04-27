package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
    WindowScreen ws;
    TargetAcquired ta;
    TieFighter t;
    Button b;
    MovingCircle mc;
    Structure s;
    Window w;
    boolean[] keys = new boolean[1024];

    public void keyPressed()
    {
        keys[keyCode] = true;
    }
    
    public void keyReleased()
    {
        keys[keyCode] = true;
    }

    public boolean checkKey(int c)
    {
        return keys[c] || keys [Character.toUpperCase(c)];
    }
    

    public void settings()
    {
        size(800, 800);
        // Use fullscreen instead of size to make your interface fullscreen
        //fullScreen(P3D); 
    }

    public void setup()
    {
        b = new Button(this, 50, 50, 100, 50, "I am a button");
        mc = new MovingCircle(this);
        radar = new Radar(this, 1, width / 2, height / 2, 100);
        s = new Structure(this, 10, 10);
        w = new Window(this);  
        t = new TieFighter(this);  
        ta = new TargetAcquired(this);
        ws = new WindowScreen(this);
    }

    Radar radar;

    public void draw()
    {
        background(0);
        s.render();
        w.render();
        t.render();
        ta.render();
        ws.render();
        ws.update();
        //b.render();

        mc.update();
        mc.render();

        radar.update();
        radar.render();

        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }

}

