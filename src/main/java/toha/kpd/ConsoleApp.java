package toha.kpd;

import toha.kpd.dao.TaskDAO;
import toha.kpd.dao.TaskDAOArrayList;
import toha.kpd.entity.Task;
import toha.kpd.factory.EntityFactory;

public class ConsoleApp {

    public static void main(String[] args) {

        TaskDAO taskDAO = new TaskDAOArrayList();

        Task task = EntityFactory.generateRandomTask();

        int id = taskDAO.create( task );
        task = taskDAO.get( id );
        if( task != null )System.out.println( task ); else System.out.println("Error get taskDao");

        try {
            String dsc = "TestCase";
            int p = 11;
            task.setPriority( p );
            task.setDescription( dsc );
            taskDAO.update( id , task );

            task = null;
            task = taskDAO.get( id );
            if(
                    ! task.getDescription().equals( dsc ) ||
                    ! (task.getId() == id)

                ) System.out.println("Error update taskDao");

        }catch (Exception e){
            System.out.println( e );
        }



        taskDAO.delete( id );
        task = taskDAO.get( id );
        if( task != null )System.out.println("Error delete taskDao");



        for (int i=0; i<10; i++){
            task = EntityFactory.generateRandomTask();
            taskDAO.create( task );
        }

    }
}
