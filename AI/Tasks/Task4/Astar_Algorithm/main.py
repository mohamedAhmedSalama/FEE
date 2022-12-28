# MID Exam
graph = {
    'A': [('F', 3), ('B', 6)],
    'B': [('D', 2), ('C', 3)],
    'F': [('G', 1), ('H', 7)],
    'D': [('C', 1), ('E',8)],
    'C': [('E', 5)],
    'E': [('J', 5)],
    'G': [('I', 3)],
    'H': [('I', 2)],
    'I': [('J', 3), ('E', 5)]
}
H_table = {
    'A': 10,
    'B': 8,
    'F': 6,
    'D': 7,
    'C': 5,
    'E': 3,
    'G': 5,
    'H': 3,
    'I': 1,
    'J': 0
}


def path_f_cost(path):
    g_cost = 0
    for (node, cost) in path:
        g_cost += g_cost
    last_node = path[-1][0]
    h_cost = H_table[last_node]
    f_cost = g_cost + h_cost
    return f_cost, last_node


def a_star_search(graph, start, goal): # function for A*
    visited = []   # List for visited nodes.
    queue = [[(start, 0)]]  # Initialize a queue
    while queue:    # Creating loop to visit each node
        queue.sort(key=path_f_cost)  # sorting by f_cost
        path = queue.pop(0)            # choosing least f_cost
        node = path[-1][0]
        if node in visited:
            continue
        visited.append(node)
        if node == goal:
            return path
        else:
            adjacent_nodes = graph.get(node, [])
            for (node2, cost) in adjacent_nodes:
                new_path = path.copy()
                new_path.append((node2, cost))
                queue.append(new_path)


solution = a_star_search(graph, 'A', 'J')   # function calling
print("Following is the A* search")
for i in range(0, len(solution), 1):
    print(solution[i][0], end="\t")
