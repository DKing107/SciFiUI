package ie.tudublin;
import processing.core.PApplet;

public class WindowScreen extends PApplet{
    UI ui;
    String[] Alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","?"};
    private int x=70;
    private int y=700;


    public WindowScreen(UI ui){
        this.ui = ui;
    }

    public void render(){

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