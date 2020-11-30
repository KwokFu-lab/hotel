package com.test.hotel;


import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ListHomeTest {
    private Mockery context = new Mockery();
    private IData iData = null;
    private ListHome listHome = null;
    @Before
    public void setUp()throws Exception{
        iData = context.mock(IData.class);
        listHome = new ListHome(iData);
        context.checking(new Expectations(){{
            for (int i = 0; i < HotelConstant.HOTEL_TOTAL_FLOOR; i++){
                for (int j = 0;j<HotelConstant.HOTEL_TOTAL_EVERYFLOOR;j++){

                    int roomNo;
                    if (i+1<10){
                        roomNo = (i+1) *100 +j+1;
                        oneOf(iData).getStation(roomNo);
                        will(returnValue("NULL"));
                    }else {
                        roomNo = (i) *100 +j+1;
                        oneOf(iData).getStation(roomNo);
                        will(returnValue("住户:"+roomNo));
                    }

                }
                }

        }});
    }
    @Test
    public void testOut() throws Exception{
        String result = "null101NULL102NULL103NULL104NULL105NULL106NULL107NULL108NULL109NULL110NULL111NULL112NULL201NULL202NULL203NULL204NULL205NULL206NULL207NULL208NULL209NULL210NULL211NULL212NULL301NULL302NULL303NULL304NULL305NULL306NULL307NULL308NULL309NULL310NULL311NULL312NULL401NULL402NULL403NULL404NULL405NULL406NULL407NULL408NULL409NULL410NULL411NULL412NULL501NULL502NULL503NULL504NULL505NULL506NULL507NULL508NULL509NULL510NULL511NULL512NULL601NULL602NULL603NULL604NULL605NULL606NULL607NULL608NULL609NULL610NULL611NULL612NULL701NULL702NULL703NULL704NULL705NULL706NULL707NULL708NULL709NULL710NULL711NULL712NULL801NULL802NULL803NULL804NULL805NULL806NULL807NULL808NULL809NULL810NULL811NULL812NULL901NULL902NULL903NULL904NULL905NULL906NULL907NULL908NULL909NULL910NULL911NULL912NULL901住户:901902住户:902903住户:903904住户:904905住户:905906住户:906907住户:907908住户:908909住户:909910住户:910911住户:911912住户:912" ;

        Assert.assertEquals(result,listHome.search());
    }
}
