(ns clojure99problems.core)

(defn compress
    "remove duplicates from list"
    [coll]
    (if (empty? coll)
        '()
        (let [[head second & tail] coll]
            (if (= head second)
                (conj (compress tail) second)
                (conj (compress (conj tail second)) head)
            )
        )
    )
)

(compress '(1 1 1 1 2 2 3 3 4 4 4))