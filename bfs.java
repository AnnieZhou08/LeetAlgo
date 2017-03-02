static int[][] my_graph = new int[][]{
        {1,0,1,1,0},
        {1,0,0,0,1},
        {1,1,0,0,0},
        {0,0,0,0,0},
        {0,1,0,0,0}
    };
    
    /**
     *
     * @param graph
     * @param n
     * @return
     */
    
    static ArrayList<Integer> queue = new ArrayList<Integer>();
    
    public static void my_bfs(int[][]graph){
        boolean[] visited = new boolean[graph.length];
        Arrays.fill(visited, false);
        bfs(graph, 0, visited);
    }
    
    public static void bfs(int [][]graph, int i, boolean[] visited){
      for(int j = 0; j < graph[i].length; j++){
        if(!visited[j] && graph[i][j] == 1){
            System.out.println(j);
            visited[j] = true;
            queue.add(j);
        }
      }
      if(queue.isEmpty()){
        return;
      }
      i = queue.get(0);
      queue.remove(0);
      bfs(graph, i, visited);
    }