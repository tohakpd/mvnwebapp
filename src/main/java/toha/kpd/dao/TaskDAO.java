package toha.kpd.dao;

import toha.kpd.entity.Task;

public interface TaskDAO {
    public int create(Task task);
    public Task get(int id);
    public void update(int id, Task task);
    public void delete(int id);
    public void delete(Task task);
}
