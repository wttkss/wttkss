import java.util.ArrayList;


public class WorkList {
    private ArrayList<Object> list;
    public WorkList(){
        this.list = new ArrayList<Object>();
    }

    public void addWork(Object work){
        this.list.add(work);
    }

    public void showAllWork(){
        for(Object work : list){
            System.out.println(work.toString());
        }
    }
}
