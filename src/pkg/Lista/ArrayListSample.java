package pkg.Lista;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ArrayListSample {
    public void ejemplo1() {
        List<String> taskList = new ArrayList<>();
        taskList.add("Sacar al perro");
        taskList.add("ir de compras");
        taskList.add("Hacer la cama");
        taskList.add("Ir a votar");

        for (String item : taskList) {
            System.out.println("Tarea:" + item);
        }
       /* String primerElemento=taskList.get(0);
        System.out.println("Primer elemento"+primerElemento);

        System.out.println("Elimina pos 0 ");
        taskList.remove(0);
         primerElemento=taskList.get(0);
        System.out.println("Primer elemento"+primerElemento);*/

    }

    public void ejercicio() {
        List<Integer> taskList = new ArrayList<>();
        taskList.add(1000);
        taskList.add(2000);
        taskList.add(3000);
        taskList.add(4000);
        int suma=0;

        for (int n : taskList) {
            suma=suma+n;
            System.out.println("El total es"+suma);
        }
    }
    public void listaTareas(){
        List<ClsTaskList>tl=new ArrayList<>();
        ClsTaskList tarea = new ClsTaskList();

        tarea.setTaskName("Ir a votar");
        tarea.setTaskDescription("Escuela, mesa 5");
        tarea.setDone(false);
        tl.add(tarea);
        tarea=new ClsTaskList();

        tarea.setTaskName("Sacar el chucho");
        tarea.setTaskDescription("Llevar el firulas al parque");
        tarea.setDone(false);
        tl.add(tarea);
        tarea=new ClsTaskList();

        tarea.setTaskName("hacer la cama");
        tarea.setTaskDescription("Mi mama o mujer me regaña");
        tarea.setDone(false);
        tl.add(tarea);
        tarea =new ClsTaskList();

for (ClsTaskList t:tl){
    System.out.println(t.getTaskName());
    System.out.println(t.getTaskDescription());
    System.out.println(t.isDone());
}
    }

}

