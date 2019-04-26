package ie.tudublin;

public class Structure{
    UI ui;
    private float x;
    private float y;

    public Structure(UI ui, float x, float y){
        this.ui = ui;
        this.x = x;
        this.y = y;
    }

    public void render()
    {
      ui.stroke(255);
      ui.noFill();
      ui.rect(x, y, 320, 480);
      ui.rect(320 + 2 * x, y, 450, 480);
      ui.rect(x, 540 + y, 450, 240);
      ui.rect(450 + 2 * x, 540 + y, 320, 240);
      ui.rect(-1, 500, 800, 40);
    }


}