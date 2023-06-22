package PlotLogic;

import java.awt.Graphics;
import java.util.Vector;

import PlotLogic.Plotter;

public class Graph {

    public Vector<Plotter> allfunctions;
    public Settings plotSettings;

    public Graph(Settings p) {
        this.allfunctions = new Vector<Plotter>(20);

    }

    private double plotRangeX, plotRangeY;
    private int chartWidth, chartHeight;
    private double unitsPerPixelX, unitsPerPixel;

    public void draw(Graphics g, int width, int height)

}
