//package hotel;
//
//public class ListHome {
//    MainRun mr = new MainRun();
//    public void search() {
//        for (int i = 0; i < mr.getRooms().length; i++) {
//            for (int j = 0; j < mr.getRooms()[0].length; j++) {
//                if (j + 1 < 10) {
//                    System.out.println(i + 1 + "0" + (j + 1) + "");
//                } else {
//                    System.out.println(i + 1 + "" + (j + 1) + "");
//                }
//            }
//            System.out.println();
//            for (int j = 0; j < mr.getRooms()[0].length; j++) {
//                System.out.println(mr.getRooms()[i][j] + "    ");
//            }
//            System.out.println();
//        }
//    }
//}
package com.test.hotel;

public class ListHome {
    IData iData ;
    public ListHome(){}
    public ListHome(IData iData){
        this.iData = iData;
    }

    public String search(){
        String search = null;
        for (int i = 0;i < HotelConstant.HOTEL_TOTAL_FLOOR;i++){
            for (int j = 0;j<HotelConstant.HOTEL_TOTAL_EVERYFLOOR;j++){
                int roomNo;
                if (i+1<10){
                    roomNo = (i+1) *100 +j+1;
                    search += ""+roomNo;
                }else {
                    roomNo = (i) *100 +j+1;
                    search += roomNo;
                }
                search  +=iData.getStation(roomNo);
            }


        }
        return search;
    }

}