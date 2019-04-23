# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""
from pygraph.classes.digraph import digraph
import itertools
class MapReduce:

    @staticmethod
    def map_reduce(i, mapper, reducer):

        intermediate = []  
        for (key, value) in i.items():
            intermediate.extend(mapper(key, value))
        groups = {}
        for key, group in itertools.groupby(sorted(intermediate, key=lambda im: im[0]), key=lambda x: x[0]):
            groups[key] = [y for x, y in group]

        return [reducer(intermediate_key, groups[intermediate_key]) for intermediate_key in groups]

class PRMapReduce:

    def __init__(self, dg):
        self.damping_factor = 0.85  
        self.max_iterations = 10  
        self.min_delta = 0.00001  
        self.num_of_pages = len(dg.nodes())  

        self.graph = {}
        for node in dg.nodes():
            self.graph[node] = [1.0, len(dg.neighbors(node)), dg.neighbors(node)]

    def pr_mapper(self, input_key, input_value):
        #print([(input_key, 0.0)] + [(out_link, input_value[0] / input_value[1]) for out_link in input_value[2]])
        return [(input_key, 0.0)] + [(out_link, input_value[0] / input_value[1]) for out_link in input_value[2]]
        
    def pr_reducer_inter(self, intermediate_key, intermediate_value_list):
        return (intermediate_key,
                self.damping_factor * sum(intermediate_value_list) + (1.0 - self.damping_factor))

    def page_rank(self):
        iteration = 1 
        while iteration <= self.max_iterations:
            print("Iteration: " + str(iteration))
            new_pr = MapReduce.map_reduce(self.graph, self.pr_mapper, self.pr_reducer_inter)
            for i in range(self.num_of_pages):
                self.graph[new_pr[i][0]][0] = new_pr[i][1]
            iteration += 1
        return self.graph
    
if __name__ == '__main__':
    dg = digraph()
    nodes = set()
    edges = []
    f = open("C:/Users/admin/Desktop/web service/web-BerkStan.txt", "r")
    for line in f:
        row = line.strip('\n').split('\t')
        edges.append(tuple(row))
        for each in row:
            nodes.add(each)
    nodes = list(nodes)
    dg.add_nodes(nodes)
    for each in edges:
        dg.add_edge(each)
    pr = PRMapReduce(dg)
    page_ranks = pr.page_rank()

    print("The final page rank is")
    for key, value in page_ranks.items():
        print(key + " : ", value[0])
