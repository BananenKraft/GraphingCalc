import PlotLogic.Graph;
import PlotLogic.Settings;
import PlotLogic.Plotter;

public class main {
    public static void main(String[] args) {
        /* test t = new test();
        if(t.checkInput("2^(2*x))")){
            if(t.getBo() == t.getBc()){
                System.out.println("valid input");
            } else System.out.println("missing brackets!");
        } else System.out.println("invalid input"); 
        */

        Settings p = new Settings(-2,2,-1,1);
        Graph graph = new Graph(p);
    }
}
