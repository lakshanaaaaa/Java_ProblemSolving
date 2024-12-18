import java.util.Collections;
public class Main{
    public static void main(String args[])
    {
        ArrayList<Integer> A1=new ArryList<>();
        //ADD
            //add values to array
            A1.add(10);
            A1.add(20);
            A1.add(25);
            A1.add(30);
            A1.add(50);
            System.out.println(A1);
            //adding with specified index
            A1.add(1,15);
            System.out.println(A1);
            //adding in firstIndex
            A1.addFirst(5);
            System.out.println(A1);
            //adding in lastIndex
            A1.addLast(205);
            System.out.println(A1);

        //REMOVE 
            //remove using index
            A1.remove(0);
            System.out.println(A1);
            //remove using object refered to a value
            A1.remove(new Integer(50));
            System.out.println(A1);

        //Cloning one array to another array
            ArrayList<Integer> A2=(ArrayList<Integer>)A1.clone();

        //to access some element using index
            System.out.println(A1.get(1)); //returns element in 1st index

            System.out.println(A1.getLast()); //returns lastelement

            System.out.println(A1.getFirst()); //returns firstelement

        //to check if a value contains in array or not -returns (true or false)
            System.out.println(A1.contains(10));

        //to check if all the values in one array present in other array-returns (true or false)
            System.out.println(A1.containsAll(A2));

        //to check two arrays has same value with same order -returns (true or false)
            System.out.println(A1.equals(A2));

        //to get the index of the specific value
            System.out.println(A1.indexOf(25)); //default of first occurence4

            System.out.println(A1.lastIndexOf(25));//last occurence

        //to check if the array is empty or not -returns (true or false)
            System.out.println(A1.isEmpty());

        //to return the length / size of the array
            System.out.println(A1.sizeOf());

        //to return maximum in array
            System.out.println(Collections.max(A1));

        //to sort an array
        
        sort sublist



        


    }
}