package mar232023;

 class NumberOfOperationsToMakeNetworkConnected {
     public int makeConnected(int n, int [][] connections){
         if (connections.length < n - 1) {
             return -1;
         }

         int[] parent = new int[n];
         for (int i = 0; i < n; i++) {
             parent[i] = i;
         }

         for (int[] connection : connections) {
             int u = connection[0];
             int v = connection[1];
             int pu = find(parent, u);
             int pv = find(parent, v);
             if (pu != pv) {
                 parent[pu] = pv;
             }
         }

         int components = 0;
         for (int i = 0; i < n; i++) {
             if (parent[i] == i) {
                 components++;
             }
         }

         return components - 1;
     }

     private int find(int[] parent, int x) {
         if (parent[x] != x) {
             parent[x] = find(parent, parent[x]);
         }
         return parent[x];
     }
}
