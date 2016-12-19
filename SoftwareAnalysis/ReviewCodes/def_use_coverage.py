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

    @staticmethod
    def is_loop(path):
        return path[0] == path[-1]

    def __init__(self, graph_name='dataset/graph_1.txt', def_use_name='dataset/def_use_info_graph1.txt'):
        self.start_nodes, self.end_nodes, self.graph, self.def_nodes, self.use_nodes = self.read_graph_properties(
            graph_name, def_use_name)
        self.du_path = []

    def is_du_path(self, path):
        if path[0] in self.def_nodes and path[-1] in self.use_nodes:
            return True
        else:
            return False

    def is_reaching_end(self, path):
        expand_nodes = map(lambda edge: edge[1], self.graph.out_edges(path[-1]))
        for node in expand_nodes:
            if node not in path:
                return False
        return True

    def is_going_expand(self, path):
        if len(path) < 2:
            return True
        elif not self.is_reaching_end(path) and path[-1] not in self.def_nodes:
            return True
        else:
            return False

    def expand_path(self, path):
        path_list = []
        expand_nodes = map(lambda edge: edge[1], self.graph.out_edges(path[-1]))

        for node in expand_nodes:
            if node not in path or node == path[0]:
                path_list.append(path + [node])
        return path_list

    def breadth_first_search(self):
        path_list = map(lambda ele: [ele], self.def_nodes)
        while len(path_list) > 0:
            self.du_path.extend(filter(lambda ele: self.is_du_path(ele), path_list))
            path_list = filter(lambda ele: self.is_going_expand(ele), path_list)
            path_list = reduce(lambda l, r: l + r, map(lambda ele: self.expand_path(ele), path_list), [])
            print 'reduced one:', path_list

    def get_du_paths(self):
        self.breadth_first_search()
        self.du_path.sort()
        return self.du_path


if __name__ == '__main__':
    print 'du-path list:'+str(DefUseSolver(graph_name='dataset/graph_1.txt', def_use_name='dataset/def_use_info_graph1.txt').get_du_paths())+'\n'
    print 'du-path list:'+str(DefUseSolver(graph_name='dataset/graph_3.txt', def_use_name='dataset/def_use_info_graph3.txt').get_du_paths())
