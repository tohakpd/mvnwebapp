package toha.kpd.factory;

import toha.kpd.entity.Task;

public class EntityFactory {

    static public Task generateRandomTask(){
        String[] desc = {"Task1","Task2","Task3","Task4"};
        Task task = new Task();
        task.setPriority( (int) Math.round( Math.random()*5 ) );
        task.setDescription( desc[ (int) Math.round( Math.random()*3 ) ] );
        return task;
    }
}
