package com.lfh.mock.backTracking;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * 难点： 1.一个行程中，航班信息可能出现死循环。2.如何让字母在前的排序靠前，记录映射关系，3使用回溯法，中止条件是什么，4.搜索的过程中，如何遍历一个机场所对应的所有机场。
 */
public class FindItinerary {

    Deque<String> res = new LinkedList<>();
    Map<String, Map<String, Integer>> map = new HashMap<>();

    public List<String> findItinerary(List<List<String>> tickets) {

        for (List<String> ticket : tickets) {
            Map<String, Integer> target;
            if (map.containsKey(ticket.get(0))) {

                target = map.get(ticket.get(0));
                target.put(ticket.get(1), target.getOrDefault(ticket.get(1), 0) + 1);
            } else {
                target = new TreeMap<>();
                target.put(ticket.get(1), 1);
            }

            map.put(ticket.get(0), target);
        }
        res.add("JFK");
        backTracking(tickets.size());
        return new ArrayList<>(res);
    }

    private boolean backTracking(int size) {
        if (res.size() == size + 1) {
            return true;
        }
        String last = res.getLast();
        if (map.containsKey(last)) {
            for (Map.Entry<String, Integer> target : map.get(last).entrySet()) {
                int count = target.getValue();
                if (count > 0) {
                    res.add(target.getKey());
                    target.setValue(count - 1);
                    if (backTracking(size)) {
                        return true;
                    }
                    res.removeLast();
                    target.setValue(count);
                }
            }

        }
        return false;
    }
}
