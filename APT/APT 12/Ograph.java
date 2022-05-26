import java.util.*;

public class Ograph {
    Map<Integer, Set<Integer>> myGraph = new HashMap<>();
    public int[] components(String[] data) {
        // write code here
        initializeGraph(data);
        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();
        for (int k = 0; k < data.length; k++) {
            if (!visited.contains(k)){
                Set<Integer> reached = dfs(k);
                list.add(reached.size());
                visited.addAll(reached);
            }
        }
        int[] ret = new int[list.size()];
        Collections.sort(list);
        for (int k = 0; k < list.size(); k++) {
            ret[k] = list.get(k);
        }
        return ret;
    }

    private void initializeGraph(String[] data) {
        for (int k = 0; k < data.length; k++) {
            myGraph.put(k, new HashSet<>());
        }
        for (int k = 0; k < data.length; k++) {
            String[] s = data[k].split(" ");
            for (String adj : s) {
                myGraph.get(k).add(Integer.parseInt(adj));
            }
        }
    }
    
    private Set<Integer> dfs(int vertex) {
        Set<Integer> visited = new HashSet<>();
        Stack<Integer> st = new Stack<>();
        st.push(vertex);
        visited.add(vertex);
        while (st.size() > 0) {
            vertex = st.pop();
            for (Integer adj : myGraph.get(vertex)) {
                if (!visited.contains(adj)){
                    visited.add(adj);
                    st.push(adj);
                }
            }
        }
        return visited;
    }
}
