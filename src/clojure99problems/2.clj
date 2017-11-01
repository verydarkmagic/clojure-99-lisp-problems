(ns clojure99problems.core)

(defn before-last
    "2 problem"
    [[head second & tail]]
        (if (empty? tail)
            head
            (recur (conj tail second))))