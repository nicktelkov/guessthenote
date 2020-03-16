import java.util.Random;



public class gameMechanics {

    public static int noteImage(){       // Раздомно задаем ноту
        Random rand = new Random();
        int n = rand.nextInt(7);
        return n;
    }

     public static boolean checkNote(int but, int note) {  //проверка правильного ответа
        if (but == note) {
            return true;
        }
         return false;
     }

     //gameWindow.actionPerformed();


}
