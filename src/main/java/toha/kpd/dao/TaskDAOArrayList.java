package toha.kpd.dao;

import toha.kpd.entity.Task;

import java.util.ArrayList;

public class TaskDAOArrayList implements TaskDAO {
    private int index;
    private ArrayList<Task> list;

    public TaskDAOArrayList(){
        index = 0;
        list = new ArrayList<Task>();
    }

    public int create(Task task) {
        index++;
        task.setId( index );
        list.add( task );
        return index;
    }

    public Task get(int id) {
        return list.stream().filter( t -> t.getId() == id ).findAny().orElse( null );
    }

    public void update(int id, Task task) {
    }

    public void delete(int id) {
        Task task = get( id );
        if( task == null ) return;
        list.remove( task );
    }

    @Override
    public void delete(Task task) {
        if( task == null ) return;
        list.remove( task );
    }
}
