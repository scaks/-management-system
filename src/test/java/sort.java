import java.util.TreeSet;

//对string 去重并排序
public class sort {
    public static void main(String[] args) {
        String s = "asdfasdfjjdjksl";
        char[] c = s.toCharArray();
       // Arrays.sort(c);
        TreeSet<Object> set = new TreeSet<>();
        for (char a : c){
            set.add(a);
        }
        System.out.println(set);
        String ss = set.toString();
        String aa=ss.replaceAll(", ","")
                .replaceAll("[\\[]","").replaceAll("]","");
        System.out.println(aa);

    }
}
