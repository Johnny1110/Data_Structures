package com.frizo.lab.data.structures;


import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MyLinkedListTest extends MyArrayListTest {

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        mylist = new MyLinkedList<Integer>();
        mylist.addAll(list);
    }

    @Test
    public void testAddWithIndex(){
        mylist.add(0, 123);
        mylist.add(1, 124);
        mylist.add(2, 125);
        mylist.add(3, 126);
        mylist.add(4, 127);
        mylist.add(5, 128);
        assertThat(mylist.get(0), is(new Integer(123)));
        assertThat(mylist.get(1), is(new Integer(124)));
        assertThat(mylist.get(2), is(new Integer(125)));
        assertThat(mylist.get(3), is(new Integer(126)));
        assertThat(mylist.get(4), is(new Integer(127)));
        assertThat(mylist.get(5), is(new Integer(128)));
        assertThat(mylist.get(6), is(new Integer(1)));
        assertThat(mylist.get(7), is(new Integer(2)));
        assertThat(mylist.get(8), is(new Integer(3)));
    }

    @Test
    public void testRemove(){
        mylist.add(0, 123);
        mylist.add(1, 124);
        mylist.add(2, 125);
        mylist.add(3, 126);
        mylist.add(4, 127);
        mylist.add(5, 128);

        int re = mylist.remove(0);
        assertThat(re, is(123));
        re = mylist.remove(0);
        assertThat(re, is(124));
        re = mylist.remove(3);
        assertThat(re, is(128));
    }

}
