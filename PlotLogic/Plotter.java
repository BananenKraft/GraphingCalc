package PlotLogic;

import java.awt.Graphics;


public abstract class Plotter {

    public abstract String getname();

    public abstract void plot(Graph p, Graphics g, int chartWidth, int chartHeigth);

}
