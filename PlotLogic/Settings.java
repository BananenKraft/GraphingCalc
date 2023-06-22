package PlotLogic;

import java.io.Serializable;
import java.awt.*;

public class Settings implements Serializable {
    private double minX = -5, maxX = 5, minY = -5, maxY = 5;
    private int marginTop = 10, marginBottom = 50, marginLeft = 50, marginRight = 20;
    private Color axisColor = Color.BLACK;
    private Color plotcoloer = Color.RED;
    private Color backgroundCoor = Color.WHITE;
    private Color gridcolor = Color.LIGHT_GRAY;
    private Color fontColor = Color.BLACK;
    private int notchLength = 4;
    private int notchGap = 4;
    private boolean hGridVisible = true;
    private boolean vGridVisible = true;
    private double gridSpacingX = 0.25, gridSpacingY = 0.25;

    public Settings() {};

    public Settings(double minX, double maxX, double minY, double maxY) {
        this.minX = minX;
        this.maxX = maxX;
        this.minY = minY;
        this.maxY = maxY;
    }

    public double getMinX() {
        return minX;
    }

    public void setMinX(double minX) {
        this.minX = minX;
    }

    public double getMaxX() {
        return maxX;
    }

    public void setMaxX(double maxX) {
        this.maxX = maxX;
    }

    public double getMinY() {
        return minY;
    }

    public void setMinY(double minY) {
        this.minY = minY;
    }

    public double getMaxY() {
        return maxY;
    }

    public void setMaxY(double maxY) {
        this.maxY = maxY;
    }

    public int getMarginTop() {
        return marginTop;
    }

    public void setMarginTop(int marginTop) {
        this.marginTop = marginTop;
    }

    public int getMarginBottom() {
        return marginBottom;
    }

    public void setMarginBottom(int marginBottom) {
        this.marginBottom = marginBottom;
    }

    public int getMarginLeft() {
        return marginLeft;
    }

    public void setMarginLeft(int marginLeft) {
        this.marginLeft = marginLeft;
    }

    public int getMarginRight() {
        return marginRight;
    }

    public void setMarginRight(int marginRight) {
        this.marginRight = marginRight;
    }

    public Color getAxisColor() {
        return axisColor;
    }

    public void setAxisColor(Color axisColor) {
        this.axisColor = axisColor;
    }

    public Color getPlotcoloer() {
        return plotcoloer;
    }

    public void setPlotcoloer(Color plotcoloer) {
        this.plotcoloer = plotcoloer;
    }

    public Color getBackgroundCoor() {
        return backgroundCoor;
    }

    public void setBackgroundCoor(Color backgroundCoor) {
        this.backgroundCoor = backgroundCoor;
    }

    public Color getGridcolor() {
        return gridcolor;
    }

    public void setGridcolor(Color gridcolor) {
        this.gridcolor = gridcolor;
    }

    public Color getFontColor() {
        return fontColor;
    }

    public void setFontColor(Color fontColor) {
        this.fontColor = fontColor;
    }

    public int getNotchLength() {
        return notchLength;
    }

    public void setNotchLength(int notchLength) {
        this.notchLength = notchLength;
    }

    public int getNotchGap() {
        return notchGap;
    }

    public void setNotchGap(int notchGap) {
        this.notchGap = notchGap;
    }

    public boolean ishGridVisible() {
        return hGridVisible;
    }

    public void sethGridVisible(boolean hGridVisible) {
        this.hGridVisible = hGridVisible;
    }

    public boolean isvGridVisible() {
        return vGridVisible;
    }

    public void setvGridVisible(boolean vGridVisible) {
        this.vGridVisible = vGridVisible;
    }

    public double getGridSpacingX() {
        return gridSpacingX;
    }

    public void setGridSpacingX(double gridSpacingX) {
        this.gridSpacingX = gridSpacingX;
    }

    public double getGridSpacingY() {
        return gridSpacingY;
    }

    public void setGridSpacingY(double gridSpacingY) {
        this.gridSpacingY = gridSpacingY;
    }


}
