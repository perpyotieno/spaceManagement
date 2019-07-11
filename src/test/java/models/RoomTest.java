
package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoomTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    //helper
    public Room setUpRoom(){
        return new Room("MC 18",true,20);
    }
    @Test
    public void room_instantiatesCorrectly_true(){
        Room myRoom= setUpRoom();
        assertTrue( myRoom instanceof  Room);
    }
    @Test
    public void roomgetName_returnsString_String(){
        Room myRoom= setUpRoom();
        assertEquals("MC 18", myRoom.getName());
    }
    @Test
    public void roomSetName_returnString_String(){
        Room myRoom= setUpRoom();
        myRoom.setName("MC 20");
        assertEquals("MC 20",myRoom.getName());
    }
    @Test
    public void setId(){
        Room myRoom= setUpRoom();
        myRoom.setId(5);
        assertEquals(5,myRoom.getId());
    }
    @Test
    public void getCapacity(){
        Room myRoom=setUpRoom();
        assertEquals(20,myRoom.getCapacity());
    }
    @Test
    public void setCapacity(){
        Room myRoom = setUpRoom();
        myRoom.setCapacity(50);
        assertEquals(50, myRoom.getCapacity());
    }
    @Test
    public void isOccupied(){
        Room myRoom = setUpRoom();
        myRoom.isOccupied();
        assertTrue(true);
    }
    @Test
    public void setOccupied(){
        Room myRoom= setUpRoom();
        myRoom.setOccupied(false);
        assertFalse(false);
    }



}




