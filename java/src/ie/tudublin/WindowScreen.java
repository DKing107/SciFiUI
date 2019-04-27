package ie.tudublin;
import processing.core.PApplet;

public class WindowScreen extends PApplet{
    UI ui;
    String[] Alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","?"};
    private int x=70;
    private int y=700;
    private float dx = 1;
    private int k = 100;
    private int j = 355;
    private int z = 0;


    public WindowScreen(UI ui){
        this.ui = ui;
    }

    public void update()
    {
        k += dx;
        if (k == 355)
        {
            k = k - 255;
        }

        j -= dx;
        if (j == 100)
        {
            j = j + 255;
        }

        z += dx;
        if (z == 80)
        {
            z = z - 80;
        }
    }

    public void render(){

        ui.stroke(255,255,255);
        ui.rect(100,570,275,85);
        ui.line(k,580,k + 20, 580);
        ui.line(j,590,j + 20, 590);
        ui.line(k,600,k + 20, 600);
        ui.line(j,610,j + 20, 610);
        ui.line(k,620,k + 20, 620);
        ui.line(j,630,j + 20, 630);
        ui.line(k,640,k + 20, 640);
        ui.ellipse(90 + 100, 615, z, z);
        ui.ellipse(180 + 100, 615, z, z);
        ui.line(200,655,150,680);
        ui.line(275,655,325,680);

        int k = 0;
        int j = 0;
        int l = 10;
        for(int i = 0;i<9;i++){
            ui.textSize(18);
            ui.fill(128,128,128);
            ui.rect(x - 10 + j, y - 20 ,40,25);
            ui.fill(l, x, k);
            ui.text(Alphabet[k],x + j,y);
            j = j + 40;
            k = k + 1;
            l = l + 30;
        }

        j = 0;
        l = 0;
        for(int i = 0;i<9;i++){
            ui.textSize(18);
            ui.fill(128,128,128);
            ui.rect(x - 10 + j, y + 10,40,25);
            ui.fill(l, x, k);
            ui.text(Alphabet[k],x + j,y + 30);
            j = j + 40;
            k = k + 1;
            l = l + 30;
        }

        j = 0;
        l = 0;
        for(int i = 0;i<9;i++){
            ui.textSize(18);
            ui.fill(128,128,128);
            ui.rect(x - 10 + j, y + 40 ,40,25);
            ui.fill(l, x, k);
            ui.text(Alphabet[k],x + j,y + 60);
            j = j + 40;
            k = k + 1;
            l = l + 30;
        }


    }

}