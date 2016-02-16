package com.vengine;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by Lars on 16/02/2016.
 */
public class GameWorldTest {

    private GameWorld world;

    @Before
    public void setUp() throws Exception {
        world = new GameWorld();
    }

    @After
    public void tearDown() throws Exception {
        world = null;
    }

    @Test
    public void testAddGameObject() throws Exception {
        GameObject object = new GameObject();

        world.addGameObject(object);

        ArrayList<GameObject> objectList = new ArrayList<GameObject>();
        objectList.add(object);

        assertEquals(world.getGameObjects(), objectList);
    }

    @Test
    public void testRemoveGameObject() throws Exception {
        GameObject object = new GameObject();

        world.addGameObject(object);

        ArrayList<GameObject> objectList = new ArrayList<GameObject>();

        world.removeGameObject(object);

        assertEquals(world.getGameObjects(), objectList);
    }

    @Test
    public void testUpdate() throws Exception {

    }

    @Test
    public void testPaint() throws Exception {

    }

    @Test
    public void testRead() throws Exception {

    }
}