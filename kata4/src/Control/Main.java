package Control;
import Model.Histogram;
import Model.Mail;
import View.HistogramDisplay;
import View.MailHistogramBuilder;
import View.MailListReader;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String file = new String ("email.txt");
        List <Mail> mailList = MailListReader.read(file);
        Histogram histogram = MailHistogramBuilder.build(mailList);
        
        histogram.increment("ulpgc.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("gmail.es");
        histogram.increment("outlook.es");
        histogram.increment("outlook.es");
        histogram.increment("outlook.es");
        histogram.increment("outlook.es");
        histogram.increment("outlook.es");
        histogram.increment("ulpgc.es");
        histogram.increment("hotmail.es");
        
        HistogramDisplay histogramDisplay = new HistogramDisplay(histogram, "Histograma", 
                    "JFreeChart Histograma", "Dominios", "Nº de Emails");
        histogramDisplay.execute();
    }
    
}
