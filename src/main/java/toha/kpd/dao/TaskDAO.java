package toha.kpd.dao;

import toha.kpd.entity.Task;

public interface TaskDAO {
    public void create(Task task);
    public Task get(int id, Task task);
    public void update(int id, Task task);
    public void delete(int id);
}
