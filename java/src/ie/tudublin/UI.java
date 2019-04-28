package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
    Buttons b;
    InFoGraph i;
    WindowScreen ws;
    TargetAcquired ta;
    TieFighter t;
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
        b = new Buttons(this);
        mc = new MovingCircle(this);
        radar = new Radar(this, 1, width / 2, height / 2, 100);
        s = new Structure(this, 10, 10);
        w = new Window(this);  
        t = new TieFighter(this);  
        ta = new TargetAcquired(this);
        ws = new WindowScreen(this);
        i = new InFoGraph(this);
    }

    Radar radar;

    public void draw()
    {
        background(20);
        s.render();
        w.render();
        t.render();
        ta.render();
        ws.render();
        ws.update();
        i.render();
        i.update();
        b.render();
        b.update();

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

