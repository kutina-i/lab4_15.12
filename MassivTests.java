import org.junit.Test;

public class MassivTests {

    @Test
    public void testTask1(){
        Massiv task = new Massiv();
        int n = 12;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        task.Task1(arr, n);
    }

    @Test
    public void testTask2(){
        Massiv task = new Massiv();
        int n = 12;
        int[] arr = {7, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 10};
        task.Task2(arr, n);
    }

    @Test
    public void testTask3(){
        Massiv task = new Massiv();
        int n = 12;
        int[] arr = {7, 2, 2, 2, 2, 6, 7, 8, 9, 10, 11, 10};
        task.Task3(arr, n);
    }

    @Test
    public void testTask4(){
        Massiv task = new Massiv();
        int n = 12;
        int[] arr = {7, 2, 2, 2, 2, 6, 7, 8, 9, 10, 11, 10};
        task.Task4(arr, n);
    }

    @Test
    public void testTask5(){
        Massiv task = new Massiv();
        int[] arr = {7, 2, 2, 2, 2, 6, 7, 8, 9, 10, 11, 10};
        task.Task5(arr);
    }

    @Test
    public void testTask6(){
        Massiv task = new Massiv();
        int[] arr = {7, 2, 2, 2, 2, 6, 7, 8, 9, 10, 11, 10};
        task.Task6(arr);
    }

    @Test
    public void testTask7(){
        Massiv task = new Massiv();
        int[] arr = {7, 2, 2, 2, 2, 6, 7, 8, 9, 10, 11, 10};
        task.Task7(arr);
    }

    @Test
    public void testTask8(){
        Massiv task = new Massiv();
        int n = 12;
        double[] arr = {7, 2, 2, 2, 2, 6, 7, 8, 9, 10, 11, 10};
        task.Task8(arr, n);
    }

    @Test
    public void testTask9(){
        Massiv task = new Massiv();
        int[] arr1 = {7, 2, 2, 2, 2, 6, 7, 8, 9, 10, 11, 10};
        int[] arr2 = {21, 2, 2, 2, 2, 14, 7, 8, 45, 10, 11, 10};
        task.Task9(arr1, arr2);
    }

    @Test
    public void testTask10(){
        Massiv task = new Massiv();
        int[] arr = {7, 2, 2, 2, 2, 6, 7, 8, 9, 10, 11, 10};
        task.Task10(arr);
    }

    @Test
    public void testTask11(){
        Massiv task = new Massiv();
        int n1 = 12;
        int[] arr1 = {7, 2, 2, 2, 2, 6, 7, 8, 9, 10, 11, 10};
        int n2 = 12;
        int[] arr2 = {21, 2, 2, 2, 2, 14, 7, 8, 45, 10, 11, 10};
        task.Task11(arr1, n1, arr2, n2);
    }
    
}
