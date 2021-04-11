public class Main {
    public static void main(String[] args) {

        int [] v1 = {21,4,6,10,11};

        int [] v2 = {2,3,5,7,8};

        int v3 [] = new int[v1.length + v2.length];


        //Imprime v1
        for(int i = 0; i < v1.length ; i++) {
            System.out.print(v1[i] + " ");

        }
        System.out.println();


        //Imprime v2
        for(int i = 0; i < v2.length; i++) {
            System.out.print(v2[i] + " ");

        }
        System.out.println();
        System.out.println();




        for(int i = 0; i < v1.length; i++) {
            v3[i] = v1[i];
        }
        for(int i = 0, j = v1.length; i < v2.length; i++, j++) {
            v3[j] = v2[i];

        }


        int menor = 0;

        System.out.println("Lista desordenada");
        for (int i = 0; i < v3.length; i ++) {
            System.out.print(v3[i] + " ");
        }
        System.out.println();
        System.out.println();


        //resultado
        System.out.println("Lista ordenada");
        for(int i = 0; i < v3.length; i++) {
            menor = v3[i];

            for (int j = i + 1; j < v3.length; j ++) {

                //si el numero izquierdo es menor que el numero derecho
                //los intercambiamos de lugares
                if (v3[j] < v3[i]) {
                    menor = v3[j];
                    v3[j] = v3[i];
                    v3[i] = menor;
                }
            }
        }


        for(int i = 0; i < v3.length; i++) {
            System.out.print(v3[i] + " ");
        }

    }
}

