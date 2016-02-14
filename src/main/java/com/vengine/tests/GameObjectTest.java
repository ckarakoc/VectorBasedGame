package com.vengine.tests;

import com.vengine.GameObject;
import com.vengine.Vector2D;
import org.junit.After;
import org.junit.Before;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Lars on 14/02/2016.
 */
public class GameObjectTest {

    private GameObject object;

    @Before
    public void setUp(){
        object = new GameObject();
    }

    @After
    public void tearDown(){
        object = null;
    }

    @org.junit.Test
    public void testAddVector() throws Exception {
        Vector2D v = new Vector2D(1, 2);

        object.addVector(v);

        ArrayList<Vector2D> vectorList = new ArrayList<Vector2D>();
        vectorList.add(v);

        assertEquals(object.getVectors(), vectorList);
    }

    @org.junit.Test
    public void testRemoveVector() throws Exception {

    }

    @org.junit.Test
    public void testUpdate() throws Exception {
        Vector2D v = new Vector2D(1, 2);

        object.addVector(v);

        object.setX(20);
        object.setY(40);

        object.update();

        assertEquals(object.getX(), 21);
        assertEquals(object.getY(), 42);
    }
}