/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devops;

/**
 *
 * @author iqbal
 */
public class DevOps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, n, column = 3;
    //    int ccp313marks[]= {60,64,85,90,15};
    //        for(i=0; i<5; i++){
    //            System.out.println(ccp313marks[i]);
    //        }
    
        String[][] salutation = 
        {{"Name", "Mr. ", "Mrs. ", "Ms. "}, {"","Chong Wei", "Mariam", "Suzanne"}};
//        for(i = 0; i < salutation.length; i++){
//            for(n = 0; n < salutation[i].length; n++){
//                System.out.println(salutation[i][n] + " ");
//            }
//            System.out.println();
//        }
        for(i=0; i<4; i++)
            System.out.println(salutation[0][i] + salutation[1][i]);
    }
}
