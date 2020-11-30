package com.test.hotel;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author KwokFu
 * @Description:
 * @ClassName: SearchTest
 * @date: 2020/11/1 14:20
 */
public class SearchTest {
    MainRun mainRun = new MainRun();
    Search search = new Search();
    InHotel inHotel = new InHotel();

    @Test
    public void search_ini_801_is_Empty() {
        mainRun.iniRooms();
        Assert.assertEquals("该房间为空", search.status(801));
    }

    @Test
    public void search_ini_802_is_Linda() {
        mainRun.iniRooms();
        inHotel.in(802, "Linda");
        Assert.assertEquals("该房间已有人入住：Linda", search.status(802));
    }
}
