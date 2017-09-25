import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class ModifiedBinarySearchTest {
    private ModifiedBinarySearch mModifiedBinarySearch = new ModifiedBinarySearch();

    @Test
    public void should_return_index_zero_when_array_empty() throws Exception {
        //Given
        Integer[] objArray = {};
        Integer searchObj = 2;

        //When
        int result = mModifiedBinarySearch.binarySearch(objArray, searchObj);

        //Then
        assertEquals(result, 0);
    }

    // Odd Sized Array

    @Test
    public void should_return_index_zero_when_insert_at_lower_bound_and_duplicate_not_in_odd_array() throws Exception {
        //Given
        String[] objArray = {"c", "fff", "zz"};
        String searchObj = "a";

        //When
        int result = mModifiedBinarySearch.binarySearch(objArray, searchObj);

        //Then
        assertEquals(result,0 );
    }

    @Test
    public void should_return_index_zero_when_insert_at_lower_bound_and_duplicate_in_odd__array() throws Exception {
        //Given
        String[] objArray = {"c", "fff", "zz"};
        String searchObj = "c";

        //When
        int result = mModifiedBinarySearch.binarySearch(objArray, searchObj);

        //Then
        assertEquals(result,0 );
    }

    // Even Sized

    @Test
    public void should_return_index_zero_when_insert_at_lower_bound_and_duplicate_not_in_array() throws Exception {
        //Given
        String[] objArray = {"c", "b", "fff", "zz"};
        String searchObj = "Z";

        //When
        int result = mModifiedBinarySearch.binarySearch(objArray, searchObj);

        //Then
        assertEquals(result,0 );
    }

    @Test
    public void should_return_index_zero_when_insert_at_lower_bound_and_duplicate_in_array() throws Exception {
        //Given
        String[] objArray = {"c", "b", "fff", "zz"};
        String searchObj = "c";

        //When
        int result = mModifiedBinarySearch.binarySearch(objArray, searchObj);

        //Then
        assertEquals(result,0 );
    }

    //Odd Sized Array

    @Test
    public void should_return_length_when_insert_at_upper_bound_and_not_in_odd_array() throws Exception {
        //Given
        Integer[] objArray = {-5, -3, -1, 0, 1};
        Integer searchObj = 2;

        //When
        int result = mModifiedBinarySearch.binarySearch(objArray, searchObj);

        //Then
        assertEquals(result, objArray.length );
    }

    @Test
    public void should_return_length_when_insert_at_upper_bound_and_in_odd_array() throws Exception {
        //Given
        Integer[] objArray = {-5, -3, -1, 0, 1};
        Integer searchObj = 1;

        //When
        int result = mModifiedBinarySearch.binarySearch(objArray, searchObj);

        //Then
        assertEquals(result, objArray.length );
    }

    // Even Sized Array

    @Test
    public void should_return_length_when_insert_at_upper_bound_and_not_in_array() throws Exception {
        //Given
        Integer[] objArray = {-5, -1, 0, 1};
        Integer searchObj = 2;

        //When
        int result = mModifiedBinarySearch.binarySearch(objArray, searchObj);

        //Then
        assertEquals(result, 4 );
    }

    @Test
    public void should_return_length_plus_one_when_insert_at_upper_bound_and_in_array() throws Exception {
        //Given
        Integer[] objArray = {-5, -1, 0, 1};
        Integer searchObj = 1;

        //When
        int result = mModifiedBinarySearch.binarySearch(objArray, searchObj);

        //Then
        assertEquals(result, 4 );
    }

    //Odd Sized Array

    @Test
    public void should_return_insertion_when_duplicate_in_odd_array_within_bounds() throws Exception {
        //Given
        Integer[] objArray = {-5, -3, -1, 0, 1};
        Integer searchObj = 0;

        //When
        int result = mModifiedBinarySearch.binarySearch(objArray, searchObj);

        //Then
        assertEquals(result, 3 );
    }

    @Test
    public void should_return_insertion_within_bounds_when_no_duplicate_in_odd_array() throws Exception {
        //Given
        Integer[] objArray = {-5, -3, -1, 0, 1};
        Integer searchObj = -4;

        //When
        int result = mModifiedBinarySearch.binarySearch(objArray, searchObj);

        //Then
        assertEquals(result, 1 );
    }

    // Even Sized Array

    @Test
    public void should_return_insertion_when_duplicate_in_array_within_bounds() throws Exception {
        //Given
        Integer[] objArray = {-5, -1, 0, 1};
        Integer searchObj = 0;

        //When
        int result = mModifiedBinarySearch.binarySearch(objArray, searchObj);

        //Then
        assertEquals(result, 2 );
    }

    @Test
    public void should_return_insertion_within_bounds_when_no_duplicate_in_array() throws Exception {
        //Given
        Integer[] objArray = {-5, -1, 0, 1};
        Integer searchObj = -4;

        //When
        int result = mModifiedBinarySearch.binarySearch(objArray, searchObj);

        //Then
        assertEquals(1, result);
    }
}
