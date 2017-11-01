(ns clojure99problems.core)

(defn before-last
    "returns the 2nd element from behind"
    [[head second & tail]]
        (if (empty? tail)
            head
            (recur (conj tail second))))