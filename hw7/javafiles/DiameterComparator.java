/**
 * The assignment requires NearEarthObject instances to be sorted by four different member variables: referenceID, averageDiameter, 
 * closestApproachDate, and missDistance. To accomplish this, you should create four different classes which implment the Comparator 
 * interface which allow the NearEarthObjects to be arranged in sorted order based on the value of these member variables.
 * 
 * Each of these classes should implement a int compare(NearEarthObject left, NearEarthObject right) method. Each method in these 
 * classes should compare the two arguments based on the value of the desired member variable. For example, ReferenceIDComparator 
 * would compare two NearEarthObjects based on the values of their referenceID member variables, DiameterComparator would compare 
 * them based on the values of their averageDiameter member variables, etc. For more information, please refer to the documentation 
 * on the Comparator interface provided by Oracle.
 * 
 * @author Grace Wang
 * Stony Brook ID: 115083013
 * Recitation: CSE 214.R01
 * April 22, 2023
 */
//in this homework, we are sorting in descending order instead of ascending, so I changed the signs to less than than greater than
    //update: nevermind, we are sorting in ascending order
public class DiameterComparator implements java.util.Comparator<NearEarthObject>{
    public int compare(NearEarthObject leftSide, NearEarthObject rightSide){
        if(leftSide.getAverageDiameter() == rightSide.getAverageDiameter())
            return 0;
        else if (leftSide.getAverageDiameter() > rightSide.getAverageDiameter())
            return 1;
        else return -1;
    }
}
