package JFrameLogic;

import javax.swing.JPanel;
import java.awt.*;
import PlotLogic.Graph;


public class Panel extends JPanel {
    private Graph graph;

    public void setGraph(Graph graph) {
        this.graph = graph;
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (graph != null) graph.draw(g, getWidth(), getHeight());
    }

    public Graph getGraph() {
        return graph;
    }



}
