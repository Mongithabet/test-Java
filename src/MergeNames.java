


import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MergeNames {
    public static String[] uniqueNames(String[] names1, String[] names2) throws UnsupportedOperationException {

        String[] mergedArray = new String[names1.length + names2.length];

        int i=0, j=0, k=0;

        while (i < names1.length)
        {
            mergedArray[k] = names1[i];
            k++;
            i++;
        }

        while (j < names2.length)
        {
            mergedArray[k] = names2[j];
            k++;
            j++;
        }

        Set<String> setWithNoDuplicates = new HashSet<>();

        for (int m = 0; m < mergedArray.length; m++)
        {
            setWithNoDuplicates.add(mergedArray[m]);
        }
        Iterator<String> it = setWithNoDuplicates.iterator();

        String[] mergedArrayWithNoDuplicates = new String[setWithNoDuplicates.size()];

        int n = 0;
        while (it.hasNext())
        {
            mergedArrayWithNoDuplicates[n] = it.next();
            n++;
        }

        Arrays.sort(mergedArrayWithNoDuplicates);
        System.out.println(Arrays.toString(mergedArrayWithNoDuplicates));   //prints the resultant array

        return mergedArrayWithNoDuplicates;

    }
}
