(ns clojure99problems.core)

(defn my-last
    "returns last element of list"
    [[head & tail]]
        (if (empty? tail)
            head
            (recur tail)))