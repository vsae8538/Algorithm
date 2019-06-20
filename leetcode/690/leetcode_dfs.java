import java.util.HashMap;
import java.util.List;
import java.util.Map;

class leetcode {
    public static void main(String[] args) {
        System.out.println("hello world\n");
    } 
    Map<Integer,Employee> emap;
    public int getImportance(List<Employee> employees, int id) {
        emap = new HashMap();
        for(Employee e: employees)  emap.put(e.id, e);
        return dfs(id);
    }
    public int dfs(int id){
        Employee e = emap.get(id);
        if(e == null)
            return 0;
        int res = e.importance;
        for(Integer subid:e.subordinates){
            res += dfs(subid);
        }
        return res;
    }
}
