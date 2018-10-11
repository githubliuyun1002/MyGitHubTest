import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * list的遍历的方式
 */
public class demo5 {
    public void show1(List<String> list){
        //该方式借助迭代器进行循环
        for(Iterator iterator = list.iterator(); iterator.hasNext();){
             String i =(String) iterator.next();
             System.out.print(i+"  ");
        }
        System.out.println();
    }
    public void show2(List<String> list){
        Iterator iterator = list.iterator();
        //生成迭代器对象。iterator迭代器，hasNext()判断是否有值。next()用户获取下一个值
        while(iterator.hasNext()){
            String i = (String) iterator.next();
            System.out.print(i+"  ");
        }
        System.out.println();
    }
    public void show3(List<String> list){
        //该方式直接对list集合进行循环,进行简单的for循环
        for (Object object : list) {
            System.out.print(object+"  ");
        }
        System.out.println();
    }
    public void show4(List<String> list){
        //得到list的长度，借助list.get(index)方法进行循环集合
        for(int i = 0 ;i<list.size();i++) {
            String j= list.get(i);
            System.out.print(j+"  ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("Anna");
        list.add("Rose");
        list.add("Tom");
        demo5 demo=new demo5();
        demo.show1(list);
        demo.show2(list);
        demo.show3(list);
        demo.show4(list);
    }

}
