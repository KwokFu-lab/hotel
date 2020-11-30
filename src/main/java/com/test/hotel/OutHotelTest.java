package com.test.hotel;//package hotel;
//
//import org.jmock.Expectations;
//import org.jmock.Mockery;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//
///**
// * @author KwokFu
// * @Description:
// * @ClassName: OutHotelTest
// * @date: 2020/10/26 11:27
// */
//public class OutHotelTest {
//    private Mockery context = new Mockery();
//    private IData iData = null;
//    private InHotel inHotel = null;
//    @Before
//    public void setUp()throws Exception{
//        iData = context.mock(IData.class);
//        inHotel = new InHotel(iData);
//        context.checking(new Expectations(){{
//            //当参数为 701 李四
//            oneOf(iData).in_out_Room(701, "张三");
//            will(returnValue("张三 " +" 成功入住 "+701+" 房间"));
//            //当参数为 701 李四  返回 该房间有客人入住
//            allowing(iData).in_out_Room(701,"李四");
//            will(returnValue("该房间有客人入住"));
//        }});
//
//    }
//    @Test
//    public void testOut() throws Exception{
//        Assert.assertEquals("张三 " +" 成功入住 "+701+" 房间",inHotel.in(701,"张三"));
//        Assert.assertEquals("该房间有客人入住",inHotel.in(701,"李四"));
//    }
//
//}