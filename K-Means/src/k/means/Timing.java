/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package k.means;

import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author Firmanda
 */
public class Timing {

    
    double treshold [] = {0.4,0.7,0.8};
    static double arrayAreaA [] = new double [210];
    static double zscoreAreaA[] = new double [210];
    static double rata2AreaA;
    static double stdevAreaA;
    
    
    static double arrayPerimeterP [] = new double[210];
    static double zscorePerimeterP [] = new double[210];
    static double rata2PerimeterP;
    static double stdevPerimeterP;
    
    
    static double arraycompactness [] = new double [210];
    static double zscorecompactness [] = new double [210];
    static double rata2compactness;
    static double stdevcompactness;
    
    
   static double arraylengthofkernel [] = new double [210];
   static double zscorelengthofkernel [] = new double [210];
    static double rata2lengthofkernel;
    static double stdevlengthofkernel;
   
   
    static double arraywidthofkernel [] = new double [210];
    static double zscorewidthofkernel [] = new double [210];
    static double rata2widthofkernel;
    static double stdevwidthofkernel;
    
    
    static double arrayassymetry [] = new double[210];
    static double zscoreassymetry [] = new double[210];
    static double rata2assymetry;
    static double stdevassymetry;
    
    
    static double arraylengofkernelgroove [] = new double[210];
    static double zscorelengofkernelgroove [] = new double[210];
     static double rata2lengofkernelgroove;
    static double stdevlengofkernelgroove;
            
            
    static double arraykelas[] = new double[210];
    
    
    
    public static void main(String[] args) {
       inputData();
  
       
       rata2AreaA = rata2(arrayAreaA);
       rata2PerimeterP = rata2(arrayPerimeterP);
       rata2compactness = rata2(arraycompactness);
       rata2lengthofkernel = rata2(arraylengthofkernel);
       rata2widthofkernel = rata2(arraywidthofkernel);
       rata2assymetry = rata2(arrayassymetry);
       rata2lengofkernelgroove = rata2(arraylengofkernelgroove); 
       
       
       stdevAreaA = stdev(arrayAreaA);
       stdevPerimeterP = rata2(arrayPerimeterP);
       stdevcompactness = rata2(arraycompactness);
       stdevlengthofkernel = rata2(arraylengthofkernel);
       stdevwidthofkernel = rata2(arraywidthofkernel);
       stdevassymetry = rata2(arrayassymetry);
       stdevlengofkernelgroove = rata2(arraylengofkernelgroove); 
       
       
      zscore(zscoreAreaA, arrayAreaA, stdevAreaA, rata2AreaA);
      zscore(zscorePerimeterP, arrayPerimeterP, stdevPerimeterP, rata2PerimeterP);
      zscore(zscoreassymetry,arrayassymetry,stdevassymetry,rata2assymetry);
      zscore(zscorecompactness,arraycompactness,stdevcompactness,rata2compactness);
      zscore(zscorelengofkernelgroove,arraylengofkernelgroove,stdevlengofkernelgroove,rata2lengofkernelgroove);
      zscore(zscorelengthofkernel, arraylengthofkernel, stdevlengthofkernel, rata2lengthofkernel);
      zscore(zscorewidthofkernel, arraywidthofkernel, stdevwidthofkernel, rata2widthofkernel);
      
//       timerawal();
//       
//      centroid();
//      euclid();
//      pindahkelas(
//      nyarimin
//              pindah
//                      total
//          return   kelasnya;          
//      );
//      akurasi(kelasnya);
//       
//       timerakhir();
//       
//       timing(timerakhir-timerawal)
        
    } 
    
    public static void inputData(){
         java.io.File file = new java.io.File("seeds_dataset.txt");
        try{
         Scanner input = new Scanner(file);
         int index1 = 0;
         int index2 = 0;
         int index3 = 0;
         int index4 = 0;
         int index5 = 0;
         int index6 = 0;
         int index7 = 0;
          int index8 = 0;
       
         int counter = 0;
         while(input.hasNext()){
             String num =input.next();
             double angka = Double.parseDouble(num);
             switch(counter){
                 case 0:
                     arrayAreaA[index1] = angka;
                      index1++;
                     break;
                 case 1:
                     arrayPerimeterP[index2] = angka;
                       index2++;
                     break;
                 case 2:
                      arraycompactness[index3] = angka;
                     index3++;
                     break;
                 case 3:
                    arraylengthofkernel[index4]=angka;
                     index4++;
                     break;
                 case 4:
                     arraywidthofkernel[index5] =angka;
                      index5++;
                     break;
                 case 5:
                    arrayassymetry[index6] = angka;
                     index6++;
                     break;
                 case 6:
                    arraylengofkernelgroove[index7] = angka;
                     index7++;      
                     break;
                 case 7:
                    arraykelas[index8] = angka;
                     index8++;      
                     break;
             }
             
             counter++;
             if(counter == 8){
                 counter =0;
                 
             }
         }      
        }catch(FileNotFoundException e){
            System.out.println("File tak ada");
        }
    }
    
    private static void pindahkelas() {
        
        
    }
    
    public static void printArray(){
     for(int i=0;i<arrayAreaA.length;i++){
            System.out.println(arrayAreaA[i]+" "+arrayPerimeterP[i]+" "+arraycompactness[i]+" "+arraylengthofkernel[i]+""
                    +" "+arraywidthofkernel[i]+" "+arrayassymetry[i]+" "+arraylengofkernelgroove[i]+" "+arraykelas[i]);
        }
    }
    
     public static void printZscore(){
     for(int i=0;i<zscoreAreaA.length;i++){
            System.out.println(zscoreAreaA[i]+" "+zscorePerimeterP[i]+" "+zscorecompactness[i]+" "+zscorelengthofkernel[i]+""
                    +" "+zscorewidthofkernel[i]+" "+zscoreassymetry[i]+" "+zscorelengofkernelgroove[i]);
        }
    }
    
     public static void euclidian(double euclidian[], double zScoreRumah[], double zScorePendapatan[], double zScoreFrekuensi[]){
        for (int i = 0; i < euclidian.length; i++) {
            euclidian[i] = Math.pow((zScoreRumah[zScoreRumah.length-1] - zScoreRumah[i]), 2)
                    + Math.pow((zScorePendapatan[zScorePendapatan.length-1] - zScorePendapatan[i]), 2)
                    + Math.pow((zScoreFrekuensi[zScoreFrekuensi.length-1] - zScoreFrekuensi[i]), 2);
            
            euclidian[i] = Math.sqrt(euclidian[i]);
        }
    
    }
     
     public static void zscore(double zscore[], double input[], double std, double rata2){
        for (int i = 0; i < zscore.length; i++) {
            zscore[i] = (input[i] - rata2)/std;
        }
    }
     
      
    public static double stdev(double [] arrayData){
       
        double X = 0;
        for (int i = 0; i < arrayData.length; i++) {
            X += Math.pow(arrayData[i], 2);        
        }
        
        double meanX = Math.pow(rata2(arrayData), 2);
        
        double std = Math.sqrt((X/arrayData.length)-meanX);
        
        return std;
    }
    
    public static double rata2(double [] arrayData){
    double kembalian = 0;
    for(int i = 0; i<arrayData.length;i++){
        kembalian +=arrayData[i];       
    }
    kembalian = kembalian/arrayData.length;
    return kembalian;
    }
     public static double jumlahdata(double [] arrayData){
    double kembalian = 0;
    for(int i = 0; i<arrayData.length;i++){
        kembalian +=arrayData[i];       
    }
    return kembalian;
    }
     
}
