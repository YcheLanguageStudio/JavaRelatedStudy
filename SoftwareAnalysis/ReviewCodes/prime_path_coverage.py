import networkx as nx


class PrimePathSolver:
    @staticmethod
    def read_graph_properties(graph_name):
        with open(graph_name) as ifs:
            lines = ifs.readlines()
            start_nodes = set(map(int, lines[0].strip().split()))
            end_nodes = set(map(int, lines[1].strip().split()))
            edges = map(lambda ele: map(int, ele.strip().split()), lines[2:])
            graph = nx.DiGraph()
            for edge in edges:
                graph.add_edge(edge[0], edge[1])
        return start_nodes, end_nodes, graph

    @staticmethod
    def is_loop(path):
        return path[0] == path[-1]

    def __init__(self, graph_name='dataset/graph.txt'):
        self.start_nodes, self.end_nodes, self.graph = self.read_graph_properties(graph_name)
        self.prime_path_list = []

    def is_prime_path(self, path):
        if len(path) > 2 and self.is_loop(path):
            return True
        elif self.is_reaching_head(path) and self.is_reaching_end(path):
            return True
        else:
            return False

    def is_reaching_head(self, path):
        expand_nodes = map(lambda edge: edge[0], self.graph.in_edges(path[0]))
        for node in expand_nodes:
            if node not in path or node == path[-1]:
                return False
        return True

    def is_reaching_end(self, path):
        expand_nodes = map(lambda edge: edge[1], self.graph.out_edges(path[-1]))
        for node in expand_nodes:
            if node not in path or node == path[0]:
                return False
        return True

    def is_going_expand(self, path):
        if self.is_prime_path(path) or self.is_reaching_end(path):
            return False
        else:
            return True

    def expand_path(self, path):
        path_list = []
        expand_nodes = map(lambda edge: edge[1], self.graph.out_edges(path[-1]))

        for node in expand_nodes:
            if node not in path or node == path[0]:
                path_list.append(path + [node])
        return path_list

    def breadth_first_search(self):
        path_list = map(lambda ele: [ele], self.graph.nodes())
        while len(path_list) > 0:
            self.prime_path_list.extend(filter(lambda ele: self.is_prime_path(ele), path_list))
            path_list = filter(lambda ele: self.is_going_expand(ele), path_list)
            path_list = reduce(lambda l, r: l + r, map(lambda ele: self.expand_path(ele), path_list), [])
            print 'reduced one:', path_list

    def get_prime_path(self):
        self.breadth_first_search()
        return self.prime_path_list


if __name__ == '__main__':
    print 'prime path list:' + str(PrimePathSolver(graph_name='dataset/graph.txt').get_prime_path())
    print 'prime path list:' + str(len(PrimePathSolver(graph_name='dataset/graph_fmt_rewrap.txt').get_prime_path()))
