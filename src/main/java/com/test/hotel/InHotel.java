package com.test.hotel;


public class InHotel extends Empty {
    private int room;
    public String in(int roomNo, String name) {
        MainRun mr = new MainRun();
        room = (roomNo % 100) - 1;
        if (isEmpty(roomNo)) {
            mr.getRooms()[(roomNo / 100) - 1][room] = name;
            return name + "成功入住" + roomNo + "房间！";
        } else {
            return "该房间已经有客人入住！";
        }
    }
//    public IData iData;
//    public InHotel(IData iData) {
//        this.iData = iData;
//    }
//    public InHotel() {
//    }
//    public String in(int roomNo, String name) {
//        return iData.in_out_Room(roomNo, name);
//    }

    @Override
    boolean isEmpty(int roomNo) {
        String room = mr.getRooms()[(roomNo / 100) - 1][(roomNo % 100) - 1];
        if ("EMPTY".equals(room)) {
            return true;
        } else {
            return false;
        }
    }
}
