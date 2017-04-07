package com.win.java.se;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;

import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@FixMethodOrder
public class CustomHashMapTest {

    private CustomHashMap<Integer, String> m;

    @Before
    public void init() {
        m = new CustomHashMap<>();
    }

    @Test
    public void testThatWeCanCreate() {

        assertThat(m, is(notNullValue()));

    }

    @Test
    public void testThatNewMapIsEmpty() {
        assertThat(m.isEmpty(), is(true));
    }

    @Test
    public void testThatOnNewMapContainKeyMethodReturnFalseForAnyObject() {
        assertThat(m.containsKey(new Integer(1)), is(false));
    }

    @Test
    public void testThatWeCanPutKeyValuePairAndCanCheckIt() {
        m.put(new Integer(3), "abc");
        assertThat(m.containsKey(3), is(true));
    }

    @Test(expected = NullPointerException.class)
    public void testThatWeCantPutNullKey() {
        m.put(null, "abc");
    }

    @Test
    public void testThatWeCanPutNullValue() {
        m.put(1, null);
    }

    @Test(expected = OutOfMemoryError.class)
    public void testThatMapHaveInfiniteCapacity() {
    }

    @Test
    public void testThatMapCanPutPairWithKeyThatAlreadyPresented() {
        System.out.println(m.put(5, "aaaa"));
        System.out.println(m.put(5, "wwwww"));
        assertTrue(m.containsValue("aaaa"));
        assertTrue(m.containsValue("wwwww"));
    }

    @Test
    public void testThatMapCanContainsKeysWithSameHashCode() {
    }

    @Test(expected = NullPointerException.class)
    public void testThatContainsKeyMethodThrowsExceptionOnNullKey() {
    }

    @Test(expected = ClassCastException.class)
    public void testThatContainsKeyMethodThrowsExceptionOnWrongKeyClass() {
    }

    @Test
    public void testContainsValueMethodWorksProperlyOn() {
    }

    @Test
    public void testContainsValueMethodWorksProperlyOnNullInputValue() {
    }

    @Test(expected = ClassCastException.class)
    public void testValueContainsMethodThrowsExceptionOnWrongInputValueClass() {
    }

    @Test
    public void testThatMapCalculateItsSizeProperly() {
    }

    @Test
    public void testThatItsPossibleToGetAnAddedEntryByKey() throws Exception {
        m.put(2, "sssss");
        assertEquals(m.get(2), "sssss");
    }

    @Test
    public void testThatItsPossibleToGetMultipleEntriesAddedWithTheSameKey() throws Exception {
        m.put(2, "sssss");
        m.put(2, "aaaaa");
        m.put(2, "asss");
        Object[] got = m.getAll(2);
        assertTrue(got[2] == "asss");
    }
}
