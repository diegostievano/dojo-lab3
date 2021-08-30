/*This problem was asked by Stripe.

Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, 
find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.

For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.

You can modify the input array in-place*/
public class Exercise3 {

    private static Integer vPos;
    public static void main(String[] args) throws Exception {
        
        //Integer vPosition = 0;
        int[] inputArrayOne = {3, 4, -1, 1}; //[-1, 1, 3, 4]
        int[] inputArrayTwo = {1, 2, 0};        
        int[] inputArrayTree = {1, 6, 11, 25, 30};        
        int[] inputArrayFour = {1, 2, 0, 4};          
        int[] inputArrayFive = {3, 2, 4, 1};          

        FindTheLowestNumber(inputArrayFour);

    }
    
    public static void FindTheLowestNumber(int [] pArray) {       
        
        vPos = pArray[0];
        int vLower = 0;
        int vNew = 0;
        vLower =  pArray[0];
        for (int i = 0; i < pArray.length; i++){   

            System.out.println(pArray[i] + " e menor que " + vLower);
            if ((pArray[i] < vLower)){
                vPos = i;
                vLower = pArray[i];
            }            

            /*for(int j = 0; j < pArray.length; j++){  
                
                //verifico a menor posição do array e o menor número já encontrado
                if ((pArray[j] < pArray[i]) && (pArray[j] < vLower)){
                    vPos = j;
                    vLower = pArray[j];
                    //{3, 4, -1, 1}
                    //Verifico se a posição da direita é maior que o da esquerda para saber se somo com a posição anterior ou posterior                    
                    if (pArray[j - 1] > pArray[j + 1] ){
                        vNew = pArray[j + 1] + 1;
                    }else{
                        vNew = pArray[j - 1] + 1;
                    }
                }
            }*/
        }
        System.out.println("O menor valor do arry é " + vLower);
        for (int j = 0; j < pArray.length; j++){
            //System.out.println("Valor da direita " + pArray[j - 1] + " e maior que " + pArray[j + 1]);
            if (pArray[j] == vLower){
                if (j == 0){
                    vNew = pArray[j + 1] + 1;
                    pArray[j] = pArray[j + 1] + 1;
                    break;                    
                }
                if (j == pArray.length - 1){
                    vNew = pArray[j - 1] + 1;
                    pArray[j] = pArray[j - 1] + 1;
                    break;
                }                
                if(pArray[j - 1] > pArray[j + 1]){
                    vNew = pArray[j + 1] + 1;
                    pArray[j] = pArray[j + 1] + 1;
                    break;
                }else{
                    vNew = pArray[j - 1] + 1;
                    pArray[j] = pArray[j - 1] + 1;
                    break;
                }
            }
        }
        System.out.println("o novo valor é " + vNew);
       // System.out.println("Array :" + pArray);
    }
}
