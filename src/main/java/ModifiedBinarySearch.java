public class ModifiedBinarySearch {
    public <T extends Comparable<? super T>> int binarySearch(T[] objArray, T searchObj) {

        int low = 0;
        int high = objArray.length - 1;
        int mid = 0;
        if (high == -1) {
            return 0;
        }
        if (objArray[high].compareTo(searchObj) <= 0) {
            return high + 1;
        }
        if (objArray[0].compareTo(searchObj) >= 0) {
            return 0;
        }

        while (low <= high) {
            mid = (low + high) / 2;
            if (mid == 0) {
                return 1;
            }
            if (objArray[mid].compareTo(searchObj) < 0) {
                low = mid + 1;
                if (objArray[low].compareTo(searchObj) > 0) {
                    return low;
                }
            } else if (objArray[mid].compareTo(searchObj) > 0) {
                high = mid - 1;
                if (objArray[high].compareTo(searchObj) < 0) {
                    return high + 1;
                }
            } else {
                return mid;
            }
        }
        return -1;
    }
}