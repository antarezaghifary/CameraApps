package com.otaliastudios.cameraview;


import android.hardware.Camera;
import android.support.test.filters.SmallTest;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(AndroidJUnit4.class)
@SmallTest
public class ExtraProperties1Test extends BaseTest {

    @Test
    public void testConstructor1() {
        Camera.Parameters params = mock(Camera.Parameters.class);
        when(params.getVerticalViewAngle()).thenReturn(10f);
        when(params.getHorizontalViewAngle()).thenReturn(5f);
        ExtraProperties e = new ExtraProperties(params);
        assertEquals(e.getVerticalViewingAngle(), 10f, 0f);
        assertEquals(e.getHorizontalViewingAngle(), 5f, 0f);
    }

}
