package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdminTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    //helper
    public Admin adminSeup(){
        return  new Admin("Edwin","ed@gmail.com",456);
    }

    @Test
    public void instantiatesCorrectly(){
        Admin myAdmin=adminSeup();
        assertTrue(myAdmin instanceof Admin);
    }

    @Test
    public void getUsername() {
        Admin myAdmin= adminSeup();
        assertEquals("Edwin",myAdmin.getUsername());

    }

    @Test
    public void setUsername() {
        Admin myAdmin= adminSeup();
        myAdmin.setUsername("Kaburu");
        assertEquals("Kaburu",myAdmin.getUsername());
    }

    @Test
    public void getEmail() {
        Admin myAdmin=adminSeup();
        assertEquals("ed@gmail.com", myAdmin.getEmail());
    }

    @Test
    public void setEmail() {
        Admin myAdmin= adminSeup();
        myAdmin.setEmail("coffee@gmail.com");
        assertEquals("coffee@gmail.com", myAdmin.getEmail());
    }

    @Test
    public void getPassword() {
        Admin myAdmin= adminSeup();
        assertEquals(456, myAdmin.getPassword());
    }

    @Test
    public void setPassword() {
        Admin myAdmin=adminSeup();
        myAdmin.setPassword(123);
        assertEquals(123,myAdmin.getPassword());
    }


    @Test
    public void setId() {
        Admin myAdmin=adminSeup();
        myAdmin.setId(5);
        assertEquals(5,myAdmin.getId());
    }

   }