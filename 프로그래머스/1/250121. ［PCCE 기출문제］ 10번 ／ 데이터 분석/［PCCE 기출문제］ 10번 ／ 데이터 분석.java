import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        String[] dataType = {"code", "date", "maximum", "remain"};
        int extIndex = Arrays.asList(dataType).indexOf(ext);
        int sortIndex = Arrays.asList(dataType).indexOf(sort_by);
        
        List<int[]> filteredList = new ArrayList<>();
        
        for (int[] item : data) {
            if (item[extIndex] < val_ext) {
                filteredList.add(item);
            }
        }
        
        int[][] filteredArray = filteredList.toArray(new int[filteredList.size()][]);
        
        Arrays.sort(filteredArray, (a, b) -> a[sortIndex] - b[sortIndex]);
        
        return filteredArray;
    }
}