package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class Radar
{
    private float radius;
    private PVector pos;
    private float frequency;
    private UI ui;
    private float theta = 0;

    public Radar(UI ui, float frequency, float x, float y, float radius)
    {
        this.ui = ui;
        this.frequency = frequency;
        pos = new PVector(x, y);
        this.radius = radius;
    }

    public void render()
    {        
        ui.noFill();
        ui.stroke(0, 50, 0);
        int y = 40;
        int x = 45;
        for(int i = 0;i<9;i++){
            ui.line(30,y,radius * 3 + 5,y);
            ui.line(x,25,x,radius * 2 + 50);
            y = y + 25;
            x = x + 30;
        }

        ui.stroke(0, 200, 0);
        pos.x = 165;
        pos.y = 140;
        int r = 200;
        do{
            ui.ellipse(pos.x, pos.y, r, r);
            r = r - 50;
        }while (r>=0);
        
        ui.line(pos.x - radius, pos.y, pos.x + radius, pos.y);
        ui.line(pos.x, pos.y - radius, pos.x, pos.y + radius);
        float x2 = pos.x + (float) Math.sin(theta) * radius;
        float y2 = pos.y - (float) Math.cos(theta) * radius;
        ui.line(pos.x, pos.y, x2, y2);

        ui.stroke(255, 0, 0);
        ui.rect(30, 25, radius * 3 - 25, radius * 2 + 25);
    }

    float timeDelta = 1.0f / 60.0f;

    public void update()
    {
        theta += PApplet.TWO_PI * timeDelta * frequency;
    }

    /**
     * @return the radius
     */
    public float getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(float radius) {
        this.radius = radius;
    }

    /**
     * @return the pos
     */
    public PVector getPos() {
        return pos;
    }

    /**
     * @param pos the pos to set
     */
    public void setPos(PVector pos) {
        this.pos = pos;
    }

    /**
     * @return the frequency
     */
    public float getFrequency() {
        return frequency;
    }

    /**
     * @param frequency the frequency to set
     */
    public void setFrequency(float frequency) {
        this.frequency = frequency;
    }
}