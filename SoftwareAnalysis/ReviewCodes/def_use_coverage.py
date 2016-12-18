import networkx as nx


class DefUseSolver:
    @staticmethod
    def read_graph_properties(graph_name, def_use_name):
        with open(graph_name) as ifs:
            lines = ifs.readlines()
            start_nodes = set(map(int, lines[0].strip().split()))
            end_nodes = set(map(int, lines[1].strip().split()))
            edges = map(lambda ele: map(int, ele.strip().split()), lines[2:])
            graph = nx.DiGraph()
            for edge in edges:
                graph.add_edge(edge[0], edge[1])
        with open(def_use_name) as ifs:
            lines = ifs.readlines()
            def_nodes = set(map(int, lines[0].strip().split()))
            use_nodes = set(map(int, lines[1].strip().split()))
        return start_nodes, end_nodes, graph, def_nodes, use_nodes

    def __init__(self, graph_name='graph_1.txt', def_use_name='def_use_info_graph1.txt'):
        self.start_nodes, self.end_nodes, self.graph, self.def_nodes, self.use_nodes = self.read_graph_properties(
            graph_name, def_use_name)
        self.du_path = []
        print self.def_nodes

    def get_du_paths(self):
        return self.du_path


if __name__ == '__main__':
    DefUseSolver()
