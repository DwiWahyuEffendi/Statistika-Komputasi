package barchart1;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class BarChart1 
{

    public static void main(String[] args)
    {
        DefaultCategoryDataset grafik1 = new DefaultCategoryDataset();
        grafik1.setValue(1, "27500","");//Value,RowKey/ColumnKey
        grafik1.setValue(3, "45000","");
        grafik1.setValue(6, "50000","");
        grafik1.setValue(7, "60000","");
        grafik1.setValue(9, "75000","");//Value,RowKey/ColumnKey
        grafik1.setValue(10, "80000","");
        grafik1.setValue(18, "100000","");
        grafik1.setValue(19, "115000",""); 
        grafik1.setValue(20, "124000","");//Value,RowKey/ColumnKey
        grafik1.setValue(22, "135000","");
        grafik1.setValue(27, "150000","");
        grafik1.setValue(28, "160000","");
        grafik1.setValue(32, "200000","");//Value,RowKey/ColumnKey
        grafik1.setValue(35, "250000","");
        grafik1.setValue(36, "255000","");
        grafik1.setValue(37, "270000","");
        grafik1.setValue(39, "275000","");//Value,RowKey/ColumnKey
        grafik1.setValue(40, "300000","");
        grafik1.setValue(41, "350000","");
        grafik1.setValue(42, "380000","");
        grafik1.setValue(46, "500000","");//Value,RowKey/ColumnKey
        grafik1.setValue(47, "550000","");
        grafik1.setValue(48, "600000","");
        grafik1.setValue(49, "700000","");
        grafik1.setValue(50, "90000","");//Value,RowKey/ColumnKey 
         
        JFreeChart freeChart = ChartFactory.createBarChart("DATA BIAYA LISTRIK SELAMA 1 BULAN","HARGA","JUMLAH DATA", grafik1, PlotOrientation.VERTICAL,true, true,true); //String arg0,String arg1,String arg2,Category Datasheet,Plot Orientation,boolean arg4,boolean arg5,boolean arg6
        ChartFrame cf = new ChartFrame("GRAFIK 2 FREKUENSI KUMULATIF",freeChart);
         
        cf.setSize(1000,800);
        cf.setVisible(true);
        cf.setLocationRelativeTo(null);
    }
    
}
