/**
 * Created by Brayan Fajardo on 11/10/2014.
 */
public class misionerosycanibales {

    boolean moverMisionerosYCanibales(int pMis, int pCan, int pBot){
        if ((pMis == 0) & (pCan == 0) & (pBot == 0)){      //Funcion de aceptacion
            System.out.println((3 - pMis) + "M" + (3 - pCan) + "C" + (1 - pBot) + "B ______________" + pMis + "M" +
                    pCan + "C" + pBot );
            return true;
        }
        else if ((pMis == 3) & (pCan == 3) & (pBot== 1)){   //Funcion de fallo
            System.out.println((pMis - 3) + "M" + (pCan - 3) + "C" + (pBot - 1) + "B ______________" + pMis + "M" + pCan
                    + "C" + pBot );
            return moverMisionerosYCanibales(pMis, pCan - 2, pBot - 1);
        }
        pBot = 1;                                         //Condicion root o first
        for (int i = 1; i > 0; i--){                      //Condicion o funcion next 
            if (pMis == 3){
                pBot  = pBot - 1;
                System.out.println((3 - pMis) + "M" + (3 - pCan) + "C" + (1 - pBot) + "B ______________" + pMis + "M" +
                        pCan + "C" + pBot );
                pCan = pCan + 1;
                pBot = pBot + 1;
                System.out.println((3 - pMis) + "M" + (3 - pCan) + "C" + (1 - pBot) + "B ______________" + pMis + "M" +
                        pCan + "C" + pBot );
                pCan -= 2;
                pBot -= 1;
                System.out.println((3 - pMis) + "M" + (3 - pCan) + "C" + (1 - pBot) + "B ______________" + pMis + "M" +
                        pCan + "C" + pBot );
                pCan += 1;
                pBot += 1;
                System.out.println((3 - pMis) + "M" + (3 - pCan) + "C" + (1 - pBot) + "B ______________" + pMis + "M" +
                        pCan + "C" + pBot );
                return moverMisionerosYCanibales(pMis - 2, pCan, pBot);
            }
            if (pMis == 1){
                pBot -= 1;
                System.out.println((3 - pMis) + "M" + (3 - pCan) + "C" + (1 - pBot) + "B ______________" + pMis + "M" +
                        pCan + "C" + pBot );
                return moverMisionerosYCanibales(pMis + 1, pCan + 1, pBot);
            }
            if (pMis == 2){
                System.out.println((3 - pMis) + "M" + (3 - pCan) + "C" + (1 - pBot) + "B ______________" + pMis + "M" +
                        pCan + "C" + pBot );
                return moverMisionerosYCanibales(pMis - 2, pCan, pBot);
            }
            if (pMis == 0){
                pBot -= 1;
                System.out.println((3 - pMis) + "M" + (3 - pCan) + "C" + (1 - pBot) + "B ______________" + pMis + "M" +
                        pCan + "C" + pBot );
                pCan += 1;
                pBot += 1;
                System.out.println((3 - pMis) + "M" + (3 - pCan) + "C" + (1 - pBot) + "B ______________" + pMis + "M" +
                        pCan + "C" + pBot );
                pCan -= 2;
                pBot -= 1;
                System.out.println((3 - pMis) + "M" + (3 - pCan) + "C" + (1 - pBot) + "B ______________" + pMis + "M" +
                        pCan + "C" + pBot );
                pCan += 1;
                pBot += 1;
                System.out.println((3 - pMis) + "M" + (3 - pCan) + "C" + (1 - pBot) + "B ______________" + pMis + "M" +
                        pCan + "C" + pBot );
                pCan -= 2;
                pBot -= 1;
                return moverMisionerosYCanibales(pMis, pCan, pBot);
            }
        }
        return false;
    }

    public static void main(String[] args) {                  //Metodo main o principal. Metodo de prueba o inicio del algoritmo
        misionerosycanibales min1 = new misionerosycanibales();
        min1.moverMisionerosYCanibales(3, 3, 1);
    }
}
