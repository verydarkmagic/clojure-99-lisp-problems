(ns clojure99problems.core)

(defn my-reverse
    "5 problem"
    [coll]
    (reduce conj '() coll))