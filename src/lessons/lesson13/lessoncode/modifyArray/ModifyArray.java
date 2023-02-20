package lessons.lesson13.lessoncode.modifyArray;

public class ModifyArray {
    public int[] addNewElement(int[] workingArray){
        int[] newArray = new int[workingArray.length+1];

        for (int i = 0; i < workingArray.length; i++) {
            newArray[i] = workingArray[i];
        }

        return newArray;
    }

    public int[] deleteLastElement(int[] workingArray){
        int[] newArray = new int[workingArray.length-1];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = workingArray[i];
        }

        return newArray;
    }

}
