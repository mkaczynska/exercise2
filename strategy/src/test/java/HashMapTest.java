import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 04-Mar-16.
 */
public class HashMapTest {

    private HashMap<String,Integer> multiElementMap;
    private HashMap<String,Integer> singleElementMap;
    private HashMap<String,Integer> emptyMap;
    private String multiKey,singleKey,nonExistingKey,testKey;
    private Integer multiValue,singleValue,testValue;
    private IElement multiElement,singleElement;
    private int multiSize,singleSize;

    /**
     * Test for getting value by key from map with multi elements
     * @throws Exception
     */
    @Test
    public void testGetMultiElement() throws Exception {
        assertEquals(multiElementMap.get(multiKey), multiValue);
    }

    /**
     * Test for getting value by key from map with single element
     * @throws Exception
     */
    @Test
    public void testGetSingleElement() throws Exception {
        assertEquals(singleElementMap.get(singleKey), singleValue);
    }

    /**
     * Test for getting value by key from empty map
     * @throws Exception
     */
    @Test
    public void testGetEmptyMap() throws Exception {
        assertEquals(emptyMap.get(singleKey),null);
    }

    /**
     * Test for getting value by giving non existing key
     * @throws Exception
     */
    @Test
    public void testGetNonExisting() throws Exception {
        assertEquals(multiElementMap.get(nonExistingKey),null);
    }


    /**
     * Test for checking if multi elements map is empty
     * @throws Exception
     */
    @Test
    public void testIsEmptyMultiElement() throws Exception {
        assertEquals(multiElementMap.isEmpty(),false);
    }

    /**
     * Test for checking if single element map is empty
     * @throws Exception
     */
    @Test
    public void testIsEmptySingleElement() throws Exception {
        assertEquals(singleElementMap.isEmpty(),false);
    }

    /**
     * Test for checking if empty map is empty
     * @throws Exception
     */
    @Test
    public void testIsEmptyEmptyMap() throws Exception {
        assertEquals(emptyMap.isEmpty(),true);
    }

    /**
     * Test for adding new element to map with multi elements
     * @throws Exception
     */
    @Test
    public void testPutMultiElementMap() throws Exception {
        assertEquals(multiElementMap.put(testKey,testValue),multiElementMap.findElement(testKey));
    }

    /**
     * Test for adding new element to map with single element
     * @throws Exception
     */
    @Test
    public void testPutSingleElementMap() throws Exception {
        assertEquals(singleElementMap.put(testKey,testValue),singleElementMap.findElement(testKey));
    }

    /**
     * Test for adding new element to an empty map
     * @throws Exception
     */
    @Test
    public void testPutEmptyMap() throws Exception {
        assertEquals(emptyMap.put(testKey,testValue),emptyMap.findElement(testKey));
    }

    @Test
    public void testFindPlaceForElementInArrayOfEntry() throws Exception {

    }

    @Test
    public void testFindPositionForElementInColumn() throws Exception {

    }

    /**
     * Test for getting size of map with multi elements
     * @throws Exception
     */
    @Test
    public void testSizeMultiElementMap() throws Exception {
        assertEquals(multiElementMap.size(), multiSize);
    }

    /**
     * Test for getting size of map with single element
     * @throws Exception
     */
    @Test
    public void testSizeSingleElementMap() throws Exception {
        assertEquals(singleElementMap.size(), singleSize);
    }

    /**
     * Test for getting size of empty map
     * @throws Exception
     */
    @Test
    public void testSizeEmptyMap() throws Exception {
        assertEquals(emptyMap.size(), 0);
    }

    @Test
    public void testSizeInColumnTable() throws Exception {

    }

    /**
     * Test for removing an element from map with multi elements
     * @throws Exception
     */
    @Test
    public void testRemoveMultiElementMap() throws Exception {
        multiElementMap.remove(multiKey);
        assertEquals(multiElementMap.findElement(multiKey),null);
    }

    /**
     * Test for removing an element from map with single element
     * @throws Exception
     */
    @Test
    public void testRemoveSingleElementMap() throws Exception {
        singleElementMap.remove(singleKey);
        assertEquals(singleElementMap.findElement(singleKey),null);
    }

    /**
     * Test for removing an element from an empty map
     * @throws Exception
     */
    @Test
    public void testRemoveEmptyMap() throws Exception {
        emptyMap.remove(singleKey);
        assertEquals(emptyMap.findElement(singleKey),null);
    }

    /**
     * Test for removing a non existing element from map
     * @throws Exception
     */
    @Test
    public void testRemoveNonExisting() throws Exception {
        multiElementMap.remove(nonExistingKey);
        assertEquals(multiElementMap.findElement(nonExistingKey),null);
    }

    @Test
    public void testRemoveIfChildrenFind() throws Exception {

    }

    /**
     * Test for finding element by key in map with multi elements
     * @throws Exception
     */
    @Test
    public void testFindElementMultiElement() throws Exception {
        assertEquals(multiElementMap.findElement(multiKey),multiElement);
    }

    /**
     * Test for finding element by key in map with single element
     * @throws Exception
     */
    @Test
    public void testFindElementSingleElement() throws Exception {
        assertEquals(singleElementMap.findElement(singleKey),singleElement);
    }

    /**
     * Test for finding a non existing element by key in map
     * @throws Exception
     */
    @Test
    public void testFindElementNonExisting() throws Exception {
        assertEquals(multiElementMap.findElement(nonExistingKey),null);
    }

    /**
     * Test for finding an element by key in empty map
     * @throws Exception
     */
    @Test
    public void testFindElementEmptyMap() throws Exception {
        assertEquals(emptyMap.findElement(singleKey),null);
    }

    @Test
    public void testFindElementOfTheHash() throws Exception {

    }

    @Before
    public void setUp() throws Exception {
        multiElementMap = new HashMap<String, Integer>();
        multiElementMap.put("one", 1);
        multiElementMap.put("five", 5);
        multiKey = "three";
        multiValue = 3;
        multiElement = multiElementMap.put(multiKey, multiValue);
        multiElementMap.put("seven", 7);
        multiSize = 4;


        singleElementMap = new HashMap<String, Integer>();
        singleKey = "seven";
        singleValue = 7;
        singleElement = singleElementMap.put(singleKey, singleValue);
        singleSize = 1;

        emptyMap = new HashMap<String, Integer>();
        nonExistingKey = "twenty";
        testKey = "test";
        testValue = 100;


    }

    @After
    public void tearDown() throws Exception {

    }
}