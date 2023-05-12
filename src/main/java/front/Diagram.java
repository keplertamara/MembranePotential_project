package front;

import java.awt.Color;
import java.awt.Dimension;
import java.util.List;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import simulation.Values;

public class Diagram extends JFrame {

    private XYSeriesCollection dataset;
    private ChartPanel chartPanel;

    public Diagram() {
        super("Monitor the membrane potential for each ion");

        // Create datasets
        XYSeries series1 = new XYSeries("Na");
        XYSeries series2 = new XYSeries("K");
        XYSeries series3 = new XYSeries("Cl");
        for (int i = 0; i < 100; i++) {
            series1.add(i, Values.NaPotential.get(i));
            series2.add(i, Values.potassiumPotential.get(i));
            series3.add(i, Values.chloridePotential.get(1));
        }
        dataset = new XYSeriesCollection();
        dataset.addSeries(series1);
        dataset.addSeries(series2);
        dataset.addSeries(series3);

        // Create chart
        JFreeChart chart = ChartFactory.createXYLineChart("Monitor the membrane potential for each ion", "Time", "mV", dataset);

        // Customize chart
        chart.setBackgroundPaint(Color.WHITE);

        XYPlot plot = (XYPlot) chart.getPlot();
        plot.setBackgroundPaint(Color.WHITE);
        plot.setRangeGridlinesVisible(true);
        plot.setRangeGridlinePaint(Color.BLACK);
        plot.setDomainGridlinesVisible(true);
        plot.setDomainGridlinePaint(Color.BLACK);

        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, Color.RED);
        renderer.setSeriesPaint(1, Color.BLUE);
        renderer.setSeriesPaint(2,Color.GREEN);
        renderer.setSeriesPaint(3, Color.BLACK);
        plot.setRenderer(renderer);

        NumberAxis domainAxis = (NumberAxis) plot.getDomainAxis();
        domainAxis.setAutoRangeIncludesZero(false);

        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setAutoRangeIncludesZero(false);

        // Create chart panel
        chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(500, 500));

        // Add chart panel to frame
        setContentPane(chartPanel);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void updateDiagram() {
        dataset.removeAllSeries();

        XYSeries series1 = new XYSeries("Na");
        XYSeries series2 = new XYSeries("K");
        XYSeries series3 = new XYSeries("Cl");
        XYSeries series4 = new XYSeries("Overall");
        for (int i = 0; i < 100; i++) {
            series1.add(i, Values.NaPotential.get(i));
            series2.add(i, Values.potassiumPotential.get(i));
            series3.add(i, Values.chloridePotential.get(i));
            series4.add(i, Values.overallPotential.get(i));
        }

        dataset.addSeries(series1);
        dataset.addSeries(series2);
        dataset.addSeries(series3);
        dataset.addSeries(series4);
    }
}
