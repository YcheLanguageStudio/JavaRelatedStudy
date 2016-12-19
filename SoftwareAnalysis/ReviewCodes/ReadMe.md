#Review Codes
##Prime Path Coverage
- Code is: [prime_path_coverage.py](prime_path_coverage.py)

- Implementation, Core is as follows

```python
    def breadth_first_search(self):
        path_list = map(lambda ele: [ele], self.graph.nodes())
        while len(path_list) > 0:
            self.prime_path_list.extend(filter(lambda ele: self.is_prime_path(ele), path_list))
            path_list = filter(lambda ele: self.is_going_expand(ele), path_list)
            path_list = reduce(lambda l, r: l + r, map(lambda ele: self.expand_path(ele), path_list), [])
            print 'reduced one:', path_list
```

```python
    def is_prime_path(self, path):
        if len(path) > 2 and self.is_loop(path):
            return True
        elif self.is_reaching_head(path) and self.is_reaching_end(path):
            return True
        else:
            return False
```

```python
    def is_going_expand(self, path):
        if self.is_prime_path(path) or self.is_reaching_end(path):
            return False
        else:
            return True
```

```python
    def expand_path(self, path):
        path_list = []
        expand_nodes = map(lambda edge: edge[1], self.graph.out_edges(path[-1]))

        for node in expand_nodes:
            if node not in path or node == path[0]:
                path_list.append(path + [node])
        return path_list
```

- Execution 

```zsh
reduced one: [[0, 1], [0, 2], [1, 2], [2, 3], [2, 4], [3, 6], [4, 5], [4, 6], [5, 4]]
reduced one: [[0, 1, 2], [0, 2, 3], [0, 2, 4], [1, 2, 3], [1, 2, 4], [2, 3, 6], [2, 4, 5], [2, 4, 6], [4, 5, 4], [5, 4, 5], [5, 4, 6]]
reduced one: [[0, 1, 2, 3], [0, 1, 2, 4], [0, 2, 3, 6], [0, 2, 4, 5], [0, 2, 4, 6], [1, 2, 3, 6], [1, 2, 4, 5], [1, 2, 4, 6]]
reduced one: [[0, 1, 2, 3, 6], [0, 1, 2, 4, 5], [0, 1, 2, 4, 6]]
reduced one: []
prime path list:[[4, 5, 4], [5, 4, 5], [5, 4, 6], [0, 2, 3, 6], [0, 2, 4, 5], [0, 2, 4, 6], [0, 1, 2, 3, 6], [0, 1, 2, 4, 5], [0, 1, 2, 4, 6]]
```

##Def-Use Path Coverage
- Code is: [def_use_coverage.py](def_use_coverage.py)

- Implementation, similar to [prime_path_coverage.py](prime_path_coverage.py)

- Execution

```zsh
reduced one: [[0, 1], [3, 2]]
reduced one: [[0, 1, 2], [0, 1, 7], [3, 2, 3], [3, 2, 4]]
reduced one: [[0, 1, 2, 3], [0, 1, 2, 4], [3, 2, 4, 5], [3, 2, 4, 6]]
reduced one: [[0, 1, 2, 4, 5], [0, 1, 2, 4, 6], [3, 2, 4, 5, 6], [3, 2, 4, 6, 1]]
reduced one: [[0, 1, 2, 4, 5, 6], [3, 2, 4, 5, 6, 1], [3, 2, 4, 6, 1, 7]]
reduced one: [[3, 2, 4, 5, 6, 1, 7]]
reduced one: []
du-path list:[[0, 1, 2, 4, 5], [0, 1, 7], [3, 2, 4, 5], [3, 2, 4, 5, 6, 1, 7], [3, 2, 4, 6, 1, 7]]

reduced one: [[1, 2], [4, 5]]
reduced one: [[1, 2, 3], [1, 2, 6], [4, 5, 2]]
reduced one: [[1, 2, 3, 4], [1, 2, 3, 5], [4, 5, 2, 3], [4, 5, 2, 6]]
reduced one: []
du-path list:[[1, 2, 3], [1, 2, 3, 5], [1, 2, 6], [4, 5], [4, 5, 2, 3], [4, 5, 2, 6]]
```