package digitalinnovation.array;

public class meuArray {
    public static void main(String[] args){
        int[] testeArray = new int[5];
        int[] testeArray2 = {5,4,3,2,1};
        int i;

        for(i = 0;i < testeArray.length; i++){
            testeArray[i] = i;
        }

        for (i = 0; i <testeArray.length;i++){
            System.out.println("Primeiro metodo de array: " + testeArray[i]);
            System.out.println("Segundo metodo de array: " + testeArray2[i]);

        }
    }
}
