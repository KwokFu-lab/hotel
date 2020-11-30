package com.test.hotel;

/**
 * @author KwokFu
 * @Description:
 * @ClassName: Search
 * @date: 2020/11/1 14:27
 */
public class Search {
    MainRun mainRun = new MainRun();
    public String status(int homeNo) {
        String homeState = mainRun.getRooms()[homeNo / 100 - 1][homeNo % 100 - 1];
        if (homeState.equals("EMPTY")) {
            homeState = "该房间为空";
        } else {
            homeState = "该房间已有人入住：" + homeState;
        }
        return homeState;
    }
}
