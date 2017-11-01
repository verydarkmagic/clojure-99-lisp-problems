(ns clojure99problems.core)

(defn my-last
    "1 problem"
    [[head & tail]]
        (if (empty? tail)
            head
            (recur tail)))