package toha.kpd;

import toha.kpd.entity.Task;
import toha.kpd.factory.EntityFactory;

public class ConsoleApp {

    public static void main(String[] args) {

        Task task = EntityFactory.generateRandomTask();
        System.out.println( task );

        for (int i=0; i<10; i++){

        }
    }
}
