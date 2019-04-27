package ie.tudublin;
import processing.core.PApplet;

public class InFoGraph extends PApplet{
    UI ui;
    String Numbers[] = {"10","20","30","40","50"};
    String Info[] = {"A1","B2","C3","D4"};
    private int x=40;
    private int y=275;
    private int z1 = 0;
    private int z2 = 0;
    private int z3 = 0;
    private int z4 = 0;
    private int r1 = 0;
    private int r2 = 0;
    private int r3 = 0;
    private int r4 = 0;

    public InFoGraph(UI ui){
        this.ui = ui;
    }

    public void render(){

        ui.noFill();
        ui.stroke(0,100,0);
        ui.line(x,y,x,y + 185);
        ui.line(x,y + 185,x + 250,y + 185);
        ui.stroke(0,128,0);
        ui.rect(x, y + 25, z1 + 10, 20);
        ui.rect(x, y + 65, z2 + 10, 20);
        ui.rect(x, y + 105, z3 + 10, 20);
        ui.rect(x, y + 145, z4 + 10, 20);


        int s = 0;
        for(int i=0;i<4;i++){
            ui.text(Info[i],x - 25,y + 40 + s);
            s = s + 40;
        }

        int j = 0;
        for(int i=0;i<5;i++){
            ui.text(Numbers[i],x + 15 + j,y + 205);
            j = j + 50;
        }

    }

    public void update()
    {

        if(r1<=160){
            z1 = z1 + 1;
            r1 = r1 + 1;
        } else if(r1 >= 160){
            z1 = z1 - 2;
            if(z1<=0){
                r1 = 0;
            }
        }

        if(r2<=160){
            z2 = z2 + 3;
            r2 = r2 + 3;
        } else if(r2 >= 160){
            z2 = z2 - 1;
            if(z2<=0){
                r2 = 0;
            }
        }

        if(r3<=160){
            z3 = z3 + 2;
            r3 = r3 + 2;
        } else if(r3 >= 160){
            z3 = z3 - 3;
            if(z3<=0){
                r3 = 0;
            }
        }

        if(r4<=160){
            z4 = z4 + 1;
            r4 = r4 + 1;
        } else if(r4 >= 160){
            z4 = z4 - 2;
            if(z4<=0){
                r4 = 0;
            }
        }

    }

}