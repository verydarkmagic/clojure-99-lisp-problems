(ns clojure99problems.core)

(defn my-count
    "1 problem"
    ([coll] 
        (my-count coll 0))
    ([[head & tail] n] 
        (if (nil? head)
            n
            (recur tail, (inc n)))))