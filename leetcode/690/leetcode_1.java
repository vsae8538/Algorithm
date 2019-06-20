import java.util.List;

class leetcode {
    public static void main(String[] args) {
        System.out.println("hello world\n");
    } 

    public int getImportance(List<Employee> employees, int id) {
        Employee root = findEmployeeById(employees, id);
        return TrackTree(employees, root);    
    }
    
    public int TrackTree(List<Employee> list,Employee e){
        if(e == null)
            return 0;
        int val = e.importance;
        for(Integer i : e.subordinates){
            Employee n = findEmployeeById(list, i); 
            val += TrackTree(list, n);
        }
        return val;
    }

    public Employee findEmployeeById(List<Employee> list,int id){
        Employee res = null;
        for(Employee e : list){
            if(e.id == id){
                res = e;
                break;
            }
        }
        return res;
    }
}
