package Statkom1;
import java.util.Scanner;
import java.lang.Math;

public class Statkom
{
    public static void main(String[] args)
    {
        Scanner UserInput = new Scanner(System.in);

//        System.out.print("Jumlah Banyak Data Yang di inginkan = ");
//        int k = UserInput.nextInt();
//        System.out.println("\n");
//        int l = 1;
//        double[] databilangan = new double[k];
//        for (int i = 0; i < k; i++){
//            System.out.print("Masukan Data ke " + l++ + "\t : ");
//            databilangan[i] = UserInput.nextDouble();
//        }
//        double [] databilangan = {1,2,3,2,};    
        double[] databilangan = {27500,45000,45000,50000,50000,50000,60000,75000,
            75000,80000,100000,100000,100000,100000,100000,100000,100000,100000,
            115000,124000,135000,135000,150000,150000,150000,150000,150000,160000,
            200000,200000,200000,200000,250000,250000,250000,255000,270000,275000,
            275000,300000,350000,380000,500000,500000,500000,500000,550000,600000,700000,900000};
        int a = databilangan.length;

        System.out.print("Data Tunggal : \n");
        for (int i = 0; i < databilangan.length; i++)
        {
            System.out.print(databilangan[i] + " \n");
        }

        System.out.println("Jumlah Banyaknya Data: " + urutkan(databilangan));

        double b = databilangan[0];
        double c = 0;
        double modus = 0;
        double banyakjumlah=0;
        
        for (int i=0; i<databilangan.length ;i++)
        {
            if(databilangan[i] == b)
            {
                ++c;
                if(c>banyakjumlah)
                {
                    banyakjumlah=c;
                    modus=b;
                }
            }
            else
            {
                b=databilangan[i];
                c=1;
            }
        }

//        System.out.println(+ kuadrat(databilangan));
        System.out.println("Mean                 : " + ratarata(databilangan));
        System.out.println("Modus                : " + modus);
        System.out.println("Median               : " + median(databilangan));
        System.out.println("Varian               : " + varian(databilangan));
        System.out.println("Standar Deviasi      : " + Math.sqrt(varian(databilangan)));
        System.out.println("Quartil Bawah        : " + quartilbawah(databilangan));
        System.out.println("Quartil Atas         : " + quartilatas(databilangan));
    }

    public static double urutkan(double [] data)
    {
        for(int i=0;i<data.length-1;i++)
        {
            for (int j = data.length - 1; j > i; j--)
            {
                if (data[i] > data[j])
                {
                    double tempat = data[j];
                    data[j] = data[i];
                    data[i] = tempat;
                }
            }
        }

        int x = data.length;
        System.out.println("\n\nData yang telah diurutkan : ");
        for(int i=0;i<x;i++){
            System.out.print(data[i]+", ");
        }
        System.out.println("\n");
        return x;
    }
    
    public static double median(double [] data)
    {
        double hasil = 0;
        int posisi =0;
        posisi += data.length/2;
        for(int i=0;i<data.length;i++)
            {
                int bil=data.length%2;
                if(bil == 0)
                {
                    hasil = (data[posisi]+(data[posisi])-1)/2;
                }
                else
                {
                    hasil = data[posisi];
                }
            }
        return hasil;
    }
        
    public static double ratarata(double [] data)
        {
        double hasil = 0;
        double hasil2;
        for(int i=0; i<data.length; i++)
        {
            hasil += data[i];
        }
        hasil2 = hasil / data.length;
        return hasil2;
    }

//    public static double rata2(double [] data)
//    {
//        double hasil = 0;
//        for(int i=0; i<data.length; i++)
//        {
//            hasil += data[i];
//        }
//        return Math.pow((hasil),2);
//    }

//    public static double kuadrat(double[] data)
//    {
//        double hasil = 0;
//        for(int i=0; i<data.length; i++)
//        {
//            hasil += data[i] * data[i];
//        }
//        return hasil;
//    }
//
//    public static double varian(double [] data)
//    {
//        double hasil;
//        return hasil = ((data.length*kuadrat(data))-rata2(data))/((data.length*(data.length-1)));
//    }
    
    public static double varian(double[] data)
    {
        double varians = 0;
        double mean = ratarata(data);
        double jumlah = 0;
        for(int i = 0; i<data.length ; i++)
        {
            jumlah += Math.pow(data[i] - mean, 2);
            varians = jumlah / (data.length-1);
        }
        return varians;
    }

    public static double quartilbawah(double [] data)
    {
        double hasil = 0;
        int posisi = 0;
        posisi += data.length/4;
        for(int i=0;i<data.length;i++)
        {
            int bil=data.length%2;
            if(bil == 0)
            {
                hasil = (data[posisi]+(data[posisi])-1)/2;
            } 
            else
            {
                hasil = data[posisi];
            }
        }
        return hasil;
    }

    public static double quartilatas(double [] data)
    {
        double hasil = 0;
        int posisi =0;
        posisi += 3*data.length/4;
        for(int i=0;i<data.length;i++)
        {
            int bil=data.length%2;
            if(bil == 0)
            {
                hasil = (data[posisi]+(data[posisi])-1)/2;
            }
            else
            {
                hasil = data[posisi];
            }
        }
        return hasil;
    }
}
