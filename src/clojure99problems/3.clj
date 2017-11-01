(ns clojure99problems.core)

(defn kth
    "returns k-th element of collection"
    [[head & tail] n]
    (if (= n 0)
        head
        (recur tail (dec n))))

