class RotationTableau {
    //Fonction de rotation
    static void Rotation(int arr[], int n, int d){

        // Stockage de la version pivotée du tableau
        int[] temp = new int[n];

        //Garder une trace de l'index actuel de temp[]
        int k=0;

        //Stockage des n - d éléments de tableau arr[] dans temp[]
        for (int i = d; i < n ; i++) {
            temp[k]=arr[i];
            k++;
        }
        //Stockage des d premiers elements du tableau arr[] dans temp
        for (int i = 0; i < d ; i++) {
            temp[k] = arr[i];
            k++;
        }
        // Copie des éléments de temp[] dans arr[]
        // pour obtenir le tableau pivoté final
        for (int i = 0; i <n ; i++) {
            arr[i] = temp[i];
        }

    }
    static  void ImprimeTableau(int arr[], int n){
        for (int i = 0; i <n ; i++) {
            System.out.println(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] ={1, 2, 3, 4, 5, 6, 7};
        int N = arr.length;
        int d=1;

        Rotation(arr,d,N);
        ImprimeTableau(arr,N);
    }
}