package PlotLogic;

import java.awt.Graphics;
import java.util.Vector;

import PlotLogic.Plotter;
import PlotLogic.Settings;

public class Graph {

    public Vector<Plotter> allfunctions;
    public Settings plotSettings;

    public Graph(Settings p) {
        this.allfunctions = new Vector<Plotter>(20);

    }

    private double plotRangeX, plotRangeY;
    private int chartWidth, chartHeight;
    private double unitsPerPixelX, unitsPerPixelY;

    public void draw(Graphics g, int width, int height) {
        plotRangeX = Math.abs(plotSettings.getMaxX() -plotSettings.getMinX());
        plotRangeY = Math.abs(plotSettings.getMaxY() -plotSettings.getMinY());

        unitsPerPixelX = plotRangeX / chartWidth;
        unitsPerPixelY = plotRangeY / chartHeight;

       int columnIndex = 0; 

      // ??????? double firstGridXLocation = ((int) (plotSettings.getMinX() / plotSettings.getGridSpacingX())) * plotSettings.getGridSpacingX(); 

        for (double px = plotSettings.getMinX(); px <= plotSettings.getMaxX(); px += plotSettings.getGridSpacingX()) {
            if (px < plotSettings.getMinX()) continue;

            int plotX = getPlotX(px);
            int plotY = plotSettings.getMarginTop() +  chartHeight;

            if (plotSettings.isvGridVisible()) {
                g.setColor(plotSettings.getGridcolor());
                g.drawLine(plotX, plotSettings.getMarginTop(), plotX, plotY);
            }

    
        }

        for (double py = plotSettings.getMinY(); py <= plotSettings.getMaxY(); py += plotSettings.getGridSpacingY()) {
            if (py < plotSettings.getMinY()) continue;

            int plotX = plotSettings.getMarginLeft();
            int plotY = getPlotY(py);
            
            if (plotSettings.ishGridVisible()) {
                g.setColor(plotSettings.getGridcolor());
                g.drawLine(plotSettings.getMarginLeft(), plotY, plotSettings.getMarginLeft() + chartWidth - 1, plotY);
            }
        }

        
    }

    public Vector<Plotter> getAllfunctions() {
        return allfunctions;
    }

    public void setAllfunctions(Vector<Plotter> allfunctions) {
        this.allfunctions = allfunctions;
    }

    public Settings getPlotSettings() {
        return plotSettings;
    }

    public void setPlotSettings(Settings plotSettings) {
        this.plotSettings = plotSettings;
    }

    public double getPlotRangeX() {
        return plotRangeX;
    }

    public void setPlotRangeX(double plotRangeX) {
        this.plotRangeX = plotRangeX;
    }

    public double getPlotRangeY() {
        return plotRangeY;
    }

    public void setPlotRangeY(double plotRangeY) {
        this.plotRangeY = plotRangeY;
    }

    public int getChartWidth() {
        return chartWidth;
    }

    public void setChartWidth(int chartWidth) {
        this.chartWidth = chartWidth;
    }

    public int getChartHeight() {
        return chartHeight;
    }

    public void setChartHeight(int chartHeight) {
        this.chartHeight = chartHeight;
    }

    public double getUnitsPerPixelX() {
        return unitsPerPixelX;
    }

    public void setUnitsPerPixelX(double unitsPerPixelX) {
        this.unitsPerPixelX = unitsPerPixelX;
    }

    public double getUnitsPerPixelY() {
        return unitsPerPixelY;
    }

    public void setUnitsPerPixelY(double unitsPerPixelY) {
        this.unitsPerPixelY = unitsPerPixelY;
    }

    public int getPlotX(double x) {
        return (int) (((x - plotSettings.getMinX()) / unitsPerPixelX) + plotSettings.getMarginLeft());

    }

    public int getPlotY(double y) {
        return ((chartHeight - ((int) ((y - plotSettings.getMinY()) / unitsPerPixelY))) + plotSettings.getMarginTop());
    }

}
