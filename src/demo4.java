import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * java集合遍历的几种方式Map的遍历方式
 */
public class demo4 {
    public void show1(Map<String,String> map){
        Set<String> set=map.keySet();
        for (String str:set) {
            System.out.println(str + "---->"+map.get(str));
        }
    }
    public void show2(Map<String,String> map){
        Iterator<Map.Entry<String, String>> it =map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }
    }
    public void show3(Map<String,String> map){
        for (Map.Entry<String,String> entry:map.entrySet()) {
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }
    }
    public void show4(Map<String,String> map){
        for (String v:map.values()) {
            System.out.println("value="+v);
        }
    }
    public static void main(String[] args) {
        Map<String, String> map=new HashMap();
        map.put("1","Lily");
        map.put("2","Rose");
        demo4 demo=new demo4();
        demo.show1(map);
        demo.show2(map);
        demo.show3(map);
        demo.show4(map);
    }
}
