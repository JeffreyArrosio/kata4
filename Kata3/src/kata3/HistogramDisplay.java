package kata3;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay <T> extends ApplicationFrame{
    private final Histogram <T> histogram;
    
    public HistogramDisplay(Histogram <T> histogram, String name, String title1, String title2,
                            String title3) {
        super(name);
        this.histogram = histogram;
        setContentPane(createPanel(title1, title2, title3));
        pack();
    }
    public void execute(){
        setVisible(true);
    }
    private JPanel createPanel (String title1, String title2, String title3){
        ChartPanel panel = new ChartPanel(createChart(createDataSet(), title1, title2, title3));
        setPreferredSize(new Dimension(500, 400));
        return panel;
    }
    private JFreeChart createChart (DefaultCategoryDataset dataSet, String title1, String title2, String title3){
        JFreeChart chart = ChartFactory.createBarChart3D(title1, title2, title3, dataSet, 
                PlotOrientation.VERTICAL, false, false, rootPaneCheckingEnabled);
        return chart;
    }

    private DefaultCategoryDataset createDataSet(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        for(Object key : this.histogram.keySet()){
            dataSet.addValue(this.histogram.get((T) key), "", key.toString());
        }
        return dataSet;
    }
    
}
