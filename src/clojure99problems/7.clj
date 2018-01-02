(ns clojure99problems.core)

(defn my-flatten
    "flatten nested list"
    [coll]
    (if (empty? coll)
        '()
        (let [[head & tail] coll]
            (if (seq? head)
                (concat (my-flatten head) (my-flatten tail))
                (conj (my-flatten tail) head)))))