import org.junit.Test;

public class Test01 {

    @Test
    public void test01(){
        Integer i1 = 127;
        Integer i2 = 127;

        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
        System.out.println("----------");


        Integer i3 = new Integer(2);
        Integer i4 = new Integer(2);
        System.out.println((i3 == i4));
        System.out.println((i3.equals(i4)));
        System.out.println("----------");



//        		Integer i5 = Integer.valueOf(128);
//	    Integer i6 = Integer.valueOf(128);
        Integer  i5 = 128; //自动装箱
        Integer  i6 = 128;
        System.out.println(i5 == i6);//false
        System.out.println(i5.equals(i6));//true
        System.out.println("----------");

//        内连接是指两张表的交集，用inner join来实现。左外连接是指左边这部分和中间的交集，left join，右外连接是指右边这部分和交集，用 right join


    }





}
