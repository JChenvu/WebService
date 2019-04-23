# -*- coding: utf-8 -*-
"""
Created on Mon Apr 22 17:05:05 2019

@author: admin
"""
from pygraph.classes.digraph import digraph

class PRIterator:

    def __init__(self, dg):
        self.damping_factor = 0.85  
        self.max_iterations = 10  
        self.min_delta = 0.00001 
        self.graph = dg

    def page_rank(self):
        for node in self.graph.nodes():
            if len(self.graph.neighbors(node)) == 0:
                for node2 in self.graph.nodes():
                    digraph.add_edge(self.graph, (node, node2))

        nodes = self.graph.nodes()
        graph_size = len(nodes)

        if graph_size == 0:
            return {}
        page_rank = dict.fromkeys(nodes, 1.0)  
        damping_value = 1.0 - self.damping_factor 

        flag = False
        for i in range(self.max_iterations):
            change = 0
            for node in nodes:
                rank = 0
                print(self.graph.incidents(node))
                print('begin')
                for incident_page in self.graph.incidents(node):  
                    print(incident_page)
                    rank += self.damping_factor * (page_rank[incident_page] / len(self.graph.neighbors(incident_page)))
                    print((page_rank[incident_page]))
                    print(len(self.graph.neighbors(incident_page)))
                    print("_______________________________")
                rank += damping_value
                change += abs(page_rank[node] - rank) 
                page_rank[node] = rank

            print("This is NO.%s iteration" % (i + 1))
            print(page_rank)

            if change < self.min_delta:
                flag = True
                break
        if flag:
            print("finished in %s iterations!" % node)
        else:
            print("finished out of 10 iterations!")
        return page_rank
    
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
    pr = PRIterator(dg)
    page_ranks = pr.page_rank()
    print("The final page rank is\n", page_ranks)
