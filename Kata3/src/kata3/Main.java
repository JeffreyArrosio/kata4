package kata3;

public class Main {

    public static void main(String[] args) {
        Histogram <String> histogram = new Histogram();
        histogram.increment("hotmail.com", 1);
        histogram.increment("outlook.es", 12);
        histogram.increment("ulpgc.es", 3);
        histogram.increment("dis.ulpgc.es", 4);
        histogram.increment("gmail.com", 1);
        histogram.increment("gmail.com", 3);
        
        HistogramDisplay histogramDisplay = new HistogramDisplay(histogram, "Histograma", 
                        "JFreeChart Histograma", "Tipo de Emails", "Cantidad de Emails");
        histogramDisplay.execute();
    }
    
}
