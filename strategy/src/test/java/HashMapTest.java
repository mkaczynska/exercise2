import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 04-Mar-16.
 */
public class HashMapTest {



    @Test
    public void testGetMultiElement() throws Exception {
        HashMap<String,Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("one",1);
        String key = "five";
        Integer value = 5;
        hashMap.put(key,value);
        hashMap.put("three",3);
        hashMap.put("seven",7);
        assertEquals(hashMap.get(key),value);
    }

    @Test
    public void testGetSingleElement() throws Exception {
        HashMap<String,Integer> hashMap = new HashMap<String, Integer>();
        String key = "five";
        Integer value = 5;
        hashMap.put(key,value);
        assertEquals(hashMap.get(key),value);
    }

    @Test
    public void testGetEmptyMap() throws Exception {
        HashMap<String,Integer> hashMap = new HashMap<String, Integer>();
        String key = "five";
        Integer value = 5;
        assertEquals(hashMap.get("five"),null);
    }

    @Test
    public void testGetNonExisting() throws Exception {
        HashMap<String,Integer> hashMap = new HashMap<String, Integer>();
        String key = "five";
        Integer value = 5;
        hashMap.put(key,value);
        assertEquals(hashMap.get("one"),null);
    }


    @Test
    public void testIsEmptyMultiElement() throws Exception {
        HashMap<String,Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("one",1);
        hashMap.put("five",5);
        hashMap.put("three",3);
        hashMap.put("seven",7);
        assertEquals(hashMap.isEmpty(),false);
    }

    @Test
    public void testIsEmptySingleElement() throws Exception {
        HashMap<String,Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("seven",7);
        assertEquals(hashMap.isEmpty(),false);
    }

    @Test
    public void testIsEmptyEmptyMap() throws Exception {
        HashMap<String,Integer> hashMap = new HashMap<String, Integer>();
        assertEquals(hashMap.isEmpty(),true);
    }

    @Test
    public void testPutMultiElement() throws Exception {
        HashMap<String,Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("one",1);
        String key = "five";
        Integer value = 5;
        hashMap.put(key,value);
        hashMap.put("three",3);
        hashMap.put("seven",7);
        assertEquals(hashMap.get(key),value);

    }

    @Test
    public void testFindPlaceForElementInArrayOfEntry() throws Exception {

    }

    @Test
    public void testFindPositionForElementInColumn() throws Exception {

    }

    @Test
    public void testSize() throws Exception {

    }

    @Test
    public void testSizeInColumnTable() throws Exception {

    }

    @Test
    public void testRemove() throws Exception {

    }

    @Test
    public void testRemoveIfChildrenFind() throws Exception {

    }

    /**
     * Test searches for an element
     * @throws Exception
     */
    @Test
    public void testFindElementMultiElement() throws Exception {
        HashMap<Integer,String> hashMap = new HashMap<Integer, String>();
        int key = 3;
        String value = "three";
        hashMap.put(2, "two");
        IElement element = hashMap.put(key,value);
        hashMap.put(4, "four");
        assertEquals(hashMap.findElement(key),element);
    }

    @Test
    public void testFindElementSingleElement() throws Exception {
        HashMap<Integer,String> hashMap = new HashMap<Integer, String>();
        int key = 3;
        String value = "three";
        IElement element = hashMap.put(key,value);
        assertEquals(hashMap.findElement(key),element);
    }

    @Test
    public void testFindElementNonExisting() throws Exception {
        HashMap<Integer,String> hashMap = new HashMap<Integer, String>();
        hashMap.put(3, "three");
        assertEquals(hashMap.findElement(4),null);
    }

    @Test
    public void testFindElementEmptyMap() throws Exception {
        HashMap<Integer,String> hashMap = new HashMap<Integer, String>();
        int key = 3;
        String value = "three";
        assertEquals(hashMap.findElement(key),null);
    }

    @Test
    public void testFindElementOfTheHash() throws Exception {

    }

    @Before
    public void setUp() throws Exception {
        HashMap<String,Integer> multiElementHashMap = new HashMap<String, Integer>();
        multiElementHashMap.put("one", 1);
        multiElementHashMap.put("five", 5);
        multiElementHashMap.put("three", 3);
        multiElementHashMap.put("seven", 7);

        HashMap<String,Integer> singleElementHashMap = new HashMap<String, Integer>();
        multiElementHashMap.put("seven", 7);


    }

    @After
    public void tearDown() throws Exception {

    }
}