import java.util.Arrays;

public class Main {

    /**
     * Mean Methods
     */

    public static int meanTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        int sum = 0;
        for (int i : totalWasteKgPerCapitaPerYear) sum += i;
        return  (int) Math.round(sum * 1.0/totalWasteKgPerCapitaPerYear.length);

    }


    public static int meanHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        int sum = 0;
        for (int i: householdEstimatesKgPerCapitaPerYear)
            sum +=i;
        return (int) Math.round(((double) sum /householdEstimatesKgPerCapitaPerYear.length)+0.5);
    }

    public static int meanHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        int sum = 0;
        for (int i : householdEstimatesTonnesPerYear) {
            sum += i;
        }
        return (int)(10 * Math.round((double)sum / householdEstimatesTonnesPerYear.length)) / 10;

    }

    public static int meanRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        int sum = 0;
        for (int i:retailEstimatesKgPerCapitaPerYear)
        {
            sum += i;
        }
        return (int) Math.round(sum * 1.0 / retailEstimatesKgPerCapitaPerYear.length);
    }



    public static int meanRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        int sum = 0;
        for (int i:retailEstimatesTonnesPerYear){
            sum += i;
        }
        return (int) Math.round(sum*1.0/retailEstimatesTonnesPerYear.length);
    }

    public static int meanFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int meanFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        return -1;
    }

    /**
     * Median Methods
     */

    public static int medianTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        int result = 0;
        Arrays.sort(totalWasteKgPerCapitaPerYear);
        if(totalWasteKgPerCapitaPerYear.length%2==1){
            result = totalWasteKgPerCapitaPerYear[totalWasteKgPerCapitaPerYear.length/2];
        }
        else if(totalWasteKgPerCapitaPerYear.length%2==0){
            int num1 = totalWasteKgPerCapitaPerYear[totalWasteKgPerCapitaPerYear.length/2];
            int num2 = totalWasteKgPerCapitaPerYear[(totalWasteKgPerCapitaPerYear.length/2) + 1];
            result = (num1 + num2) / 2;
        }
        return result;
    }

    public static int medianHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int medianHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        Arrays.sort(householdEstimatesTonnesPerYear);
        int length =
                householdEstimatesTonnesPerYear.length;
        int median;
        if(length%2==0) {
            median = (householdEstimatesTonnesPerYear[length / 2 - 1]) + (householdEstimatesTonnesPerYear[length / 2]) / 2;
        }
        else{
            median = householdEstimatesTonnesPerYear[length/2];
        }
        return median;
    }

    public static int medianRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int medianRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        Arrays.sort(retailEstimatesTonnesPerYear);
        int length = retailEstimatesTonnesPerYear.length;
        int med;
        if (length % 2 == 0) {
            med = (retailEstimatesTonnesPerYear[length / 2 - 1] + retailEstimatesTonnesPerYear[length / 2]) / 2;
        } else {
            med = retailEstimatesTonnesPerYear[length / 2];
        }
        return med;
    }

    public static int medianFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int medianFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        return -1;
    }

    /**
     * Min Methods
     */

    public static int minTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int minHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int minHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int minRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear) {
        int min = retailEstimatesKgPerCapitaPerYear[0];
        for (int i = 1; i < retailEstimatesKgPerCapitaPerYear.length; i++) {
            if (retailEstimatesKgPerCapitaPerYear[i] < min) {
                min = retailEstimatesKgPerCapitaPerYear[i];
            }
        }
        return min;
    }

    public static int minRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        int min = retailEstimatesTonnesPerYear[0];
        for (int i : retailEstimatesTonnesPerYear){

            if ( i < min){
                min = i;
            }


        }
        return min;
    }

    public static int minFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int minFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        return -1;
    }

    /**
     * Max Methods
     */
    
    public static int maxTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int maxHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int maxHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int maxRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {

        return -1;
    }

    public static int maxRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        int max = retailEstimatesTonnesPerYear[0];
        for (int elem : retailEstimatesTonnesPerYear ){
            if (elem > max){
                max = elem;
            }
        }
        return max;
    }

    public static int maxFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        int biggest = 0;
        for (int i = 0; i < foodServiceEstimatesKgPerCapitaPerYear.length; i++) {
            if (biggest < foodServiceEstimatesKgPerCapitaPerYear[i]) {
                biggest = foodServiceEstimatesKgPerCapitaPerYear[i];
            }
        }
        return biggest;
    }

    public static int maxFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        return -1;
    }

    /**
     * Misc Methods
     */

    public static int getCountryTotalWastePerYear(String country, String[] countries, int[] totalWasteKgPerCapitaPerYear)
    {
        for(int i = 0; i < countries.length; i++){
            if(countries[i].equals(country)){
                return totalWasteKgPerCapitaPerYear[i];
            }
        }
        return 0;
    }

    public static String getCountryWithMostWastePerCapita(String[] countries, int[] totalWasteKgPerCapitaPerYear)
    {
        int most = 0;
        for(int i = 1; i < totalWasteKgPerCapitaPerYear.length; i++){
            if(totalWasteKgPerCapitaPerYear[i] > totalWasteKgPerCapitaPerYear[most]){
                most = i;
            }
        }
        return countries[most];
    }

    public static String[] getCountriesWithHighestPovertyPercentage(String[] countries, double[] percentagesShareInPoverty)
    {
        double greatest = maxPer(percentagesShareInPoverty);

        int count = 0;
        for(double j : percentagesShareInPoverty){
            if(j == greatest){
                count++;
            }
        }

        String[] highestPoverty = new String[count];
        int place = 0;
        for(int i = 0; i < percentagesShareInPoverty.length; i++){
            if(percentagesShareInPoverty[i] == greatest){
                highestPoverty[place] = countries[i];
                place++;
            }
        }
        return highestPoverty;
    }

    public static double maxPer(double [] poverty){
        double highPercentage = poverty[0];
        for(double d : poverty){
            if(highPercentage < d){
                highPercentage = d;
            }
        }
        return highPercentage;
    }

    public static String[] getCountriesWithHighConfidence(String[] countries, String[] confidences)
    {
        Arraylist<String> highConf = new Arraylist<String>();
        for(int i = 0; i < confidences.length; i++){
            highConf.add(countries[i]);
        }
        String[] big = highConf.toArray(new String[highConf.size()]);
        return big;
    }
}
