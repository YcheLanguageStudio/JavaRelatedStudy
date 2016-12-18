import networkx as nx


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


class PrimePathSolver:
    def __init__(self, graph_name='graph.txt'):
        self.start_nodes, self.end_nodes, self.graph = read_graph_properties(graph_name)
        self.prime_path_list = []

    def is_prime_path(self, path):
        if len(path) < 2:
            return False
        elif path[0] == path[-1] or path[0] in self.start_nodes and path[-1] in self.end_nodes:
            return True
        elif path[0] in self.start_nodes and len(self.expand_path(path))==0:
            return True
        else:
            return False

    def is_going_expand(self, path):
        if self.is_prime_path(path) or path[-1] in self.end_nodes:
            return False
        else:
            return True

    def expand_path(self, path):
        path_list = []
        expand_nodes = map(lambda edge: edge[1], self.graph.edges(path[-1]))

        for node in expand_nodes:
            if node not in path or node == path[0]:
                path_list.append(path + [node])
        return path_list

    def breadth_first_search(self):
        # init
        path_list = map(lambda ele: [ele], self.graph.nodes())

        while len(path_list) > 0:
            self.prime_path_list.extend(filter(lambda ele: self.is_prime_path(ele), path_list))
            print len(path_list)
            path_list = filter(lambda ele: self.is_going_expand(ele), path_list)
            print len(path_list)
            path_list = reduce(lambda l, r: l + r, map(lambda ele: self.expand_path(ele), path_list), [])
            print 'reduced one:', path_list
        return self.prime_path_list


if __name__ == '__main__':
    print PrimePathSolver().breadth_first_search()
