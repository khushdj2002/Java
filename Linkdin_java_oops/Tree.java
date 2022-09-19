import java.awt.*;

public class Tree {
    double height;
    double diameter;
    Treetype treetype;
    static Color Trunk_color = new Color(0,0,0);

    Tree(double height,double diameter,Treetype treetype){
        this.height=height;
        this.diameter=diameter;
        this.treetype=treetype;
    }
    void grow(){
        this.height=this.height+10;
        this.diameter=this.diameter+1;
    }
     void announceTallTree(){
        if(this.height>100){
            System.out.println("thats tree is tall "+this.treetype+" tree");
        }

    }
}
