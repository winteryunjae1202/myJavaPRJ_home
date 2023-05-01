import java.util.*;
public class A0501 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name", "조윤재");
        map.put("email", "winteryunjae1202@gmail.com");
        map.put("dept", "데이터분석과");

        System.out.println("조회 결과");
        System.out.println("name : " + map.get("name"));
        System.out.println("email : " + map.get("email"));
        System.out.println("dept : " + map.get("dept"));

        map.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        });
    }
}


