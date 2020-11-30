package com.test.hotel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author KwokFu
 * @Description:
 * @ClassName: InHotelTest
 * @date: 2020/10/26 11:32
 */
public class InHotelTest {
    InHotel inHotel = new InHotel();
    Empty empty = new Empty();
    @Before
    public void setUp() throws Exception {
        MainRun.iniRooms();
    }

    @Test
    public void testIn_Valid() {
        Assert.assertEquals("Marry成功入住801房间！", inHotel.in(801, "Marry"));
    }

    @Test
    public void testIn_2Homes() {
        String s = inHotel.in(802, "Tom");
        Assert.assertEquals("Marry成功入住803房间！", inHotel.in(802, "John"));
    }
}
