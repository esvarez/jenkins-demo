package dev.ericksuarez.demo.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

@RunWith(MockitoJUnitRunner.class)
public class ServiceFakeTest {

    private ServiceFake serviceFake;

    @Before
    public void setUp(){
        serviceFake = new ServiceFake();
    }

    @Test
    public void foo() {
        assertEquals("dev test null", serviceFake.getEnv());
    }

    @Test
    public void fail(){
        assertFalse(true);
    }
}
