package pl.kodolamacz.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by acacko on 28.10.17
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:context.xml")
public class SimpleSpringTest {

    @Autowired
    private Car car;

    @Autowired
    private Wheel wheel;

    @Test
    public void simpleTest() {
        assertTrue(car.getWheel() != null);
    }

    @Test
    public void simpleTest2() {
        assertTrue(wheel != null);
    }

}
