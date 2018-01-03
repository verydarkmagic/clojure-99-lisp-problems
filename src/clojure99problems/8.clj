(ns clojure99problems.core)

(defn compress
    "remove duplicates from list"
    [[head & tail]]
    (if (empty? tail)
        (list head)
        (if (= head (first tail))
            (compress tail)
            (conj (compress tail) head)
        )
    )
)