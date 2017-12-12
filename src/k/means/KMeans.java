/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package k.means;

/**
 *
 * @author Anti Project Project Club
 * K-Means Clustering
 */
public class KMeans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
    public static void euclidian(double euclidian[], double zScoreSusuSkim[], double zScoreGulaPasir[], double zScoreStarterYogurt[], double zScoreSuhu[], double zScoreLamaFermentasi[]) {
        for (int i = 0; i < euclidian.length; i++) {
            euclidian[i] = Math.pow((zScoreSusuSkim[zScoreSusuSkim.length - 1] - zScoreSusuSkim[i]), 2)
                    + Math.pow((zScoreGulaPasir[zScoreGulaPasir.length - 1] - zScoreGulaPasir[i]), 2)
                    + Math.pow((zScoreStarterYogurt[zScoreStarterYogurt.length - 1] - zScoreStarterYogurt[i]), 2)
                    + Math.pow((zScoreSuhu[zScoreSuhu.length - 1] - zScoreSuhu[i]), 2)
                    + Math.pow((zScoreLamaFermentasi[zScoreLamaFermentasi.length - 1] - zScoreLamaFermentasi[i]), 2);

            euclidian[i] = Math.sqrt(euclidian[i]);
        }
    }
    
    public static void centroid(double data[]){
    
    }
    
}
